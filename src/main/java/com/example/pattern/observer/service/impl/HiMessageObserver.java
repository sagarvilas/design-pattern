package com.example.pattern.observer.service.impl;

import com.example.pattern.observer.service.api.Observer;
import org.springframework.stereotype.Service;

import java.beans.PropertyChangeEvent;

@Service
public class HiMessageObserver implements Observer {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("hi".equalsIgnoreCase((String) evt.getNewValue())) {
            System.out.println("HI message was sent");
        }
    }
}
