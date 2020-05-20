package junit.com;

public interface PayStationFactory {
	
	public Receipt createRebut(int value);
	public RateStrategy createStrategy();
}
