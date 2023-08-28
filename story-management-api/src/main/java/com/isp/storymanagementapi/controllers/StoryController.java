package com.isp.storymanagementapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import com.isp.storymanagementapi.entities.Characters;
import com.isp.storymanagementapi.entities.Choice;
import com.isp.storymanagementapi.entities.Content;
import com.isp.storymanagementapi.entities.Flows;
import com.isp.storymanagementapi.entities.Question;
import com.isp.storymanagementapi.entities.Story;
import com.isp.storymanagementapi.repositories.CharactersRepository;
import com.isp.storymanagementapi.repositories.ChoiceRepository;
import com.isp.storymanagementapi.repositories.ContentRespository;
import com.isp.storymanagementapi.repositories.FlowRepository;
import com.isp.storymanagementapi.repositories.QuestionRepository;
import com.isp.storymanagementapi.repositories.StoryRepository;

@RestController
@RequestMapping("/story")
public class StoryController {
	
	@Autowired
	private ContentRespository contentRespository;
	
	@Autowired
	private CharactersRepository charactersRepository;
	
	@Autowired
	private FlowRepository flowRepository;
	
	@Autowired
	private StoryRepository storyRepository;
	
	@Autowired
	private ChoiceRepository choiceRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	@GetMapping("/getContent/{Id}")
	public ResponseEntity<Content> getContent(@PathVariable int Id){
		return ResponseEntity.ok(contentRespository.findById(Id).get());
	}
	
	@GetMapping("/getFlow/{flowId}")
	public ResponseEntity<Flows> getFlow(@PathVariable int flowId){
		return ResponseEntity.ok(flowRepository.findById(flowId).get());
	}
	
	
	@GetMapping("/getStory/{storyId}")
	public ResponseEntity<Story> getStory(@PathVariable int storyId){
		return ResponseEntity.ok(storyRepository.findById(storyId).get());
	}
	
	@GetMapping("/getCharacters/{charId}")
	public ResponseEntity<Characters> getChar(@PathVariable int charId){
		return ResponseEntity.ok(charactersRepository.findById(charId).get());
	}
	
	@PostMapping("/createContent")
	public ResponseEntity<Content> createContent(@RequestBody Content content){
		return ResponseEntity.status(HttpStatus.CREATED).body(contentRespository.save(content));
	}
	
	@PostMapping("/createFlow")
	public ResponseEntity<Flows> createFlow(@RequestBody Flows flow){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(flowRepository.save(flow));
	}
	
	@PostMapping("/createCharacter")
	public ResponseEntity<Characters> createCharacter(@RequestBody Characters characters){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(charactersRepository.save(characters));
	}
	
	@PostMapping("/createStory")
	public ResponseEntity<Story> createStory(@RequestBody Story story){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(storyRepository.save(story));
	}
	
	@PostMapping("/createChoice")
	public ResponseEntity<Choice> createChoice(@RequestBody Choice choice){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(choiceRepository.save(choice));
	}
	
	@PostMapping("/createQuestion")
	public ResponseEntity<Question> createQuestion(@RequestBody Question question){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(questionRepository.save(question));
	}
	
	@GetMapping("/{contentId}/choices")
	public ResponseEntity<?> getChoices(@PathVariable int contentId){
		Question question = questionRepository.findByContentId(contentRespository.findById(contentId));
		
		return ResponseEntity.ok(question);
	}
	
	
}
