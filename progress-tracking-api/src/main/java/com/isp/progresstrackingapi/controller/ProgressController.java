package com.isp.progresstrackingapi.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;//PostMapping;
import com.isp.progresstrackingapi.pojo.*;


@RestController
@RequestMapping("/user/story")
public class ProgressController {
    StoryResponse test=new StoryResponse(1,"Test Story");
    @PostMapping
    public ResponseEntity<String> updateUserStoryProgress(@RequestBody ProgressRequest progressRequest) {
        
        return ResponseEntity.ok("Progress updated successfully");
    }

    @GetMapping("/{id}/start-reading")
    public ResponseEntity<StoryResponse> startReadingStory(@PathVariable("id") int storyId) {
        
        {
            return ResponseEntity.ok(storyRepository.findById(storyId).get());
        }
        StoryResponse storyResponses=test;
        return ResponseEntity.ok(storyResponses);
    }

    @PostMapping("/{id}/decision/{contentId}")
    public ResponseEntity<StoryResponse> makeDecision(@PathVariable("id") int storyId, @PathVariable("contentId") int contentId, @RequestBody ChoiceRequest choiceRequest) {
       //find the specified content using choice id content id and find the flow by using the content id and store Userstory
        StoryResponse storyResponses=test;
        //storyResponses.add(test);

        return ResponseEntity.ok(storyResponses);
    }

    @GetMapping("/{id}/continue-reading")
    public ResponseEntity<StoryResponse> continueReading(@PathVariable("id") int storyId) {
        //List<StoryResponse> storyResponses=new ArrayList<>();
        StoryResponse storyResponses=test;

        return ResponseEntity.ok(storyResponses);
    }
}
