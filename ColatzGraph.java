package colatz;
import java.math.BigInteger;

public class ColatzGraph {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("500");
		BigInteger f = new BigInteger("2");
		BigInteger g = new BigInteger("3");
		BigInteger h = new BigInteger("1");
		BigInteger i = new BigInteger("0");
		BigInteger j = new BigInteger("2");
		BigInteger count = new BigInteger("0");
		
		System.out.println(a);
		
		while(true) {
			if(a.mod(f).equals(i)) {
				a = a.divide(f);
				count = count.add(h);
			}else {
				a = a.multiply(g);
				a = a.add(h);
				a = a.divide(f);
				count = count.add(j);
			}
			System.out.println(a);
			//System.out.println(a.mod(f).equals(i));
			
			if(a.equals(h)) {
				break;
			}
		}
		System.out.println("count " + count);
	}

}