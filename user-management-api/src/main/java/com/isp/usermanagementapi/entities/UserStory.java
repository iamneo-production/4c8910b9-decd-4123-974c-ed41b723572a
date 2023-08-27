package com.isp.usermanagementapi.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserStory {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
    private Story story;
    
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Characters> character;
    
	
	@OneToMany(cascade = CascadeType.MERGE ,orphanRemoval = true)
    private List<Flows> progressList;
    

}
