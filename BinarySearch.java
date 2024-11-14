import java.util.*;
import java.io.*;
public class BinarySearch{
  //public static int binarySearch(int s){


  //}
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.print("Input a filename: ");
    String filename = in.next();
    Scanner fin = new Scanner(new File(filename));


    int lines = Integer.parseInt(fin.nextLine());
    int[] arr = new int[lines];
    for(int i = 0; i < lines; i ++){
      arr[i] = fin.nextInt();
      System.out.println(arr[i]);
    }
    //sort array
    System.out.println("Input a value to search for in the file: ");
   
  }
}

