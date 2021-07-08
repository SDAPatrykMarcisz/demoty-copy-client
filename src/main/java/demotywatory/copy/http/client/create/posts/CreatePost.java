package demotywatory.copy.http.client.create.posts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import demotywatory.copy.http.client.create.posts.CreatePostRequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static demotywatory.copy.http.client.HttpHelper.API_PREFIX;
import static demotywatory.copy.http.client.HttpHelper.defaultRequest;

public class CreatePost {

    public static void main(String[] args) throws IOException, InterruptedException {
        createPost();
    }

    public static CreatePostResponse createPost() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        String imagePath = "https://i1.jbzd.com.pl/contents/2021/07/normal/rN59uCyfNvPwkBkD93MvbTc7mKftOM51.jpg";
        String bottomText = "i tak to jest";

        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJson = objectMapper.writeValueAsString(CreatePostRequest.builder().imagePath(imagePath).bottomText(bottomText).build());
        HttpRequest request = defaultRequest()
                .uri(URI.create(API_PREFIX + "/api/posts"))
                .POST(HttpRequest.BodyPublishers.ofString(bodyJson))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), CreatePostResponse.class);
    }

}
