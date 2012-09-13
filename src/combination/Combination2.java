package combination;

public class Combination2 {
	public static void main(String[] args) {
		Combination2 con = new Combination2();
		int[] array = {5,3,9,4,6,7,8,1};
		int n = array.length;
		int m = 7;
		int[] comb = new int[m];
		for(int i=0;i<m;i++)
			comb[i] = 0;
		con.combination(array,n,m,comb);
	}
	
	void combination(int[] array,int n,int m,int[] comb) {
		//for i=0...m-1,it must include at least one of the elements in m...n-1
		for(int i=n;i>=m;i--) {
			//all combinations with the last one included
			comb[m-1] = array[i-1];
			if(m>1)
				combination(array,i-1,m-1,comb);
			//selection completed, print out
			else {
				for(int j:comb)
					System.out.print(j+" ");
				System.out.println();
			}
		}
	}
}

