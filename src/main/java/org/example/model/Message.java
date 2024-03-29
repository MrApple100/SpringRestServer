package org.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "message")
@Data
@Table(name = "message")
public class Message {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "text")
    private String text;
    @Column(name = "author")
    private String author;

}
