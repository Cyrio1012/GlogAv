package iut.bad;

interface Consommation {
	void manger();
	void boire();
}

public class Humain {
	protected String nom;
	protected String prenom;
	protected int age;
	public Humain(String nom,String prenom,int age) {
		this.nom = nom ;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details(){
		System.out.println("Nom : "+ nom + ", Prenom : " + prenom + ", Age : "+ age);
	}
	
	@Override
	public String toString() {
		return "Nom : "+ nom + ", Prenom : " + prenom + ", Age : "+ age ;
	}
	
	public void ami(Humain humain, int duree) {
		System.out.println(this.nom + " est ami avec " + humain.nom + " depuis "+ duree + " jours.");
	}
}
