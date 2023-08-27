package com.isp.storymanagementapi.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int questionId;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "content_id")
	private Content contentId;

	
	@OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
	private List<Choice> choiceId;
}
