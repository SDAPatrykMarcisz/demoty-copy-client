package demotywatory.copy.http.client.create.comment;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCommentResponse {

    private Long id;

    private String content;

}
