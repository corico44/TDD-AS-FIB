package junit.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProgressiveRate {
	/** Fixture for pay station testing. */
	
	  RateStrategy rs;
	  @Before
	  public void setUp() {
		rs = new ProgressiveRateStrategy();

	  }
	  
	  @Test
	  public void primeraHoraAmb5() throws IllegalCoinException {
	    assertEquals( "Should display 2 min for 5 cents", 
	                  2, rs.calculaTime(5) );
	  }
	  
	  @Test
	  public void primeraHoraAmb10() throws IllegalCoinException {
	    assertEquals( "Should display 4 min for 10 cents", 
	                  4, rs.calculaTime(10));
	  }
	  
	  @Test
	  public void segonaHora() throws IllegalCoinException {
	    assertEquals( "Should display 120 min for 350 cents", 
	                 120, rs.calculaTime(350) );
	  }
	  
	@Test
	  public void terceraHora() throws IllegalCoinException {
	    assertEquals( "Should display 180 min for 650 cents", 
	    		180,rs.calculaTime(650) );  
	  }

	  

}
