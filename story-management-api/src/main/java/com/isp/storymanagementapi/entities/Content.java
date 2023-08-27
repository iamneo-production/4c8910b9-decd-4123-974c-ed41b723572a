package com.isp.storymanagementapi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int contentId;
	
	private String message;
	
//	@OneToOne(mappedBy = "contentId")
//	private Question question;
	
//	@ManyToOne
//	private Flows contentList;
	
	
}
