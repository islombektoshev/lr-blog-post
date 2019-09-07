package uz.owl.blogpost.embedebel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostEmbedebelId implements Serializable {
    private String username;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;

    public PostEmbedebelId(String username){
        this.username = username;
    }
}

