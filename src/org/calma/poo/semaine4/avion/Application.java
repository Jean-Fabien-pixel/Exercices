package org.calma.poo.semaine4.avion;

public class Application {
    public static void main(String[] args) {
        Passenger bob = new Passenger(1, "Bob");
        Passenger alice = new Passenger(2, "Alice");

        CrewMember JohnSmith = new CrewMember("John Smith", "Pilote");
        CrewMember JaneDoe = new CrewMember("Jane Doe", "Co-pilote");
        CrewMember EmilyDavis = new CrewMember("Emily Davis", "Hôtesse");


        CrewMember[] crewMembers = new CrewMember[3];
        crewMembers[0] = JohnSmith;
        crewMembers[1] = JaneDoe;
        crewMembers[2] = EmilyDavis;

        Flight flight = new Flight("AF123", "Paris", 5, crewMembers);

        flight.showCrewMembers();
        flight.reserveSeat(2, alice);
        flight.reserveSeat(4, bob);
        flight.showSeatStatus();
        flight.freeSeat(2);
        flight.showSeatStatus();
    }
}

//Équipage du vol AF123 à destination de Paris :
//Pilote: John Smith
//Co-pilote: Jane Doe
//Hôtesse : Emily Davis
//Siège 2 réservé par Alice
//Siège 4 réservé par Bob
//État des sièges pour le vol AF123 :
//Siège 1 (Libre)
//Siège 2 (Occupé par Alice)
//Siège 3 (Libre)
//Siège 4 (Occupé par Bob)
//Siège 5 (Libre)
//Siège 2 libéré par Alice
//État des sièges pour le vol AF123 :
//Siège 1 (Libre)
//Siège 2 (Libre)
//Siège 3 (Libre)
//Siège 4 (Occupé par Bob)
//Siège 5 (Libre)