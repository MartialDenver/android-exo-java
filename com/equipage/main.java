package com.equipage;

public class main {

    public static void main(String[] args) {
    
    System.out.println("--------HELLO-------");

        
    avion a=new avion(433, "Paris", "France", 180, "Commercial", "Boeing", "Air France", 100);
    a.afficheravion();
    a.affichervol();
    a.callairport();
    

    System.out.println("--------------------------- ");

    mecanicien m=new mecanicien(433, "Paris", "France", 180, 33, "Dine", "Airbus");
    m.saymecanicien();

    piste p=new piste(433, "Paris", "France", 180, 35, "décollage");
    p.detecterpiste();

    
    }

}
