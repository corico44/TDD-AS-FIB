package junit.interval;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervalTest {

	private Interval interval;
	
	@Test
	public void testInterval() {
		interval = new Interval(8, 12);
		assertEquals(8,interval.horaIni);
		assertEquals(12,interval.horaFi);

	}
	@Test(expected = IntervalIncorrecte.class)
	public void testIniciNegatiu() {
		interval = new Interval(-8, 12);
	 }
	
	@Test(expected = IntervalIncorrecte.class)
	public void testFiNegatiu() {
		interval = new Interval(3, -12);
	 }
	
	@Test(expected = IntervalIncorrecte.class)
	public void testIniciM�sGranQue23() {
		interval = new Interval(24, 13);
	 }
	
	@Test(expected = IntervalIncorrecte.class)
	public void testFiM�sGranQue23() {
		interval = new Interval(20, 24);
	 }
	
	@Test(expected = IntervalIncorrecte.class)
	public void testDataIniciMajorDataFi() {
		interval = new Interval(20, 4);
	 }
	
	@Test(expected = IntervalIncorrecte.class)
	public void testIniFiIguals() {
		interval = new Interval(8, 8);
	 }
	
	 @Test
	 public void testRestaTemps() {
		interval = new Interval(8, 13);
		int result = interval.temps(8, 13);
		assertEquals(5,result,0);
	 }
	 
	 @Test
	 public void testPer�odeMat�() {
		interval = new Interval(8, 11);
		String result = interval.periode(8, 11);
		assertEquals("Mat�",result);
	 }
	 
	 @Test
	 public void testPer�odeTarda() {
		interval = new Interval(13, 19);
		String result = interval.periode(13, 19);
		assertEquals("Tarda",result);
	 }
	 
	 @Test
	 public void testPer�odeNit() {
		interval = new Interval(0, 7);
		String result = interval.periode(0, 7);
		assertEquals("Nit",result);
	 }
	 
	 @Test
	 public void testMoltsPer�odes() {
		interval = new Interval(8, 20);
		String result = interval.periode(8, 20);
		assertEquals("M�s d�un per�ode",result);
	 }
	 
	 @Test
	 public void testHoresMat�() {
		interval = new Interval(8, 11);
		int result = interval.horesmati(8, 11);
		assertEquals(3,result,0);
	 }
	 
		@Test(expected = NoEsIntervalDeMat�.class)
		public void testIniHoresNoEsMat�() {
			interval = new Interval(8, 20);
			interval.horesmati(8, 20);
		 }
	 
	 
}
