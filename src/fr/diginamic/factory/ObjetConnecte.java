package fr.diginamic.factory;

public class ObjetConnecte {
	private int limiteVolts;
	
	/** Constructeur
	 * @param limiteVolts
	 */
	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	
	/** @return the limiteVolts */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/** @param limiteVolts the limiteVolts to set */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
	
	
}
