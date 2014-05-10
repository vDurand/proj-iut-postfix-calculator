package calculator;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * @author Valentin Durand - TP1.1 - 1A - DUT Informatique - IUT Ifs
 * @Class Nombre
 * @ May 9, 2014 10:28:53 PM
 */
public class Nombre extends Element implements INombre {
	protected Double val;
	/**
	 * Constructeur : Nombre
	 */
	public Nombre(Double d) {
		val = d;
	}
	/* (non-Javadoc)
	 * @see calculator.IElement#calcule(calculator.IPile, calculator.IIdentifiants)
	 */
	@Override
	public double calcule(IPile evaluations, IIdentifiants ids)
			throws IllegalStateException {
		evaluations.ajoute(val);
		return 0;
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
