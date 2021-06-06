package com.example.pattern.observer.service.impl;

import com.example.pattern.observer.service.api.Observer;
import org.springframework.stereotype.Service;

import java.beans.PropertyChangeEvent;

@Service
public class HelloMessageObserver implements Observer {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if("hello".equalsIgnoreCase((String) evt.getNewValue())){
            System.out.println("Hello message was sent");
        }
    }
}
