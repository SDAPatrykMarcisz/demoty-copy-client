package demotywatory.copy.http.client.create.comment;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static demotywatory.copy.http.client.HttpHelper.API_PREFIX;
import static demotywatory.copy.http.client.HttpHelper.defaultRequest;

public class CreateComment {

    public static void main(String[] args) throws IOException, InterruptedException {
        createComment();
    }

    private static CreateCommentResponse createComment() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        String content = "no takie se";
        String bodyJson = objectMapper.writeValueAsString(CreateCommentRequest.builder().content(content).build());
        HttpRequest request = defaultRequest()
                .uri(URI.create(API_PREFIX + "/api/posts/1/comments"))
                .POST(HttpRequest.BodyPublishers.ofString(bodyJson))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), CreateCommentResponse.class);
    }
}
