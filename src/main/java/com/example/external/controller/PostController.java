package com.example.external.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.Arrays;

@RestController
@RequestMapping(path = "/api")
public class PostController {

    @Autowired
    RestTemplate restTemplate;

    @Operation(summary = "This is a test api")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "we welcome you",
                    content = {@Content(mediaType = "application/json")}),

            @ApiResponse(responseCode = "404",
                    description = "we will back to you")
    })
    @GetMapping(path = "/test")
    public String getEcho() {
        return "hello there";
    }

    @GetMapping("/allPosts")
    public Iterable<Object> getAllPosts() {
        Object[] object = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/posts",
                Object[].class);

        return Arrays.asList(object);
    }

    @GetMapping("/post")
    public Object getPosts(@RequestParam("id") int id) {
        Object object = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/posts/" + id, Object.class);
        return Arrays.asList(object);
    }

    @GetMapping("/allComments")
    public Iterable<Object> getAllComments() {
        Object[] object = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/comments",
                Object[].class);

        return Arrays.asList(object);
    }

    @GetMapping("/postComments")
    public Iterable<Object> getComment(@RequestParam("id") int id) {
        Object[] object = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/posts/" + id + "/comments",
                Object[].class);

        return Arrays.asList(object);
    }

    @GetMapping("/commentsPost")
    public Iterable<Object> getPostComments(@RequestParam("id") int id) {
        Object[] object = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/comments?postId=" + id,
                Object[].class);

        return Arrays.asList(object);
    }

}
