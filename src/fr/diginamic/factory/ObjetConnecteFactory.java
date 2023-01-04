package fr.diginamic.factory;


public class ObjetConnecteFactory {
	public ObjetConnecte getObjetConnecte(Type t1, int limiteVolt) {
		if (t1.equals(Type.Telephone)) {
			return new TelephonePortable(limiteVolt);
		} 
		else if (t1.equals(Type.Enceinte)) {
			return new Enceinte(limiteVolt);
		} 
		else if (t1.equals(Type.Tablette)) {
			return new Tablette(limiteVolt);
		} else return null; 
	} 
}
