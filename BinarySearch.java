import java.util.*;
import java.io.*;
public class BinarySearch{
  public static int binarySearch(int s, int[] list, int halfPoint){
    int length = list.length();
    if(list[halfPoint] == s){
      //return indexOf(halfPoint)
    }
    if(list[halfPoint] != s){
      if(list[halfPoint] < s){
        halfPoint = (halfPoint + length) /2;
        System.out.println(halfPoint);
        return binarySearch(s, list, halfPoint);
      }
      else if(list[halfPoint] > s){
        halfPoint = halfPoint /2;
        System.out.println(halfPoint);
        return binarySearch(s, list, halfPoint);
      }
    }
    //int startingPoint = list.length()/2;
    
    

  }
    
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.print("Input a filename: ");
    String filename = in.next();
   
    Scanner fin = new Scanner(new File(filename));
    int lines = Integer.parseInt(fin.nextLine());
    int[] arr = new int[lines];
    for(int i = 0; i < lines; i++){
      arr[i] = fin.nextInt();
      System.out.println(arr[i]);
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    //sort array
    System.out.println("Input a value to search for in the file: ");
    int search = in.nextInt();
    int halved = lines / 2;
    System.out.println(binarySearch(search, arr, halved));
   
  }
}

