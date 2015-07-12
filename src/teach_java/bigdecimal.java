package teach_java;

import java.math.BigDecimal;

public class bigdecimal {

	public static void main(String[] args) {
	double x=0.3+0.3+0.3;
	x=0.3+0.6;
	System.out.print(x );
	BigDecimal y = new BigDecimal("0.3");
	y=y.add(y).add(y);
	//System.out.print(y==0.9);
	}

}
