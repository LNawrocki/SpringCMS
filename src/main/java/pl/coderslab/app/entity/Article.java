package pl.coderslab.app.entity;

import net.bytebuddy.asm.Advice;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToOne
    private Author author;
    @OneToMany
    @JoinColumn(name = "id_article")
    private List<Category> category;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;

}
