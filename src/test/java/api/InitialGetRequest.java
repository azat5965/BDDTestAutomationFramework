package api;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class InitialGetRequest {
    @Test
    public void getTest() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();

        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("the-one-api.dev");
        uriBuilder.setPath("v2/movie");

        HttpGet get = new HttpGet(uriBuilder.build());
        get.setHeader("accept", "application/json");
        get.setHeader("Authorization", "Bearer yW7B_O9eYaR666Obtc4L");

        HttpResponse response = client.execute(get);

        System.out.println(response.getStatusLine().getStatusCode());
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    @Test
    public void getTestOne() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        //https://petstore.swagger.io/v2/pet/findByStatus?status=available
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("petstore.swagger.io");
        uriBuilder.setPath("v2/pet/findByStatus");
        uriBuilder.setParameter("status", "available");

        HttpGet get = new HttpGet(uriBuilder.build());
        get.setHeader("accept", "application/json");
        get.setHeader("Authorization", "BeksultanApiKey");

        HttpResponse response = client.execute(get);
        int statusCode = response.getStatusLine().getStatusCode();

        System.out.println(statusCode);
        Assert.assertEquals(200, statusCode);
    }
}
