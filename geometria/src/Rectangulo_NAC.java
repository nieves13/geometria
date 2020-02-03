/**
 * Clase que extiende la clase abstracta Figura geometrica y realiza un rectangulo
 * @author Nieves Aracil Cerd�n
 * @version 1.2
 */
public class Rectangulo_NAC extends FiguraGeometrica_NAC {
	private double l1; //lado del rect�ngulo
	private double l2; //lado del rect�ngulo
	
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
	 * Calcula el �rea del rect�ngulo
	 * @return Devuelve el resultado de multiplicar los lados.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el per�metro del rect�ngulo
	 * @return Devuelve el resultado de la operaci�n que calcula el per�metro del rect�ngulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
