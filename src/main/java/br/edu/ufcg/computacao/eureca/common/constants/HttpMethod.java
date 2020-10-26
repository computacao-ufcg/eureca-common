package br.edu.ufcg.computacao.eureca.common.constants;

public enum HttpMethod {
    GET("GET"), POST("POST"), HEAD("HEAD"), OPTIONS("OPTIONS"), PUT("PUT"), DELETE("DELETE"), TRACE("TRACE");

    private String name;

    HttpMethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
