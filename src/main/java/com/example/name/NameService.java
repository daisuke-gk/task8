package com.example.name;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class NameService {

    private final NameMapper nameMapper;

    public NameService(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> getNames(String startsWith) {
        if (startsWith == null) {
            return nameMapper.findAll();

        } else {
            return nameMapper.findByNameStartingWith(startsWith);
        }

    }

}
