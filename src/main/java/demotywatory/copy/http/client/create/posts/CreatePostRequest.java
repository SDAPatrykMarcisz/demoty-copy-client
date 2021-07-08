package demotywatory.copy.http.client.create.posts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostRequest {
    private String topText;
    private String bottomText;
    private String imagePath;
}
