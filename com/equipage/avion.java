package com.equipage;

public class avion extends aeroport implements Admin{
    private String modele;
    private String fabriquant;
    private String comproprio;
    private int numvol;

    public avion(int numero, String ville, String pays, int coordonnees, String modele, String fabriquant, 
    String comproprio, int numvol) {
        super(numero, ville, pays, coordonnees);
        this.modele=modele;
        this.fabriquant=fabriquant;
        this.comproprio=comproprio;
        this.numvol=numvol;
        //TODO Auto-generated constructor stub
    }

    public String getModele(){
        return this.modele;
    }

    public String getFabriquant(){
        return this.fabriquant;
    }

    public String getCompproprio(){
        return this.comproprio;
    }

    public int getNumvol(){
        return this.numvol;
    }

    public void setModele(String modele){
        this.modele=modele;
    }

    public void setFabriquant(String fabriquant){
        this.fabriquant=fabriquant;
    }

    public void setComproprio(String comproprio){
        this.comproprio=comproprio;
    }

    public void setNumvol(int numvol){
        this.numvol=numvol;
    }

    public void afficheravion(){
        System.out.println("Ici l'avion : " +modele+ " de la compagnie " +comproprio+ " en opération.");
    }

    public void affichervol(){
        System.out.println("Il s'agit du vol n° : " +numvol+ ". Concepteur du vol: " +fabriquant+ " sur l'aerodrome.");
    }

    @Override
    public void saymecanicien() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void detecterpiste() {
        // TODO Auto-generated method stub
        
    }

}

    