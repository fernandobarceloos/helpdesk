package br.com.programacao.helpdesk.dto;

public record CreateUserDto(

    String username,
    String password,
    String name,
    String email

) {
}
