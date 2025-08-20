import java.util.Random;
import java.util.Arrays;
class SillySort{
	static Random rand=new Random();
	public static boolean isSorted(int a[]){
		for(int i=1;i<a.length;i++){
			if(a[i-1]>a[i]){
				return false;
			}
		}
		return true;
	}
	public static void sort(int arr []){
		while(!isSorted(arr)){
			for(int i=0;i<arr.length;i++){
				int j=rand.nextInt(arr.length);
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	public static void main(String  [] args){
		int arr[]={5,3,4,2,1};
		sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}