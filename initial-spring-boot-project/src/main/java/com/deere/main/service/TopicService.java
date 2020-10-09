package com.deere.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deere.main.Model.Topic;

@Service
public class TopicService {

	public static List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Data Structure", "Data Structures description"),
			new Topic("2", "Design and Algorithm", "Design and Algorithm description"),
			new Topic("3", "Spring Boot", "Spring Boot description")
			));
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(Topic t: topics){
			if(t.getId().equals(id)){
				t.setDescription(topic.getDescription());
				t.setName(topic.getName());
			}
		}
	}

	public void deleteTopic(String id) {
		int i=0;
		while(i<topics.size()){
			if(topics.get(i).getId().equals(id)){
				break;
			}
			i++;
		}
		topics.remove(i);
	}
}
