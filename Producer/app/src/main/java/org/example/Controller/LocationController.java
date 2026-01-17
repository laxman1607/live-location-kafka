package org.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")

public class LocationController {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private static final String Topic="live-location";
    @GetMapping("/send")
    public void sendLocation(@RequestParam double lat,
                             @RequestParam double lon){
        String location="Lat:" +lat +"Lon" + lon;
        kafkaTemplate.send(Topic,location);
        System.out.println("Sent to kafka" + location);
    }



}
