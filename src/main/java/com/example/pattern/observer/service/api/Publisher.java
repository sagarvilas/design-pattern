package com.example.pattern.observer.service.api;

public interface Publisher {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void setMessage(String message);
}
