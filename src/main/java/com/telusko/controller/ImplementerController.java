package com.telusko.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.pojo.Implementers;

@RestController
@RequestMapping("/api/implementers")
public class ImplementerController
{
	@GetMapping("/report")
	public ResponseEntity<Implementers> showImplementers()
	{
		Implementers impl=new Implementers();
		impl.setId(101);
		impl.setName("Nargis");
		impl.setCity("Kolkata");
		impl.setTeamNames(new String[] {"implementers1","achievers","dreamers"});
		impl.setStudies(List.of("10th","12th","Diploma","B.Tech"));
		return new ResponseEntity<Implementers>(impl,HttpStatus.OK);	
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveImplementerInfo(@RequestBody Implementers implementer)
	{
		System.out.println(implementer);
		String body="Data Stored successfully";
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
}
