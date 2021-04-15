package com.coding.saga.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/post")
public class CommentController {
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public ResponseEntity<String> addComment() {
        return ResponseEntity.ok("{\"status\" : \"ok\"}");
    }

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public ResponseEntity<String> addComments() {
        return ResponseEntity.ok("{\"status\" : \"ok\"}");
    }

    @RequestMapping(value = "/comments/{comment_id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCommentById(@PathVariable String comment_id) {
        return ResponseEntity.ok("{\"status\" : \"ok\"}");
    }
}
