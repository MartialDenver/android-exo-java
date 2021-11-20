package com.equipage;

public class mecanicien extends aeroport implements Admin{
    private int id;
    private String nom;
    private String typeavion;

    public mecanicien(int numero, String ville, String pays, int coordonnees, int id, String nom, String typeavion){
        super(numero, ville, pays, coordonnees);
        this.id=id;
        this.nom=nom;
        this.typeavion=typeavion;
        //TODO Auto-generated constructor stub
    }

    public int getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    public String getTypeavion(){
        return this.typeavion;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public void setTypeavion(String typeavion){
        this.typeavion=typeavion;
    }

    public void saymecanicien(){
        System.out.println("Je m'appelle : " +nom+ " et je suis le mecanicien " +id+ " en intervention sur l'avion " + typeavion+ ". Merci.");
    }

    @Override
    public void afficheravion() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affichervol() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void detecterpiste() {
        // TODO Auto-generated method stub
        
    }

}