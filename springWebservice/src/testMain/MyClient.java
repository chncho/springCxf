package testMain;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

public class MyClient {

    public static void main(String[] args) throws Exception {
        go("http://172.17.2.104:8081/javaee/webservice/Users/customer/1/info");
        go("http://172.17.2.104:8081/javaee/webservice/Users/customer/search?name=abc");
    }

    private static void go(String url) throws Exception {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        int statusCode = client.executeMethod(method);
       if (statusCode != HttpStatus.SC_OK) {
           System.err.println("Method failed: " + method.getStatusLine());
       }
       byte[] responseBody = method.getResponseBody();
       System.out.println(new String(responseBody));
    }
}
