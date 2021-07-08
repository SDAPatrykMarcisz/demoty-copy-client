package demotywatory.copy.http.client.update.posts;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePostResponse {

    private long id;
    private String topText;
    private String bottomText;
    private String imagePath;

}
