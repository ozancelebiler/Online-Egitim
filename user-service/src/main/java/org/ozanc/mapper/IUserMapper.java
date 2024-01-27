package org.ozanc.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.control.MappingControl;
import org.mapstruct.factory.Mappers;
import org.ozanc.dto.request.RegisterRequestDto;
import org.ozanc.dto.response.RegisterResponseDto;
import org.ozanc.repository.entity.User;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
// eşleşmeyen değerleri ignore et görmezden gel. spring componenetmodelde
public interface IUserMapper {


    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    User toUser(final RegisterRequestDto dto);

    RegisterResponseDto toRegisterResponseDto(final User user);





}
