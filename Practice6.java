import java.util.Scanner;

public class Practice6 {
   public static void main(String[] args) {
     int size;
    int[] array;
    Scanner scanner=new Scanner(System.in);

    do{
        System.out.println("Enter a size:");
        size=scanner.nextInt();
        if(size>30){
            System.out.println("Size should not exceed 30");
        }
    }while(size>30);
    array=new int[size];
    int i=0;
    while (i<array.length) {
        System.out.println("Enter a mark for Student "+(i+1)+ ":");
        array[i]=scanner.nextInt();
        i++;
    }
    int count=0;
    System.out.print("List of mark:");
    for(int j=0;j<array.length;j++){
        System.out.print(array[j]+" ");
        if(array[j]>=5&&array[j]<=10){
            count++;
        }
    }
    System.out.println("\n The number of student passing the exam is "+ count);
   }
}
