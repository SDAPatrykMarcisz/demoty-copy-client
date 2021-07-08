package demotywatory.copy.http.client.get.users;

import demotywatory.copy.http.client.get.users.UserInfoResponse;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
    private List<UserInfoResponse> users;
}
