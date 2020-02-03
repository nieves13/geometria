import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void testArea() {
		Circulo_NAC c1 = new Circulo_NAC(7,"Circulo");
		double res = c1.area();
		assertEquals(153.9384,res,0.0001);
		Circulo_NAC c2 = new Circulo_NAC(0,"Circulo");
		double res2 = c2.area();
		assertEquals(0,res2,0.0001);
		Circulo_NAC c3 = new Circulo_NAC(-3,"Circulo");
		double res3 = c3.area();
		assertEquals(28.2744,res3,0.0001);
	}

	@Test
	public void testPerimetro() {
		Circulo_NAC c1 = new Circulo_NAC(7,"Circulo");
		double res = c1.perimetro();
		assertEquals(43.9824,res,0.0001);
		Circulo_NAC c2 = new Circulo_NAC(0,"Circulo");
		double res2 = c2.perimetro();
		assertEquals(0,res2,0.0001);
		Circulo_NAC c3 = new Circulo_NAC(-3,"Circulo");
		double res3 = c3.perimetro();
		assertEquals(18.8496,res3,0.0001);
	}

}
