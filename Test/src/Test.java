import java.awt.List;
import java.util.ArrayList;



public class Test {
    private static int[] is = new int[] { 1, 2, 3, 4};
    private static int total;
    private static int m = 2;
    
    public static void main(String[] args) {
    	ArrayList<Integer> iL = new ArrayList<Integer>();
        //new Test().plzh("*", iL,  m);
    	int[] b = new int [2];
    	combine( is , 4, 2 , b,2);
        System.out.println("total : " + total);
    }
    private void plzh(String s, ArrayList<Integer> iL, int m) {
        if(m == 0) {
            System.out.println(s);
            total++;
            return;
        }
        ArrayList<Integer> iL2;
        for(int i = 0; i < is.length; i++) {
            iL2 = new ArrayList<Integer>();
            iL2.addAll(iL);
            if(!iL.contains(i)) {
                String str = s + is[i];
                iL2.add(i);
                plzh(str, iL2, m-1);
            }
        }
    }
    

	static void combine( int a[], int n, int m,  int b[],  final int M )
	 
	{
	 
	  for(int i=n; i>=m; i--)   // 注意这里的循环范围
	 
	  {
	 
	    b[m-1] = i - 1;
	 
	    if (m > 1)
	 
	      combine(a,i-1,m-1,b,M);
	 
	    else                     // m == 1, 输出一个组合
	 
	    {
	 
	      for(int j=M-1; j>=0; j--)
	 
	    	  System.out.printf(a[b[j]] +" ") ;
	      	  System.out.println();	
	    }
	 
	  }
	 
	}
}