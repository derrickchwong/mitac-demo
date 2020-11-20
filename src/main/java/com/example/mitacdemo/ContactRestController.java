package com.example.mitacdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactRestController {
    @Autowired ContactService contactService;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return contactService.getAllContacts();
    }

    @PostMapping("/contact")
    public Contact newContact(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }

    @GetMapping("/contact/{id}")
    public Optional<Contact> getContactById(@PathVariable String id){
        return contactService.findContactById(Long.valueOf(id));
    }

    @GetMapping("/contact/name/{name}")
    public List<Contact> getContactsByName(@PathVariable String name){
        return contactService.getContactsByName(name);
    }
}
