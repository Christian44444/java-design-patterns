package fr.diginamic.factory;


public class ObjetConnecteFactory {
	// mettre en static dans le plus souvent des cas permet de ne pas créer d'objet lors de l'appel => couplage faible
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
