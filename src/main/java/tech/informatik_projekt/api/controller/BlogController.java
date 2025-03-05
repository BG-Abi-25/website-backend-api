package tech.informatik_projekt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.informatik_projekt.api.model.BlogPost;
import tech.informatik_projekt.api.repository.BlogPostRepository;

import java.util.List;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@RestController
@RequestMapping("/v1/blog")
public class BlogController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping("/post")
    public ResponseEntity<List<BlogPost>> getBlogPosts() {
        List<BlogPost> blogPosts = blogPostRepository.findAll();
        if (blogPosts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(blogPosts);
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<BlogPost> getBlogPostById(@PathVariable int postId) {
        BlogPost blogPost = blogPostRepository.findById(postId);
        if (blogPost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(blogPost);
    }

}