package tech.informatik_projekt.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@Document(collection = "blogPosts")
public class BlogPost {

    @Id
    private int id;
    private String title;
    private String content;
    private String author;
    private String creationDate;
    private String imageUrl;

}