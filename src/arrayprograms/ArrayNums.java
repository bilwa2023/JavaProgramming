import java.util.*;
class ArrayNums{
	public static int [] getAnswer(int nums[],int n){
		int answer[]=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			if(i==n){
				answer[i]=product(nums);
			}
			else
				answer[i]=nums[i];
		}
		return answer;
	} 
	public static int product(int [] nums){
	int prod=1;
		for(int i=0;i<nums.length;i++){
			prod*=nums[i];
		}
		return prod;
	}
	public static void main(String [] args){
		int [] nums={2,4,6,8};
		for(int i =0;i<nums.length;i++){
			System.out.println(Arrays.toString(getAnswer(nums,i)));
		}
	}
}