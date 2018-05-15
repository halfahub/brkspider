
public class PageReader {

    HttpClient httpClient = new HttpClient();

    public String getPageFor(String url) {
        HttpMethod method = new GetMethod(url);


        try{
            httpClient.executeMethod(method);
            String response = method.getResponseBodyAsString();
            return response;
        } catch (Exception e) {
            handle(e);
        } finally {
            method.releaseConnection();
        }
        return "";
    }

    private void handle(Exception e) {
        e.printStackTrace();
    }

}
