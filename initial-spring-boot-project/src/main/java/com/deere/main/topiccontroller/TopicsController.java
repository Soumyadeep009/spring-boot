package com.deere.main.topiccontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deere.main.Model.Topic;
import com.deere.main.service.TopicService;

@RestController
public class TopicsController {

	@Resource //@Autowired can also be used. Please find the difference between @Autowired and @Resource
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
}
