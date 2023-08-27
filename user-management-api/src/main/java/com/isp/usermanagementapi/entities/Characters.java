package com.isp.usermanagementapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
@Entity
public class Characters {
	@Id
	@Column(name="charId")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int characterId;
	
	@Column(name="charName")
	private String characterName;
	
//	@ManyToOne
//    @JoinColumn(name = "story_ref")
//	private Story story;
}
