//力技で解く場合
/*public class Problem2 {
	public static void main (String[] args){
		int first = 1;
		int second = 2;
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;

		a = first;
		b = second;
		c = a + b;
		sum = b;

		while(c < 4000000){
			if(c%2 == 0){
				sum += c;
			}
			a = b;
			b = c;
			c = a + b;

		}
		System.out.println(sum);
	}
}
*/

//公式

public class Problem2 {
  	public static void main (String [] args) {
  		double alpha = (1 - Math.sqrt(5)) / 2;
  		double beta = (1 + Math.sqrt(5)) / 2;

  		double c = 0;
  		double sum = 0;
  		double i = 3;

  		while(c < 4000000){
  			c = (Math.pow(beta, i) - Math.pow(alpha, i)) / Math.sqrt(5);
  			if(c < 4000000){
  				sum += c;
  		}
  			i = i + 3;
  		}
  		System.out.println(sum);
  	}
}
