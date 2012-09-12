package combination;

public class Combination {
	public static void main(String[] args) {
		Combination con = new Combination();
		int[] array = {5,3,9,4,3,7,8,5};
		int start = 0;
		int end = array.length;
		int m = 3;
		con.combination(array,start,end,m);
	}
	
	void combination(int[] array,int st,int ed,int m) {
		if(ed-st+1==m) {
			for(int i=st;i<ed;i++)
			System.out.println(array[i]);
		}
		else {
			for(int i=0;i<m;i++) {
				combination(array,st,m-1,m-i);
				combination(array,m,ed-1,i);
				
				System.out.println();
			}
		}
	}
}
