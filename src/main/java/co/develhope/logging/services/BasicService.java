package co.develhope.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class BasicService {

    @Value("${customEnvs.n1}")
    private int n1;

    @Value("${customEnvs.n2}")
    private int n2;

    Logger logger = LoggerFactory.getLogger(BasicService.class);


    public int exponential(){
        try {
            int z = 0;
            int x = n1;
            logger.info("starting exponential");
            for (int i = 2; i <= n2; i++) {

                z = x * n1;
                x=z;

            }
            return z;
        }
        finally {
            logger.info("finish exponential");
        }

    }

}