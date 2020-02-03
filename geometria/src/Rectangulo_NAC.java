/**
 * Clase que extiende la clase abstracta Figura geometrica y realiza un rectangulo
 * @author Nieves Aracil Cerdán
 * @version 1.2
 */
public class Rectangulo_NAC extends FiguraGeometrica_NAC {
	private double l1; //lado del rectángulo
	private double l2; //lado del rectángulo
	
	/**
	 * Constructor del Rectangulo
	 * @param tipoFigura Indica el tipo de figura llamando a la clase FiguraGeometrica_NAC
	 * @param lG Introduce la anchura de uno de los lados
	 * @param lP Introduce la anchura de uno de los lados
	 */
	public Rectangulo_NAC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el área del rectángulo
	 * @return Devuelve el resultado de multiplicar los lados.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perímetro del rectángulo
	 * @return Devuelve el resultado de la operación que calcula el perímetro del rectángulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
