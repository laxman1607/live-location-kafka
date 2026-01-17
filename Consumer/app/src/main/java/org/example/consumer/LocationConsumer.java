package org.example.consumer;

import jakarta.annotation.PostConstruct;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationConsumer {

    @PostConstruct
    public void init() {
        System.out.println("LocationConsumer bean CREATED");
    }

    @KafkaListener(topics = "live-location", groupId = "location-group")
    public void receive(String location) {
        System.out.println(" LIVE LOCATION RECEIVED -> " + location);
    }
}
