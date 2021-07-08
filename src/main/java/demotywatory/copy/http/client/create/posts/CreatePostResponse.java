package demotywatory.copy.http.client.create.posts;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostResponse {
    private long id;
    private String topText;
    private String bottomText;
    private String imagePath;
}
