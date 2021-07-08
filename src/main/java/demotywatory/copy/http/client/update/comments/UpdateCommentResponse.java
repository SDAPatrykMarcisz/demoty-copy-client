package demotywatory.copy.http.client.update.comments;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCommentResponse {

    private Long id;
    private String content;

}
