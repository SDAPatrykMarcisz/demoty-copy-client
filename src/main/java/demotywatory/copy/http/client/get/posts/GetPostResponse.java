package demotywatory.copy.http.client.get.posts;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPostResponse {
    private long id;
    private String topText;
    private String bottomText;
    private String imagePath;
}
