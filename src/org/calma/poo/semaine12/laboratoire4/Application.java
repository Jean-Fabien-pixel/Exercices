package org.calma.poo.semaine12.laboratoire4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création de quelques utilisateurs et leurs préférences de notifications
        NotificationPreferences alicePrefs = new NotificationPreferences(true, true, true);
        NotificationPreferences bobPrefs = new NotificationPreferences(true, false, true);

        User alice = new User("Alice", alicePrefs);
        User bob = new User("Bob", bobPrefs);
        User charlie = new User("Charlie", alicePrefs);

        UserObserver observerAlice = new UserObserver("Observer Alice");
        UserObserver observerBob = new UserObserver("Observer Bob");

        // Menu interactif
        while (true) {
            System.out.println("\n--- Menu du Réseau Social ---");
            System.out.println("1. Suivre un utilisateur");
            System.out.println("2. Publier un message");
            System.out.println("3. Liker un message");
            System.out.println("4. Commenter un message");
            System.out.println("5. Voir les notifications");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choice) {
                case 1:
                    System.out.println("Qui voulez-vous suivre ? (Alice, Bob, Charlie)");
                    String followChoice = scanner.nextLine();
                    if (followChoice.equalsIgnoreCase("Alice")) {
                        observerBob.follow(alice);
                        System.out.println("Observer Bob suit maintenant Alice.");
                    } else if (followChoice.equalsIgnoreCase("Bob")) {
                        observerAlice.follow(bob);
                        System.out.println("Observer Alice suit maintenant Bob.");
                    } else if (followChoice.equalsIgnoreCase("Charlie")) {
                        observerAlice.follow(charlie);
                        System.out.println("Observer Alice suit maintenant Charlie.");
                    } else {
                        System.out.println("Utilisateur non reconnu.");
                    }
                    break;

                case 2:
                    System.out.println("Qui publie un message ? (Alice, Bob, Charlie)");
                    String poster = scanner.nextLine();
                    System.out.print("Entrez le type de message (text, image, video): ");
                    String type = scanner.nextLine();
                    System.out.print("Entrez le contenu du message: ");
                    String content = scanner.nextLine();

                    if (poster.equalsIgnoreCase("Alice")) {
                        alice.postMessage(type, content);
                    } else if (poster.equalsIgnoreCase("Bob")) {
                        bob.postMessage(type, content);
                    } else if (poster.equalsIgnoreCase("Charlie")) {
                        charlie.postMessage(type, content);
                    } else {
                        System.out.println("Utilisateur non reconnu.");
                    }
                    break;

                case 3:
                    System.out.println("Qui aimerait liker un message ? (Observer Alice, Observer Bob)");
                    String liker = scanner.nextLine();
                    System.out.print("Quel utilisateur a posté le message ? (Alice, Bob, Charlie): ");
                    String likee = scanner.nextLine();

                    Post postToLike = getLastPost(likee, alice, bob, charlie);
                    if (postToLike != null) {
                        if (liker.equalsIgnoreCase("Observer Alice")) {
                            postToLike.likePost(observerAlice);
                        } else if (liker.equalsIgnoreCase("Observer Bob")) {
                            postToLike.likePost(observerBob);
                        } else {
                            System.out.println("Observateur non reconnu.");
                        }
                    } else {
                        System.out.println("Aucun message trouvé pour cet utilisateur.");
                    }
                    break;

                case 4:
                    System.out.println("Qui veut commenter un message ? (Observer Alice, Observer Bob)");
                    String commenter = scanner.nextLine();
                    System.out.print("Quel utilisateur a posté le message ? (Alice, Bob, Charlie): ");
                    String commentee = scanner.nextLine();
                    System.out.print("Entrez votre commentaire : ");
                    String comment = scanner.nextLine();

                    Post postToComment = getLastPost(commentee, alice, bob, charlie);
                    if (postToComment != null) {
                        if (commenter.equalsIgnoreCase("Observer Alice")) {
                            postToComment.addComment(observerAlice, comment);
                        } else if (commenter.equalsIgnoreCase("Observer Bob")) {
                            postToComment.addComment(observerBob, comment);
                        } else {
                            System.out.println("Observateur non reconnu.");
                        }
                    } else {
                        System.out.println("Aucun message trouvé pour cet utilisateur.");
                    }
                    break;

                case 5:
                    System.out.println("Voir les notifications de qui ? (Observer Alice, Observer Bob)");
                    String viewer = scanner.nextLine();
                    if (viewer.equalsIgnoreCase("Observer Alice")) {
                        System.out.println("Notifications d'Observer Alice : " + observerAlice.getNotifications());
                    } else if (viewer.equalsIgnoreCase("Observer Bob")) {
                        System.out.println("Notifications d'Observer Bob : " + observerBob.getNotifications());
                    } else {
                        System.out.println("Observateur non reconnu.");
                    }
                    break;

                case 6:
                    System.out.println("Merci d'avoir utilisé le réseau social !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
            }
        }
    }

    private static Post getLastPost(String username, User alice, User bob, User charlie) {
        if (username.equalsIgnoreCase("Alice") && !alice.getPosts().isEmpty()) {
            return alice.getPosts().get(alice.getPosts().size() - 1);
        } else if (username.equalsIgnoreCase("Bob") && !bob.getPosts().isEmpty()) {
            return bob.getPosts().get(bob.getPosts().size() - 1);
        } else if (username.equalsIgnoreCase("Charlie") && !charlie.getPosts().isEmpty()) {
            return charlie.getPosts().get(charlie.getPosts().size() - 1);
        }
        return null;
    }
}
