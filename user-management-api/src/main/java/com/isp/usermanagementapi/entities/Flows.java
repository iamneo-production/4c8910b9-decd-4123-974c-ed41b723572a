package com.isp.usermanagementapi.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PostLoad;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
@Entity
public class Flows {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int id;
		
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Content> contentList;
	
	
//	@ManyToOne
//    @JoinColumn(name = "user_story_ref")
//	private Story storyRef;
	
	
	
}
