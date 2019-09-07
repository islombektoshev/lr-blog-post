package uz.owl.blogpost.embedebel;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class PostViewEmbedebelId implements Serializable {
    @Embedded
    private PostEmbedebelId postEmbedebelId;

    private String viwerUsername;

    public PostEmbedebelId getPostEmbedebelId() {
        return postEmbedebelId;
    }

    public void setPostEmbedebelId(PostEmbedebelId postEmbedebelId) {
        this.postEmbedebelId = postEmbedebelId;
    }

    public String getViwerUsername() {
        return viwerUsername;
    }

    public void setViwerUsername(String viwerUsername) {
        this.viwerUsername = viwerUsername;
    }
}
