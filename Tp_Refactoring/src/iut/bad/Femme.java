package iut.bad;

public class Femme extends Humain {
	protected String nom;
	protected String prenom;
	protected int age;
	public Femme(String nom,String prenom,int age) {
		super(nom,prenom,age);
	}
	
	public static void main(String[] args) {
		Homme homme = new Homme("Hary","barteau",30);
		Femme femme = new Femme("lari","bauna",25);
		homme.ami(femme, 100);
	}
}
