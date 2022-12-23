package ex1;
import java.util.Date;
public class Employé {
private String matricule, nom, prenom;
Date dateDeNai = new Date(); 
Date dateDembauche= new Date(); 
Date dateNow = new Date();
private double salaire;
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDateDeNai() {
	return dateDeNai;
}
public void setDateDeNai(Date dateDeNai) {
	this.dateDeNai = dateDeNai;
}
public Date getDateDembauche() {
	return dateDembauche;
}
public void setDateDembauche(Date dateDembauche) {
	this.dateDembauche = dateDembauche;
}
public double getSalaire() {
	return salaire;
}
public void setSalaire(double salaire) {
	this.salaire = salaire;
}
public Employé() {
	
}
public Employé(String matricule, String nom, String prenom,Date dateDeNai, Date dateDembauche, double salaire) {
	this.matricule=matricule;
	this.nom=nom;
	this.prenom=prenom;
	this.dateDeNai=dateDeNai;
	this.dateDembauche=dateDembauche;
	this.salaire=salaire;
}
public int age() {
	return dateNow.getYear() - dateDeNai.getYear() +1900 ;
}
public int anciente() {
	return dateNow.getYear() - dateDembauche.getYear() +1900 ;
}
public void augmentationDuSalaire() {
	if ( anciente() < 2) {
		salaire = salaire + salaire*0.02;
	} else if ( anciente() < 10 ) {
		salaire = salaire + salaire*0.05;
	} else salaire = salaire + salaire*0.1;
}
public void afficherEmp() {
	System.out.println("Matricule : ["+matricule+"],  Nom complet : ["+nom.toUpperCase() + " "+ prenom+ "] , Age : [" +age()+"], ancienté : ["+anciente()+"] , Salaire : "+salaire );
}
}
