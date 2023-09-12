package pl.coderslab.app.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Controller
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private  String lastName;
}
