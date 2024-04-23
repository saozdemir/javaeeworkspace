package com.example.javaeefundamentals.beans;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description:
 */

import com.example.javaeefundamentals.annotations.Admin;
import com.example.javaeefundamentals.annotations.PopularStand;
import com.example.javaeefundamentals.annotations.Web;
import com.example.javaeefundamentals.events.EventData;
import com.example.javaeefundamentals.events.User;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.CompletionStage;

@Web
public class EventBean {

    @Inject
    private EventData eventData;
    @Inject
    private User user;

    @Inject
    @PopularStand
    private Event<EventData> eventDataEvent;

    @Inject
    @Admin
    private Event<EventData> conditionalEvent;

    public void login() {
        //Do credentials checking to login in user then fire login event
        //someSecurityManager.loginUser(user.getEmail, user.getPassword)

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

//        eventDataEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));
        CompletionStage<EventData> fireAsync = eventDataEvent.fireAsync(new EventData(user.getEmail(), LocalDateTime.now()));

        long secs = ChronoUnit.SECONDS.between(now, LocalDateTime.now());

        System.out.println("It took us this number of seconds to login " + secs);

        //Qualified Observer
        conditionalEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
