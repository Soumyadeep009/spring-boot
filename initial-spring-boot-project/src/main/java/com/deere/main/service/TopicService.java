package com.deere.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deere.main.Model.Topic;

@Service
public class TopicService {

	public static List<Topic> topics = Arrays.asList(
			new Topic("1", "Data Structure", "Data Structures description"),
			new Topic("2", "Design and Algorithm", "Design and Algorithm description"),
			new Topic("3", "Spring Boot", "Spring Boot description")
			);
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String id){
		
		/** Iterative way to find a resource */
		/*for(Topic t: topics){
			if(t.getId().equals(id)){
				return t;
			}
		}
		return null;*/
		
		
		/** Elegant way or using streams to find it a resource */
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
