package demotywatory.copy.http.client.get.reactions;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetReactionsResponse {

    private long votesUp;
    private long votesDown;
    private long balance;

}
