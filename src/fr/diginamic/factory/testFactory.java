package fr.diginamic.factory;

public class testFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetConnecteFactory O1 = new ObjetConnecteFactory();
		ObjetConnecte t1 = O1.getObjetConnecte(Type.Telephone, 10);
		ObjetConnecte t2 = O1.getObjetConnecte(Type.Tablette, 12);
		ObjetConnecte t3 = O1.getObjetConnecte(Type.Enceinte, 20);
		System.out.println(t1.getClass());
		System.out.println(t2.getClass());
		System.out.println(t3.getClass());
	}
}
