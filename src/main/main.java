package main;

public class main {

	public static void main(String[] args) {

		System.out.println(calculator("10","+","10"));
		
	}
	
	public static double calculator(String sValue1, String sItem, String sValue2) {
		
		Double dResult = (double) 0;
		Double dValue1 = Double.parseDouble(sValue1);
		Double dValue2 = Double.parseDouble(sValue2);
		
		
		if ("+".equals(sItem)) {
			dResult = dValue1+dValue2;
		} else if ("-".equals(sItem)) {
			dResult = dValue1-dValue2;
		} else if ("*".equals(sItem)) {
			dResult = dValue1*dValue2;
		} else if ("/".equals(sItem)) {
			dResult = dValue1/dValue2;
		} else {
			System.out.println("error");
			System.exit(-1);
		}
		
		return dResult;
	}

}
