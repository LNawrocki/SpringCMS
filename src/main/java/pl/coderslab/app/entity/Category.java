package pl.coderslab.app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Configuration
@Entity
@Getter
@Setter
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
