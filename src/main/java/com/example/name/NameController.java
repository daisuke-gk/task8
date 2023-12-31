package com.example.name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameMapper nameMapper;

    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/allname")
    public List<Name> findAll() {
        return nameMapper.findAll();
    }

    @GetMapping("/names")
    public List<Name> findByNames(@RequestParam String startsWith) {
        return nameMapper.findByNameStartingWith(startsWith);
    }
}
