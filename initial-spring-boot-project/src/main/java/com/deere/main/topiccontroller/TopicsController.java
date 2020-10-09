package com.deere.main.topiccontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deere.main.Model.Topic;

@RestController
public class TopicsController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		List<Topic> listOfTopics = new ArrayList<>();
		listOfTopics.add(new Topic("1", "Data Structure", "Data Structures description"));
		listOfTopics.add(new Topic("2", "Design and Algorithm", "Design and Algorithm description"));
		listOfTopics.add(new Topic("3", "Spring Boot", "Spring Boot description"));
		return listOfTopics;
	}
}
