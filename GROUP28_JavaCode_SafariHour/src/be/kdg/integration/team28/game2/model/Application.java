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


        var player = new Player(name , level);

        System.out.println(player.getName() + player.getLevel());



    }
}
