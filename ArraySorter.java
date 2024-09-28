import java.util.Scanner;  
public class ArraySorter 
{  
public static void main(String[] args)   
{  
int n; 

Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  
int swap = 1;
int sum = 0;
while (swap != 0) {

	for (int i = 0; i<n-1; i++)
	{
			if (array[i]>array[i+1]) {
				int m = array[i];
				array[i] = m;
				array[i]=array[i+1];
				array[i+1]=m;
				swap = 1;
				
			} else {
				swap = 0;
			}
		
	}
}

for (int num : array) {
	sum += num;
}
double avg = sum / n;
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  

}  
System.out.println("Sum is: ");
System.out.println(sum);
System.out.println("Average is: ");
System.out.println(avg);





}  
}  