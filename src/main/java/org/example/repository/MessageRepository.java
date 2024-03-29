package org.example.repository;

import org.example.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface MessageRepository extends JpaRepository<Message,Integer> {
   // List<Message> findMessageByAuthor(String author);
    Message findMessageById(int id);

}
