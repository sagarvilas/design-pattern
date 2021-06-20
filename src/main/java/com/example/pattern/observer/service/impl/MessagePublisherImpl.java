package com.example.pattern.observer.service.impl;

import com.example.pattern.observer.service.api.Observer;
import com.example.pattern.observer.service.api.Publisher;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.beans.PropertyChangeSupport;
import java.util.List;

@Service
public class MessagePublisherImpl implements Publisher {

    private String message;

    @NonNull
    private List<Observer> messageObservers;

    private PropertyChangeSupport support;

    public MessagePublisherImpl(List<Observer> messageObservers) {
        this.messageObservers = messageObservers;
        this.support = new PropertyChangeSupport(this);
    }

    @PostConstruct
    private void initObserver() {
        messageObservers.forEach(this::addObserver);
    }

    @Override
    public void addObserver(Observer o) {
        support.addPropertyChangeListener(o);
    }

    @Override
    public void removeObserver(Observer o) {
        support.removePropertyChangeListener(o);
    }

    @Override
    public void setMessage(String message) {
        support.firePropertyChange("message", this.message, message);
        this.message = message;
    }
}
