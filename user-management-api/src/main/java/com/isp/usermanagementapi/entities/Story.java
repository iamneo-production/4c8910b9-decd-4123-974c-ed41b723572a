package com.isp.usermanagementapi.entities;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
@Entity
public class Story {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storyId;

	private String storyName;
	
	@ManyToMany( cascade = CascadeType.MERGE)
	private List<Characters> characters;

	@OneToMany(cascade = CascadeType.MERGE ,orphanRemoval = true)
	private List<Flows> flow;
	
}
