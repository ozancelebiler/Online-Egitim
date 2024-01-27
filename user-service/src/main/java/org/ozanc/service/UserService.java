package org.ozanc.service;

import lombok.RequiredArgsConstructor;
import org.ozanc.dto.request.RegisterRequestDto;
import org.ozanc.dto.response.RegisterResponseDto;
import org.ozanc.mapper.IUserMapper;
import org.ozanc.repository.IUserRepository;
import org.ozanc.repository.entity.User;
import org.ozanc.repository.enums.ERole;
import org.ozanc.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long > {

    private final IUserRepository userRepository;


    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }


    public RegisterResponseDto register(RegisterRequestDto dto) {
        User user = IUserMapper.INSTANCE.toUser(dto);
        user.getRoles().add(ERole.STUDENT);
        save(user);
        return IUserMapper.INSTANCE.toRegisterResponseDto(user);

    }

    public Boolean addRole(Long id) {

        Optional<User> user = findById(id);
        if (user.isEmpty()) {
            return false;
        }
        else {
            user.get().getRoles().add(ERole.TEACHER);
            update(user.get());
            return true;
        }




    }

    public Boolean isTeacher(Long id) {

        Optional<User> user = findById(id);
        if (user.isPresent()){
            if (user.get().getRoles().contains(ERole.TEACHER)){
                return true;
            }

        }
            return false;
    }
}
