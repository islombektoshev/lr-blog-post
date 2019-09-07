package uz.owl.blogpost.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.blogpost.entity.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
