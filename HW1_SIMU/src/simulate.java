import java.util.Arrays;
import java.util.Random;


public class simulate {
		private static int nRes = 1000;
	 	private static int[] res ;
	 	private static int[] resCopy ;
	    private static int total;
	    static Random ra= new Random();
	    
	   static boolean checkReceive(int arr[])
	    {
		   for (int i=0;i<arr.length;i++)
			   {if (arr[i]==0)
				   return false;
			   }
		   return true;
	    }
	   static void sendMessage(int arr[],int arrCopy[])
	   {
		   for(int i = 0 ; i < arr.length ; i++)
		   {
			   if ( arrCopy[i]==1)
			   {
				   arr[ra.nextInt(arr.length)]=1;
				   arr[ra.nextInt(arr.length)]=1;
			   }
			   
		   }
		   
	   }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		for (int t=0; t<50; t++)
		{
		res=new int[nRes];
		resCopy=new int[nRes];
		 for(int i = 0 ; i < res.length ; i++) {  
			 res[i] = 0 ;  
         }  
		 res[0]=1;
		 int m=0;
		 while (checkReceive(res)==false)
		 {
			 for(int i = 0 ; i < res.length ; i++) {  
				resCopy[i]= res[i] ;  
	         }  
			 sendMessage(res,resCopy);
			// System.out.println(Arrays.toString(res));
			// System.out.println(Arrays.toString(resCopy));
		 m++;
		 }
		 sum+= m;
		 System.out.println(nRes);
		 System.out.println(sum/50 );
		}
		 
	}

}
