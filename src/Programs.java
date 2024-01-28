import javax.sound.midi.SysexMessage;
import java.util.*;
import java.util.stream.Collectors;

public class Programs {

    public static void main(String [] args){


    int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};


//        System.out.println(binarySearch(arr,6));

//        missingNumberInArray();
//        secondLargestElementInarray();

//        findElementOddTimings();

        findElementOddTimings();

    }


    public static int binarySearch(int arr[] , int value){

        int length = arr.length-1;
        int start  = 0;

        while(start <=length){

            int mid =  start + (length-start)/2;
            if(arr[mid]==value){
                return mid;
            }
            else if(value < arr[mid]){
                length = mid -1;
            }
            else {
                start = mid +1;
            }
        }

        return -1;
    }


    public static  void missingNumberInArray(){

        int arr[] = {1,2,3,4,5,7,8,9,10};

        int length = arr.length +1;
        System.out.println(length);

        int sum  = length * (length+1)/2;
        System.out.println(sum);

        int sumArr = 0;
        for(int i=0; i<arr.length; i++){

            sumArr = arr[i]+sumArr;
        }
        System.out.println(sumArr);

        int missingNumber = sum - sumArr;

        System.out.println(missingNumber);

    }

    public static void secondLargestElementInarray(){

        int arr[] = {4,3,5,7,8,3,2,7,9,5,3,5,90,100};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }



    public static void findElementOddTimings(){

        int arr[] = {2,4,3,5,7,8,3,2,7,9,5,3,5,90,100,3,4,6,8,6,6,6,6};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        Set<Integer> s = new HashSet<>(list);
        for(Integer i : s){
//            System.out.println("Frequency of "+ i +"-- is --"+ Collections.frequency(list,i));
            if(Collections.frequency(list,i)%2 !=0){

                System.out.println("Odd Number Frequency of "+i+" is --" + Collections.frequency(list,i));

            }
        }

    }
}
