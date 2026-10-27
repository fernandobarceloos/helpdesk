package br.com.programacao.helpdesk.service;


import br.com.programacao.helpdesk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {


    private final UserRepository userRepository;

/*    public void CreateUser(User newUser) {

    }*/
}
