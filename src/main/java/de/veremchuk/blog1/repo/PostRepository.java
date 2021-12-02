package de.veremchuk.blog1.repo;

import de.veremchuk.blog1.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
