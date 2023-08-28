package com.isp.progresstrackingapi.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@FeignClient("STORY-MANAGEMENT-API")
public interface StoryInf {

	//@GetMapping("/r/insert")
    //public ResponseEntity<Patient> refmethod (Patient p) ;
    @GetMapping("/getStory/{storyId}")
	public ResponseEntity<Story> getStoryref(@PathVariable int storyId);

}
