package assignment02;

import static org.junit.Assert.*;
import static assignment02.LengthConverter.*;
import org.junit.Test;

public class LengthConverterTest {
	
	@Test
	public void TestkmToMile1() {
		LengthConverter l = new LengthConverter();
		assertTrue(l.kmToMile(1.0) == 0.6214);
	}
	@Test
	public void TestkmToMile2() {
		LengthConverter l = new LengthConverter();
		assertTrue(l.kmToMile(999.0) == 620.7498);
	}
	@Test (expected = IllegalArgumentException.class)
	public void TestkmToMile3() {
		LengthConverter l = new LengthConverter();
		l.kmToMile(-10.0);
	}
	@Test
	public void TestmileToKm1() {
		LengthConverter l = new LengthConverter();
		assertTrue(l.mileToKm(1.0)== 1.6093);
	}
	@Test 
	public void TestmileToKm2() {
		LengthConverter l = new LengthConverter();
		assertTrue(l.mileToKm(999.0) == 1607.7347);
	}
	@Test (expected = IllegalArgumentException.class)
	public void TestmileToKm3() {
		LengthConverter l = new LengthConverter();
		l.mileToKm(-10.0);
	}
	
	
	
	

} 

