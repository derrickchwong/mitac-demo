package com.example.mitacdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired ContactRepository contactRepository;


    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    public Optional<Contact> findContactById(Long id){
        return contactRepository.findById(id);
    }

    public Contact addContact(Contact contact){
        return contactRepository.save(contact);
    }

    public List<Contact> getContactsByName(String name){
        return contactRepository.findAllByNameCaseInsensitive(name.toLowerCase());
    }
}
