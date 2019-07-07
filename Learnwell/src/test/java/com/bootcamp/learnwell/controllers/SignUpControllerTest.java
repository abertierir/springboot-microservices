package com.bootcamp.learnwell.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@WebMvcTest(SignUpController.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SignUpControllerTest {
	
	@Autowired
    MockMvc mvc;

    @Test
    public void a_new_user_is_trying_to_sign_up_endpoint() throws Exception{
    	//given
    	JSONObject json = new JSONObject(); 
    	json.put("userName", "Julie Sherman"); 
    	json.put("email", "you2@giveme.something"); 
    	json.put("password", "somethingthatnobodyelsecangive"); 
    	//when
    	mvc.perform(post("/student")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(json.toString()))
    	//then
    	.andExpect(status().isCreated());
    }
    
    @Test
    public void a_registered_user_is_trying_to_sign_up_again() throws Exception{
    	//given
    	JSONObject json = new JSONObject(); 
    	json.put("userName", "Julie Sherman"); 
    	json.put("email", "you2@giveme.something"); 
    	json.put("password", "somethingthatnobodyelsecangive"); 
    	//when
    	mvc.perform(post("/student")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(json.toString()))
    	//then
    	.andExpect(status().is4xxClientError());
    }
}
