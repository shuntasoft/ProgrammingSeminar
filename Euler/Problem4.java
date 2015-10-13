import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		int i = 1000;
		int j = 1000;
		int tmp = 0;
		int x = 1000;
		int y = 1000;
		int a = 0;
		int d = 0;
        int cnt= 0;

		char[] c;
		int[] ans = new int[1000000];

		while(x > 1 && y > 1){
			for(d = 0;d < 1000; d++){
				for(a = d; a < 1000; a++){
					x = i - d;
					y = j - a;
					tmp = x * y;
					String s = String.valueOf(tmp);
					c = s.toCharArray();
/////////////////////////////////////////////回文判別///////////////////////////////////////////
					for(int b = 0; b < c.length; b++){
						if(c[b] == c[c.length - b - 1]){
							if(b == c.length - 1){
								//System.out.println(tmp);
								int e = Integer.parseInt(s);
								ans[cnt] = e;
								cnt++;
							}
						}else {
							break;
						}
					}
/////////////////////////////////////////////////////////////////////////////////////////////////

				}
			}
		}

		Arrays.sort(ans);
		System.out.println(ans[ans.length - 1]);
	}


}

