package com.isp.usermanagementapi.externals;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.isp.usermanagementapi.entities.Characters;
import com.isp.usermanagementapi.entities.Story;


@FeignClient(name="Story-Service")
public interface StoryServiceIntf {
	
	@GetMapping("/getStory/{storyId}")
	ResponseEntity<Story> getStory(@PathVariable int storyId);
	
	@GetMapping("/getCharacters/{charId}")
	ResponseEntity<Characters> getChar(@PathVariable int charId);
}
