package uz.owl.blogpost.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uz.owl.blogpost.embedebel.PostEmbedebelId;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private PostEmbedebelId postEmbedebelId;
    @Lob
    private String postBody;
    @CreationTimestamp
    private LocalDateTime createdDate;
    @UpdateTimestamp
    private LocalDateTime updatedDate;
    private String post_img_url;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "postEmbedebelId")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "postViewEmbedebelId.postEmbedebelId")
    private List<PostView> postViews = new ArrayList<>();

    public Post(String username, String postbody){
        this.postBody = postbody;
        postEmbedebelId = new PostEmbedebelId();
        postEmbedebelId.setUsername(username);
    }

}
