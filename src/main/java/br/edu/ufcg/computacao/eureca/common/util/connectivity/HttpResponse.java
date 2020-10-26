package br.edu.ufcg.computacao.eureca.common.util.connectivity;

import java.util.List;
import java.util.Map;

public class HttpResponse {
    private final Map<String, List<String>> headers;
    private int httpCode;
    private String content;

    public HttpResponse(String content, int httpCode, Map<String, List<String>> headers) {
        this.content = content;
        this.httpCode = httpCode;
        this.headers = headers;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }
}
