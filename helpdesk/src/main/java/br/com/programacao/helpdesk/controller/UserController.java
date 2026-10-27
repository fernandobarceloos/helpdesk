package br.com.programacao.helpdesk.controller;

import br.com.programacao.helpdesk.dto.CreateUserDto;
import br.com.programacao.helpdesk.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {


    private final UserService userService;

    @PostMapping
    public ResponseEntity create(@RequestBody CreateUserDto request) {
        System.out.println("Usuario Criado!!!");
        return ResponseEntity.noContent().build();
    }
}
