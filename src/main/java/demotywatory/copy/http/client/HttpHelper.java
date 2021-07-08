package demotywatory.copy.http.client;

import java.net.http.HttpRequest;

public class HttpHelper {

    public static HttpRequest.Builder defaultRequest() {
        return HttpRequest.newBuilder()
                .header("content-type", "application/json")
                .header("Authorization", "Basic YWRtaW46YWRtaW4xMjM=");
    }

    public static String API_PREFIX = "https://localhost:8080";

}
