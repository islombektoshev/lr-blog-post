package uz.owl.blogpost.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uz.owl.blogpost.embedebel.PostEmbedebelId;
import uz.owl.blogpost.entity.Post;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@Repository
public class PostDAO {
    @Autowired
    EntityManager em;

    public Post find(PostEmbedebelId postEmbedebelId){
        return em.find(Post.class, postEmbedebelId);
    }

    public void savePost(Post post){
        em.persist(post);
    }
}
