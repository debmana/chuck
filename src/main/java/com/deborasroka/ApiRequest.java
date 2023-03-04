package com.deborasroka;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ApiRequest {
	
	String request (String search) throws IOException, InterruptedException{
        String resposta;
        HttpResponse<String> response;
        HttpRequest request = null;
        int searchLength = search.length();
        if (search.isEmpty() || search.equals("[]") || searchLength<=2 || searchLength>119 ) {return "[]";}
          
        System.out.println(prepSearch(search));
        try{          
        request = HttpRequest.newBuilder()
        .uri(URI.create("https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/search?query="+prepSearch(search)))
        .header("accept", "application/json")
        .header("X-RapidAPI-Key", "c02be0e75fmsh0ea41574817f4fep17a3fdjsnd81489d5d99c")
        .header("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();          
        } catch(Exception e) {
             System.out.println("Your API search to make the API call is blank " + e);
        }
        
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        resposta = response.body();
        resposta = resposta.substring(resposta.indexOf("["));
        resposta = resposta.substring(0, resposta.length()-1);
        return resposta;
   }
	
	String prepSearch(String untreated){
		
		String treated="";
		try {
			treated = URLEncoder.encode(untreated, StandardCharsets.UTF_8.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		treated = treated.replace("+", "%20");
		return treated;
}
		
	}

