import static org.junit.Assert.*;

import org.junit.Test;


public class testTri {
Triangle t;
long[] a;



	@Test
	public void test() {
		t=new Triangle(3,3,4);
		assertEquals("Isosceles",t.getType(t));
		t=new Triangle(3,5,4);
		assertEquals("Scalene",t.getType(t));
		t=new Triangle(3,3,3);
		assertEquals("Regular",t.getType(t));
		a=t.getBorders();
		t=new Triangle(a[0],a[1],a[2]);
		assertEquals(true,t.isTriangle(t));
		t=new Triangle(9,3,3);
		assertEquals("Illegal",t.getType(t));
		t=new Triangle(0,3,-1);
		assertEquals("Illegal",t.getType(t));
		
	}

}
