package com.shiva.patterns.builder;

import com.shiva.patterns.builder.HttpClient.HttpClientBuilder;

public class Test {
   public static void main(String[] args) {
	HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
	HttpClient httpClient = builder.method("POST").url("testurl").secure("shiva", "pwd").body("{}").build();
  
	System.out.println(httpClient);
   }
}
