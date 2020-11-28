class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,q1=0,q2=0,output=0;
	    boolean provera1=false, provera2=false;
	     
	        for(int i=0;i<n;i++){
	            if(prices[i]<min){
	                if(i+1==n)
	                    break;
	                else{
	                min=prices[i];
	                q1=i;
	                provera1=true;
                    	continue;
	                }
	            }
	            if(prices[i]>min && q1<i){
	                max=prices[i];
	                q2=i;
	                provera2=true;
	            }
	            if(max-min>output && provera1==true && provera2==true && q1<q2)
	                output=max-min;
	        }
	        return output;
        
    }
}