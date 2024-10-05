import java.util.*;
class MergeWithMidValue{
 public static void main(String[] args){
    int [] arr = {1,2,4,5,6};
    int [] arr1 ={5,6,7,8,9};
    int [] arr3 = new int[arr.length+arr1.length];
    int i = 0;
    for(int x:arr){
        arr3[i] = x;
        i++;

    }
    for(int x:arr1){
        arr3[i] = x;
        i++;
    }
    Arrays.sort(arr3);
    int num = arr3.length/2;
    int num1 = (arr3.length/2)-1;
    System.out.println(arr3[num]+arr3[num1]);
 }   
}