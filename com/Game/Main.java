package com.Game;

public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Anurag", "Akm", 500);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();
        player.heal();

//        Player2 betterPlayer = new Player2("Sam","m416",80,100,false);
//        betterPlayer.damageByGun1();
    }
}
