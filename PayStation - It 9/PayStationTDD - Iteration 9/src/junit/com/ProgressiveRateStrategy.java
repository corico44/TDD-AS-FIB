package junit.com;

public class ProgressiveRateStrategy implements RateStrategy {

	@Override
	public int calculaTime(int insertedSoFar) {
		// TODO Auto-generated method stub
		if(insertedSoFar <= 150) 
			return insertedSoFar/5*2;
		else if(insertedSoFar > 150 && insertedSoFar <=350)
			return (insertedSoFar-150)*3/10 + 60; 
		else
			return (insertedSoFar-350)*1/5 + 120; 
		
	}

}
