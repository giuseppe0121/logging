package co.develhope.logging.controllers;


import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public String welcome(){
        logger.info("welcome to controller");

        return "welcome";
    }


    @GetMapping("/exp")
    public int exponentialService(){
        logger.info("Starting exponential controller");
        return basicService.exponential();
    }

    @GetMapping("/get-errors")
    public void errors(){
        Error error = new  Error("This is the error");
        logger.error("error controller",error);

    }

}