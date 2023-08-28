package com.isp.usermanagementapi.controller;

import java.util.List;

import org.bouncycastle.asn1.ocsp.ResponderID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isp.usermanagementapi.entities.Characters;
import com.isp.usermanagementapi.entities.Story;
import com.isp.usermanagementapi.entities.User;
import com.isp.usermanagementapi.entities.UserStory;
import com.isp.usermanagementapi.externals.StoryServiceIntf;
import com.isp.usermanagementapi.repositories.UserRepository;
import com.isp.usermanagementapi.repositories.UserStoryRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping("/user")
public class UserController{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserStoryRepository userStoryRepository;
	
	@Autowired
	private StoryServiceIntf serviceIntf;

	@PostMapping("/createUser")
	public String createUser(@RequestBody User user) {
		userRepository.save(user);
		return "User created";
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable int userId){
		return ResponseEntity.ok(userRepository.findById(userId).get());
	}
	
	
	@PostMapping("{userId}/selectStory/{storyId}")
	@CircuitBreaker(name="userStoryBreaker", fallbackMethod = "storyFallback")
	public String selectStory(@PathVariable int storyId, @PathVariable int userId) {
		ResponseEntity<Story> story1 = serviceIntf.getStory(storyId);
		if(userStoryRepository.findByStory(story1.getBody())==null) {
		UserStory userStory = new UserStory();
		userStory.setStory(story1.getBody());
		userStoryRepository.save(userStory);
		User user = userRepository.findById(userId).get();
		List<UserStory> stories = user.getUserStories();
		stories.add(userStory);
		user.setUserStories(stories);
		userRepository.save(user);
		}
		
		return "Story selected!";
	}
	
	public String storyFallback(int storyId, int userId, Exception ex){
		return "Story service is temporarily down!";
	}


	@PutMapping("{userStoryId}/selectCharacter/{charId}")
	public String selectCharacter(@PathVariable int userStoryId, @PathVariable int charId) {
		UserStory userStory = userStoryRepository.findById(userStoryId).get();
		List<Characters> char1 = userStory.getCharacter();
		Characters character = serviceIntf.getChar(charId).getBody();
		char1.add(character);
		userStoryRepository.save(userStory);
		return "Characters selected!";
		
	}
	
	
	
}