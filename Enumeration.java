// WAP to Design a traffic light system using the concept of enumeration in Java. The traffic light can have three states: RED, YELLOW, and GREEN.
// Each state should have a method to display the current state of the traffic light.
import java.util.*;
public class Enumeration {
    enum TrafficLight {
        RED, YELLOW, GREEN, PINK;

        public void displayState() {
            switch (this) {
                case RED:
                    System.out.println("The traffic light is RED. Please stop.");
                    break;
                case YELLOW:
                    System.out.println("The traffic light is YELLOW. Please prepare to stop.");
                    break;
                case GREEN:
                    System.out.println("The traffic light is GREEN. You can go.");
                    break;
                default:
                    System.out.println("Pagal hain kya Laude...");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        TrafficLight currentLight = TrafficLight.RED;
        currentLight.displayState();

        currentLight = TrafficLight.YELLOW;
        currentLight.displayState();

        currentLight = TrafficLight.GREEN;
        currentLight.displayState();

        currentLight = TrafficLight.PINK;
        currentLight.displayState();

    }
}
