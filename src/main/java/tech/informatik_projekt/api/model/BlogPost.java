package tech.informatik_projekt.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String[] tags;

    public BlogPost(int id, String title, String content, String author, String creationDate, String imageUrl, String[] tags) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationDate = creationDate;
        this.imageUrl = imageUrl;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String[] getTags() {
        return tags;
    }

}