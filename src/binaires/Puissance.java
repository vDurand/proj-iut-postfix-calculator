package binaires;

import java.util.NoSuchElementException;
import java.util.Stack;

import calculator.IElement;
import calculator.IIdentifiants;
import calculator.IPile;

/**
 * @author Valentin Durand - TP1.1 - 1A - DUT Informatique - IUT Ifs
 * @Class Puissance
 * @ May 9, 2014 10:18:18 PM
 */
public class Puissance extends calculator.Operateur implements IPuissance {

	/**
	 * Constructeur : Puissance
	 */
	public Puissance() {
		super("^");
	}
	
	/* (non-Javadoc)
	 * @see calculator.IElement#calcule(calculator.IPile, calculator.IIdentifiants)
	 */
	@Override
	public double calcule(IPile evaluations, IIdentifiants ids)
			throws IllegalStateException {
		Double exposant = evaluations.retire();
		Double resultat = Math.pow(evaluations.retire(), exposant);
		evaluations.ajoute(resultat);
		return resultat;
	}

	/* (non-Javadoc)
	 * @see calculator.IElement#toStringInfix(java.util.Stack)
	 */
	@Override
	public String toStringInfix(Stack<String> chaines) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see calculator.IElement#analyse(java.util.Stack, calculator.IIdentifiants)
	 */
	@Override
	public void analyse(Stack<IElement> elements, IIdentifiants ids)
			throws NoSuchElementException {
		// TODO Auto-generated method stub

	}

}
