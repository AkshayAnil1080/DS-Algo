package sets;
import java.util.*;
import java.util.Map.Entry;
public class FreqOfArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[] = { 10,12,10,15,10,20,12,12};
		int n =  arr.length;
		countFreq(arr, n);
		System.out.println();
		naive(arr,n);
		
	}
	static void countFreq(int arr[]  , int n)
	{
		HashMap<Integer, Integer> map =  new HashMap<>();
		for( int i =0 ; i<n ;i++)
		{
//			if(map.containsKey(arr[i]))
//			{
//				map.put(arr[i] , map.get(arr[i]) +1);
//				
//			}
//			else
//			{
//				map.put(arr[i], 1);
//			}
			  
		map.put(arr[i], map.getOrDefault(arr[i], 0) +1);  // if present any value then +1. else 0+1
		}
		for( Entry<Integer, Integer> e :  map.entrySet())
			System.out.println(e.getKey() +  " " +  e.getValue());
	}
	
	static void naive( int arr[] , int n)
	{
		for( int i = 0; i <n ;i++)
		{
			boolean flag  = false;
			for( int j = 0 ; j<i;j++)
			{
				if(arr[i] == arr[j])   // check if seen before
				{
					flag = true;
					break;
				}
			}
			if(flag == true)  //if seen ignore
				continue;
			
			int freq = 1;      // if not seen before count the frequency
			for( int j =i+1; j<n ;j++)
			{
				if(arr[i] == arr[j])
					freq++;
			}
			System.out.println(arr[i] + " " + freq);
		}
	}

}
