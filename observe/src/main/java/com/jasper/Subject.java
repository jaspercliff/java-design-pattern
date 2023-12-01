package com.jasper;
import java.util.ArrayList;
import java.util.List;


/**
 * The Subject class represents an object that can be observed by multiple observers.
 * It provides methods to attach and detach observers, as well as to notify all observers
 * when a change occurs.
 *
 *
 * define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and update automatically
 *
 */
class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer
interface Observer {
    void update();
}

// Concrete observer
class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("Observer updated");
    }
}

class ConcreteObserver2 implements Observer {
    public void update() {
        System.out.println("Observer2 updated");
    }
}
// Usage
 class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ConcreteObserver();
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        subject.attach(observer);
        subject.attach(observer2);
        subject.notifyObservers();  // prints "Observer updated"
    }
}