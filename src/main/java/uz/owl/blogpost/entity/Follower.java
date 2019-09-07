package uz.owl.blogpost.entity;

import org.hibernate.annotations.CreationTimestamp;
import uz.owl.blogpost.embedebel.FollowerEmbedebleId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Follower {

    @EmbeddedId
    private FollowerEmbedebleId followerEmbedebleId;
    @CreationTimestamp
    private LocalDateTime createdDate;

    @ManyToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FollowerEmbedebleId getFollowerEmbedebleId() {
        return followerEmbedebleId;
    }

    public void setFollowerEmbedebleId(FollowerEmbedebleId followerEmbedebleId) {
        this.followerEmbedebleId = followerEmbedebleId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
