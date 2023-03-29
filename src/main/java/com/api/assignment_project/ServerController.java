package com.api.assignment_project;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    private final ServerRepository server_repo;

    ServerController(ServerRepository server_repo) {
        this.server_repo = server_repo;
    }

    @GetMapping("/servers")
    List<Server> all() {
        var result = server_repo.getAllServers(); 
        if(result == null) throw new ServerNotFoundException("0");
        return server_repo.getAllServers();
    }

    @GetMapping("/servers/{id}")
    Server getServer(@PathVariable String id) {
        var result = server_repo.getSeverById(id);

        if(result == null) throw new ServerNotFoundException(id);

        return result; 
    }

    @PutMapping("/servers")
    void addServer(@RequestBody Server newServer) {
        server_repo.save(newServer);
    }

    @DeleteMapping("/servers/{id}")
    void deleteServer(@PathVariable String id) {
        server_repo.deleteById(id);
    }
}
