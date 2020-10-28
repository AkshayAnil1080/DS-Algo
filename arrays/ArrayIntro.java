package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int[] marks = new int[5];  one way
		
	//	int[] marks
    //  marks = new int[5];   above way in two lines.
		
//		int marks[] =  new int[5]; brackets can come after variable name too.
		// but if you want to declare two array. then use this to less type
		
		int[] marks= {1,2,23,4,5}; 
		double[] marks1 ={22.3, 34, 54.66};//instead of int marks[], classes[]

		
		System.out.println(marks[4]);
		System.out.println(marks1[1]);
		for(int i=0 ;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
	}

}
