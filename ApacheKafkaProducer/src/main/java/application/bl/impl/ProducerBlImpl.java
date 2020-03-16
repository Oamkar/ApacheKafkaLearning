package application.bl.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import application.bl.ProducerBl;

@Service
public class ProducerBlImpl implements ProducerBl {
	public static Logger logger = LoggerFactory.getLogger(ProducerBlImpl.class);
	
	@Autowired
    private KafkaTemplate<String, String> template;

	@Override
	public void sendMessage(String message) throws Exception {
		template.send("myTopic", message);
	}
    
}
