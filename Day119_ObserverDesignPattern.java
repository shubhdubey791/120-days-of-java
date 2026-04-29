/**
 * ============================================
 * 120 Days of Java Learning - Day 119
 * Topic: ObserverDesignPattern
 * ============================================
 * Observer pattern one-to-many dependency define karta hai - jab ek object change hota hai, sab observers ko notify hota hai.
 * Event handling systems, pub-sub models isi pattern par based hote hain.
 */
public class Day119_ObserverDesignPattern {

    public static void main(String[] args) {

        interface Observer { void update(String event); }
        class EmailSubscriber implements Observer {
            public void update(String event) { System.out.println("Email notification: " + event); }
        }
        class Publisher {
            java.util.List<Observer> observers = new java.util.ArrayList<>();
            void subscribe(Observer o) { observers.add(o); }
            void notifyAll(String event) { for (Observer o : observers) o.update(event); }
        }
        Publisher publisher = new Publisher();
        publisher.subscribe(new EmailSubscriber());
        publisher.notifyAll("New Java tutorial published!");
    }

}
