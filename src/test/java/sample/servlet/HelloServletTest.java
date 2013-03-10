package sample.servlet;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import sample.junit.rules.JettyApplicationServer;

import com.sun.jersey.api.client.Client;

public class HelloServletTest {

    @Rule
    public JettyApplicationServer jetty = new JettyApplicationServer();

    @Test
    public void GETリクエストでHelloServletのレスポンスメッセージを取得できる() throws Exception {
        String expected = "Hello, gradle!";
        String actual = Client.create()
                .resource("http://localhost:18080/gradle-sample/hello")
                .get(String.class);

        assertThat(actual, is(expected));
    }
}
