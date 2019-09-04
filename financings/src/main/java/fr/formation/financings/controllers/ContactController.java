package fr.formation.financings.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.services.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;

    @PostMapping
    protected void create(@Valid @RequestBody ContactDto contactDto) {
	contactService.create(contactDto);
    }
}
