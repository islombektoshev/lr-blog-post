package uz.owl.blogpost.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String userImgUrl;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @OneToMany(cascade = CascadeType.PERSIST)
    private  List<Post> posts = new ArrayList<>();

    @OneToMany(targetEntity = Follower.class, mappedBy = "followerEmbedebleId.followed_username")
    private List<Follower> followers = new ArrayList<>();

    protected User(){}

    public User(String username, String password, String firstname, String lastname, String userImgUrl) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.userImgUrl = userImgUrl;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.firstname = null;
        this.lastname = null;
        this.userImgUrl = null;
    }

    public void addPost(Post post){
        posts.add(post);
    }
}
