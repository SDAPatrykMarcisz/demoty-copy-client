package demotywatory.copy.http.client.create.posts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import demotywatory.copy.http.client.HttpHelper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CreatePost {

    public final static HttpClient httpClient = HttpClient.newBuilder().build();
    public final static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        CreatePostResponse koteczek = createPost("koteczek", "https://www.tapeciarnia.pl/tapety/normalne/41816_koteczek.jpg");
        createPost("koteczek", "https://www.tapeciarnia.pl/tapety/normalne/41816_koteczek.jpg");
        long id = koteczek.getId();

    }

    public static CreatePostResponse createPost(String bottomText, String imageUrl) {
        try {
            CreatePostRequest requestBody = CreatePostRequest.builder()
                    .bottomText(bottomText)
                    .imagePath(imageUrl)
                    .build();
            String requestBodyAsJson = objectMapper.writeValueAsString(requestBody);
            HttpRequest request = HttpHelper.defaultRequest()
                    .uri(URI.create(HttpHelper.API_PREFIX + "/api/posts"))
                    .POST(HttpRequest.BodyPublishers.ofString(requestBodyAsJson))
                    .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            CreatePostResponse responseAsObject = objectMapper.readValue(response.body(), CreatePostResponse.class);
            System.out.println(response);
            return responseAsObject;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
