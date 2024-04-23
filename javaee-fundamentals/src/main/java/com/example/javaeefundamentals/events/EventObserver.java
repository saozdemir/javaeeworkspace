package com.example.javaeefundamentals.events;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description:
 */
import com.example.javaeefundamentals.annotations.Admin;
import com.example.javaeefundamentals.annotations.PopularStand;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;
import javax.enterprise.event.Reception;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
public class EventObserver implements Serializable {

    @Inject
    private Logger logger;

//    void userLoggedIn(@Observes @PopularStand EventData eventData) {
//        //Persist in databse, send to another application outside your app
//        //Essentially you can do whatever you want with the event data here.
//        //We will just log it
//        logger.log(Level.INFO, "User {0} logged in at {1}",
//                new Object[]{eventData.getEmail(), eventData.getLoginTime()});
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            logger.log(Level.SEVERE, null, e);
//        }
//    }


    void asyncObserver(@ObservesAsync @PopularStand EventData eventData) {
        //Persist in databse, send to another application outside your app
        //Essentially you can do whatever you want with the event data here.
        //We will just log it
        logger.log(Level.INFO, "User {0} logged in at {1}",
                new Object[]{eventData.getEmail(), eventData.getLoginTime()});
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, null, e);
        }
    }






    void conditionalObserver(@Observes(notifyObserver = Reception.IF_EXISTS,
            during = TransactionPhase.AFTER_COMPLETION) @Admin EventData eventData) {
        logger.log(Level.INFO, "The CEO {0} logged in at {1}",
                new Object[]{eventData.getEmail(), eventData.getLoginTime()});
    }
}
