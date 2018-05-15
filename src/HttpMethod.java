public interface HttpMethod {
    void releaseConnection();

    String getResponseBodyAsString();
}
