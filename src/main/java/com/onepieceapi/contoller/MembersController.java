package com.onepieceapi.contoller;

import com.onepieceapi.model.Members;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MembersController {
    @GetMapping("/pirates")
    public List<Members> getMembers() {
        List<Members> members = new ArrayList<>();

        // Adicione membros da tripulação
        members.add(new Members("Monkey D. Luffy", "Capitão dos Chapéus de Palha", "Capitão"));
        members.add(new Members("Roronoa Zoro", "Espadachim habilidoso", "Espadachim"));
        // Adicione os outros membros conforme necessário

        return members;
    }
}
