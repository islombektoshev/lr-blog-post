package uz.owl.blogpost.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.blogpost.embedebel.FollowerEmbedebleId;
import uz.owl.blogpost.entity.Follower;

@Repository
public interface FollowerRepository extends CrudRepository<Follower, FollowerEmbedebleId> {
}
