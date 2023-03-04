package com.deborasroka;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReturnJokes {
	List<Joke> getJokes (String search) throws IOException, InterruptedException {
        String jsonInString=null; 
        Gson gson = new Gson();
        List<Joke> jokeList = null;
        ApiRequest apiRequest = new ApiRequest();
                
        jsonInString = apiRequest.request(search);
        if (!jsonInString.equals("[]"))  {
         // Joke[] jokes = gson.fromJson(jsonInString, Joke[].class);  
          Type jokeListToken = new TypeToken<List<Joke>>(){}.getType(); 
          jokeList= gson.fromJson(jsonInString, jokeListToken);  
        } else {              
             return jokeList=null;
        }         
       
        return jokeList;     
       }     
     
     String getRandomJoke (String search) throws IOException, InterruptedException{
          ReturnJokes listOfJokes = new ReturnJokes();
          List<Joke> jokeList;
          
          jokeList = listOfJokes.getJokes(search);
          
          if (jokeList == null) {          
               return "No jokes where found Crying face";
          } else
          
               return jokeList.get(generateInt(jokeList.size())).getValue();     
     }
     
     int generateInt(int maxVal){          
        Random random = new Random();
        int number = random.nextInt(maxVal);
        return number;     
     } 
}
