package junit.com;

public class SimpleFactory implements PayStationFactory {
	Receipt r;
	RateStrategy rs;
	
	@Override
	public Receipt createRebut(int value){
		r = new StandardReceipt(value);
		return r;
		// TODO Auto-generated method stub
	
	}

	@Override
	public RateStrategy createStrategy(){
		// TODO Auto-generated method stub
		rs = new One2OneRateStrategy();
		return rs;
	}

}
