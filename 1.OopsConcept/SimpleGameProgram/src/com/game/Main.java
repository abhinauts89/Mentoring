package com.game;

public class Main {

    public static void main(String[] args) {
        //Player1 player1 = new Player1("Abhishek", "sword", 500);
        Player1 player1 = new Player1("Abhishek", "sword", 100);

//        System.out.println(player1.getName());
//        System.out.println(player1.getWeapon());
//        System.out.println(player1.getHealth());

        player1.damagedByGun1();
        player1.damagedByGun1();
        player1.damagedByGun2();
        player1.heal();

       // Player2 player2 = new Player2("Roshan", "machine gun", 80,true);
//        Player2 player2 = new Player2("Roshan", "machine gun", 80,false);
//
//        player2.damagedByGun1();

    }
}
