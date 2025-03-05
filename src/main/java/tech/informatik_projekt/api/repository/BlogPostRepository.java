package tech.informatik_projekt.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.informatik_projekt.api.model.BlogPost;

import java.util.List;

@Repository
public interface BlogPostRepository extends MongoRepository<BlogPost, Integer> {
    List<BlogPost> findAll();
    BlogPost findById(int id);
}
