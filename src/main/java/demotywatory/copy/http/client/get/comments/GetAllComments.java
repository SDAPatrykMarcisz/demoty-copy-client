package demotywatory.copy.http.client.get.comments;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static demotywatory.copy.http.client.HttpHelper.API_PREFIX;
import static demotywatory.copy.http.client.HttpHelper.defaultRequest;

public class GetAllComments {
    public static void main(String[] args) throws IOException, InterruptedException {
        GetAllCommentsResponse allComments = getAllComments();
        System.out.println(allComments);
    }

    private static GetAllCommentsResponse getAllComments() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
        HttpRequest request = defaultRequest()
                .uri(URI.create(API_PREFIX + "/api/posts/1/comments"))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), GetAllCommentsResponse.class);
    }
}
