
public class Problem1 {
	public static void main(String[] args) {
		int s = 0;
		int s3 = 0;
		int s5 = 0;
		int s15 = 0;
		final int N = 1000;

		s3 = (N/3*3 + 3)*(N/3)/2;
		s5 = (N/5*5 + 5)*(N/5)/2;
		s15 = (N/15*15 + 15)*(N/15)/2;
		s = s3 + s5 -s15;
		System.out.println(s);

		/*
		int i = 0;
		for(i=3;i<N;i+=3){
			s3 += i;
		}
		for(i=5;i<N;i+=5){
			s3 += i;
		}
		for(i=15;i<N;i+=15){
			s3 += i;
		}
		s = s3 + s5 - s15;
		System.out.println(s);
		 */
	}
}
