package com.equipage;

public abstract class aeroport{
    private int numero;
    private String ville;
    private String pays;
    private int coordonnees;

    public aeroport(int numero, String ville, String pays, int coordonnees){
        this.numero=numero;
        this.ville=ville;
        this.pays=pays;
        this.coordonnees=coordonnees;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getVille(){
        return this.ville;
    }

    public String getPays(){
        return this.pays;
    }

    public int getcoordonnees(){
        return this.coordonnees;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public void setVille(String ville){
        this.ville=ville;
    }

    public void setPays(String pays){
        this.pays=pays;
    }

    public void setcoordonnees(int coordonnees){
        this.coordonnees=coordonnees;
    }

    public void callairport()
    {
        System.out.println("Salut, bienvenu à l'aéroport n° " + numero +  " situé à " + ville + " en/au " +pays+ 
        " et de géolocalisation " + coordonnees +". Merci pour votre passage. " );
    }
}
