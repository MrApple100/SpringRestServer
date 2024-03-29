package org.example.controller;

import org.example.model.Message;
import org.example.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("message")
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageRepository messageRepository;

    @GetMapping
    public List<Message> getAllMessages(){return (List<Message>) messageRepository.findAll();}

    @GetMapping("{id}")
    public Message getMessage(@PathVariable int id) {
        return messageRepository.findMessageById(id);
    }

    @PostMapping()
    public Message createProduct(@RequestBody Message message) {
        return messageRepository.saveAndFlush(message);
    }

    @PutMapping("{id}")
    public Message updateProduct(@PathVariable int id, @RequestBody Message message) {
        message.setId(id);
        return messageRepository.saveAndFlush(message);
    }

    @DeleteMapping("{id}")
    public Message deleteProduct(@PathVariable int id) {
        Message message = messageRepository.findMessageById(id);
        messageRepository.delete(message);
        return message;
    }


}
