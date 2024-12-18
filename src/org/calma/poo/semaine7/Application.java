package org.calma.poo.semaine7;

public class Application {
    public static void main(String[] args) {

        Drone drone = new Drone("Mazda", 95);
        Rover rover = new Rover("Nissan", 75);

        drone.start();
        rover.start();

        Sandstorm tempete = new Sandstorm();
        Sandstorm.setStormActive(true);

        drone.start();
        System.out.println("Drone status: " + drone.getStatus());
        drone.fly(50);
        rover.collectData();

        drone.stop();
        rover.stop();
        System.out.println("Drone status: " + drone.getStatus());
        System.out.println("Rover status: " + rover.getStatus());
    }
}
