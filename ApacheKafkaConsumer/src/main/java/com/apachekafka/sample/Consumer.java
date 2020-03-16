package com.apachekafka.sample;

import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private final CountDownLatch latch = new CountDownLatch(3);

    @KafkaListener(topics = "myTopic")
    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
        //logger.info(cr.toString());
        System.out.println("***************************************");
        System.out.println(cr.value());
        System.out.println("***************************************");
        latch.countDown();
    }
}
