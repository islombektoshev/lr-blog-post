package uz.owl.blogpost.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.blogpost.embedebel.PostEmbedebelId;
import uz.owl.blogpost.entity.Post;
@Repository
public interface PostRepository extends CrudRepository<Post, PostEmbedebelId> {
}
