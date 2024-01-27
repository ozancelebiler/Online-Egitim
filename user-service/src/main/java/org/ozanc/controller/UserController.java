package org.ozanc.controller;

import lombok.RequiredArgsConstructor;
import org.ozanc.dto.request.RegisterRequestDto;
import org.ozanc.repository.entity.User;
import org.ozanc.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterRequestDto dto){

    return ResponseEntity.ok(userService.register(dto));

    }

    @GetMapping("/findall")
    public ResponseEntity<List<User>> findAll(){

        return ResponseEntity.ok(userService.findAll());

    }


    @PostMapping("/addrole/{id}") // dışarıdan alınan id ye göre işlem yapma için {id} ve @PathVariable kullandık.

    public ResponseEntity<Boolean> addRole(@PathVariable Long id){
        return ResponseEntity.ok(userService.addRole(id));

    }


    @PostMapping("/isteacher/{id}")
    public ResponseEntity<Boolean> isTeacher(@PathVariable Long id){
        return ResponseEntity.ok(userService.isTeacher(id));


    }


}
