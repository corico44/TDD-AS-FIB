package junit.interval;

public class Interval {
	int horaIni, horaFi;
	
	public Interval(int horaI, int horaF) {
		horaIni = horaI;
		horaFi = horaF;
		if(horaIni < 0 || horaFi < 0) throw new IntervalIncorrecte();
		else if (horaIni > 23 || horaFi > 23) throw new IntervalIncorrecte();
		else if (horaIni > horaFi || horaIni == horaFi)throw new IntervalIncorrecte();
	}
	
	int temps(int horaI, int horaF) {
		return horaF-horaI;
	}
	
	String periode(int horaI, int horaF) {
		String per = "";
		if(horaI >= 8 && horaF<=12) per="Matí";
		else if(horaI >= 13 && horaF<=20) per="Tarda";
		else if((horaI >= 21 && horaF <= 23) || (horaI >= 0 && horaF <= 7)) per="Nit";
		else per="Més d’un període";
		return per;
	}
	
	int horesmati(int horaI, int horaF){
		String per = periode(horaI,horaF);
		int hores = 0;
		if(per == "Matí") hores = horaF-horaI;
		else if(per != "Matí")throw new NoEsIntervalDeMatí();
		return hores;
		
	}
}
