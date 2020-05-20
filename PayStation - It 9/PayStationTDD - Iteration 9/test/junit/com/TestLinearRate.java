package junit.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinearRate {
	  RateStrategy rs;
	  

	  /** Fixture for pay station testing. */
	  @Before
	  public void setUp() {
		rs = new LinearRateStrategy();

	  }
	  
	  @Test
	  public void calculTemps() throws IllegalCoinException {
	    assertEquals( "Should display 2 min for 5 cents", 
	                  2, rs.calculaTime(5) );
	  }
	  
	  @Test
	  public void calculTempsAmbMésMonedes() throws IllegalCoinException {
	    assertEquals( "Should display 80 min for 200 cents", 
	                  80, rs.calculaTime(200) );
	  }

}
