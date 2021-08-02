package assignment02;

public class LengthConverter {
	public double kmToMile(double km) {
		if(km < 0) {
			throw new IllegalArgumentException("negative input");
		}
		
		return Math.round(km* 0.621371192 * 10000.0)/10000.0 ;
	}
	public double mileToKm(double mile) {
		if(mile < 0) {
			throw new IllegalArgumentException("negative input");
		}
		
		return Math.round(mile/0.621371192 * 10000.0)/10000.0;
	}

	public static void main(String[] args){
		LengthConverter l = new LengthConverter();
		System.out.println("sample output for methods");
		l.kmToMile(1.0);
		l.mileToKm(1.0);
	}



}

