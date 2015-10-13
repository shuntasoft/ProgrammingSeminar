
public class Problem3 {

	public static void main(String[] args) {
		long a = 600851475143L;
		long b = 0;
		int i = 3;

		while(a%2 == 0){
			a = a/2;
		}

		b = a;

		while(i < b) {
			if(a != 1){
				if(a%i == 0){
					a = a/i;
					System.out.println(i);
				}
				i = i + 2;

			}
		}
	}
}
