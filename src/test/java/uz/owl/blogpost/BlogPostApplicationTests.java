package uz.owl.blogpost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uz.owl.blogpost.dao.PostDAO;
import uz.owl.blogpost.dao.PostRepository;
import uz.owl.blogpost.dao.UserRepository;
import uz.owl.blogpost.entity.Post;
import uz.owl.blogpost.entity.User;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogPostApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostDAO postDAO;

    @Autowired
    EntityManager em;

    @Test
    @Transactional()
    public void contextLoads() {
        User user = userRepository.findByUsername("islom");
        print(user);
        Post post = new Post(user.getUsername(), "salom hammaga");
        em.persist(post);
        em.flush();

        user.addPost(post);
        userRepository.save(user);
        user = userRepository.findByUsername("islom");
        print(user.getPosts());

        Iterable<Post> posts = postRepository.findAll();
        posts.forEach(BlogPostApplicationTests::print);
    }


    public static void print(Object o){
        System.out.println("Application:    " + o.toString());
    }

}
