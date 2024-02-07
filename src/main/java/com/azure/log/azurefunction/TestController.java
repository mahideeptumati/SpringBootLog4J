package com.azure.log.azurefunction;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${callme.message}")
    private String callMeMessage;

    private static final Logger logger = LogManager.getLogger(TestController.class);


    @GetMapping("/callme")
    public String callMe(){
        logger.info("In Call me");
        return "Hi "+callMeMessage;
    }
}
