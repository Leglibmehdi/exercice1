package ex1;

import java.util.Date;

public class Ts {
	 
	public static void main(String[] args) {
		Date dateDembauche= new Date(2017,5,7); 
		Date dateDeNai = new Date(1994,2,7); 
		
Employé e = new Employé ("Z3434", "leglib","Mehdi",dateDeNai ,dateDembauche, 5000);
e.augmentationDuSalaire();
e.afficherEmp();
	}

}
