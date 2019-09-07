package uz.owl.blogpost.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.blogpost.embedebel.PostViewEmbedebelId;
import uz.owl.blogpost.entity.PostView;

@Repository
public interface PostViewRepository extends CrudRepository<PostView, PostViewEmbedebelId> {
}
