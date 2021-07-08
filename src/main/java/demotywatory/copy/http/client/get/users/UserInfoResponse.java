package demotywatory.copy.http.client.get.users;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoResponse {
    private String username;
    private String mail;
    private boolean active;
    private List<String> roles;
}
