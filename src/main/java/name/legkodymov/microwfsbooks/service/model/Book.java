package name.legkodymov.microwfsbooks.service.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
