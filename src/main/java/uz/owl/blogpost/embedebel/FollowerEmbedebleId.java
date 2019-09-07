package uz.owl.blogpost.embedebel;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FollowerEmbedebleId implements Serializable {
    private String follower_username;
    private String followed_username;

    public String getFollower_username() {
        return follower_username;
    }

    public void setFollower_username(String follower_username) {
        this.follower_username = follower_username;
    }

    public String getFollowed_username() {
        return followed_username;
    }

    public void setFollowed_username(String followed_username) {
        this.followed_username = followed_username;
    }
}
