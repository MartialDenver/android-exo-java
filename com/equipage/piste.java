package com.equipage;
  
public class piste extends aeroport implements Admin{
    private int numpiste;
    private String typepiste;

  public piste(int numero, String ville, String pays, int coordonnees, int numpiste, String typepiste) {
    super(numero, ville, pays, coordonnees);
    this.numpiste=numpiste;
    this.typepiste=typepiste;
    //TODO Auto-generated constructor stub
  }

  public int getNumpiste(){
    return this.numpiste;
  }

  public String getTypepiste(){
    return this.typepiste;
  }

  public void setNumpiste(int numpiste){
    this.numpiste=numpiste;
  }

  public void setTypepiste(String typepiste){
    this.typepiste=typepiste;
  }

  public void detecterpiste(){
    System.out.println("Piste n° : " +numpiste+ ". Il s'agit d'une piste " +typepiste+ ".");
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
  public void saymecanicien() {
    // TODO Auto-generated method stub
    
  }
  
}