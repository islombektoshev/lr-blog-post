package uz.owl.blogpost.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uz.owl.blogpost.embedebel.PostEmbedebelId;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;

    @Embedded
    private PostEmbedebelId postEmbedebelId;

    @ManyToOne
    private Post post;

    @Lob
    private String comment_body;
    private String comenter;

    @CreationTimestamp
    private LocalDateTime createdDate;
    @UpdateTimestamp
    private LocalDateTime updatedDate;


    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public PostEmbedebelId getPostEmbedebelId() {
        return postEmbedebelId;
    }

    public void setPostEmbedebelId(PostEmbedebelId postEmbedebelId) {
        this.postEmbedebelId = postEmbedebelId;
    }

    public String getComment_body() {
        return comment_body;
    }

    public void setComment_body(String comment_body) {
        this.comment_body = comment_body;
    }

    public String getComenter() {
        return comenter;
    }

    public void setComenter(String comenter) {
        this.comenter = comenter;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
