package uz.owl.blogpost.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uz.owl.blogpost.embedebel.PostViewEmbedebelId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class PostView {

    @EmbeddedId
    private PostViewEmbedebelId postViewEmbedebelId;

    private boolean liked;

    @CreationTimestamp
    private LocalDateTime createdDate;
    @UpdateTimestamp
    private LocalDateTime updatedDate;

    public PostViewEmbedebelId getPostViewEmbedebelId() {
        return postViewEmbedebelId;
    }

    public void setPostViewEmbedebelId(PostViewEmbedebelId postViewEmbedebelId) {
        this.postViewEmbedebelId = postViewEmbedebelId;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
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
