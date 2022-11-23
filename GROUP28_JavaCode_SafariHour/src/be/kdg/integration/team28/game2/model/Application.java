package be.kdg.integration.team28.game2.model;

import be.kdg.integration.team28.game2.model.Player.Player;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        System.out.println("Please enter your name: ");

        Scanner keyboard = new Scanner(System.in);

        String name =keyboard.nextLine();

        System.out.println("Choose the level Beginner/Intermediate/Advanced: ");
        String level = keyboard.nextLine();


        var player = new Player(0,0,name,level,0);

        System.out.println(player.getName() + player.getLevel());



        boolean con = false;
        while (!con) {

            System.out.println("Enter a move: ");

            String move = keyboard.nextLine();

            if (move.equals("z")) {
                for (var i = 0; i<player.getPosition(); i++) {
                    System.out.print("\t" + "xx");
                }
            var currentPosition = player.getPosition();
            player.setPosition(currentPosition + 1);
        }//if
            System.out.print(player.getPosition());
            if (player.getPosition() > 5) {
                con = true;
            }
        }//while




    }
}
