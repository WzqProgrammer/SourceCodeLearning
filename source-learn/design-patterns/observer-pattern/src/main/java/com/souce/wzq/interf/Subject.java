package com.souce.wzq.interf;

public interface Subject {

    void registerObserver(Observer O);

    void removeObserver(Observer O);

    void notifyObservers();
}
