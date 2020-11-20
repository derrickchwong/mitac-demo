package com.example.mitacdemo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findAllByName(String name);

    @Query("select c from Contact c where lower(c.name) = ?1")
    List<Contact> findAllByNameCaseInsensitive(String name);
}
