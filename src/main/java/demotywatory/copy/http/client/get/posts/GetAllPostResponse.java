package demotywatory.copy.http.client.get.posts;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPostResponse {
    private List<GetPostResponse> posts;
}
