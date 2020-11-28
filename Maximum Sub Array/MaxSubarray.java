package paketic;

public class MaxSubarray {

	public static void main(String[] args) {
	
		int [] niz = {7,-2,6,2,4,-5,-9,-8,-4,-3};
		//[-2,1,-3,4,-1,2,1,-5,4]
		//[-1,-2]
		//[-1,0,-2]
		//[-1,-1,-2,-2]
		
		System.out.println(maximumSubarray(niz));
		
	}
	
	public static int maximumSubarray(int[] nums ) {
		int x=Integer.MIN_VALUE,q=0,n=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(nums.length==2)
				if(nums[0]>0 && nums[1]>0)
					return nums[0]+nums[1];
				else if(nums[0]>nums[1])
					return nums[0];
				else
					return nums[1];
			if(i==0 && nums[i]>x) {
				x=nums[i];
				q=x;
				if(nums[i]>n)
					n=nums[i];
				continue;
			}
			if(nums[i]>n)
				n=nums[i];
			if(nums[i]>x && x<0 && nums[i]>0) {
				x=nums[i];
				continue;
			}
			if(nums[i]>x && x<0 && nums[i]<0) {
				x=nums[i];
				continue;
			}
			if(x==nums[i] && x<0 && nums[i]<0) {
				continue;
			}
			if(x<0 && nums[i]>x && nums[i]>0) {
				x=nums[i];
				q=x;
			}
			x+=nums[i];
			if(x>q)
				q=x;
		}
		if(n>q)
			return n;
		return q;
		
	}

}
