package com.example.pattern.observer.service.impl;

import com.example.pattern.observer.service.api.Observer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.beans.PropertyChangeEvent;

@Service
@Slf4j
public class HelloMessageObserver implements Observer {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if("hello".equalsIgnoreCase((String) evt.getNewValue())){
            log.info("*****Hello message was sent*****");
        }
    }
}
