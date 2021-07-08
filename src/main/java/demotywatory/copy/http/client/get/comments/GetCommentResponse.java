package demotywatory.copy.http.client.get.comments;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCommentResponse {

    private Long id;
    private String content;

}
