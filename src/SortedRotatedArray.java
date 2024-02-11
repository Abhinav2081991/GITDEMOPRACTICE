//public class SortedRotatedArray {
//
//
//        public int search(int[] nums, int target) {
//
//            int pivot = findPivot(nums);
//
//            if(pivot > 0 && target > nums[0] && target< nums[pivot]){
//                binarySearch(nums , 0 , pivot, target );
//            }  else{
//                binarySearch(nums , pivot , nums.length-1, target);
//            }
//        }
//
//        int binarySearch(int [] arr , int start , int end, int target){
//
//            while(start<=end){
//                int mid = start + (end - start)/2;
//
//                if(arr[mid]==target){
//                    return mid;
//                }else if(target<arr[mid]){
//                    start = mid+1;
//                }else{
//                    end = mid-1;
//                }
//
//                return -1;
//            }
//        }
//        int findPivot(int [] arr){
//
//            int start = 0;
//            int end = arr.length-1;
//
//            while(start<=end){
//                int mid = start + (end - start)/2;
//
//                if(mid+1<arr.length && arr[mid]>arr[mid+1]){
//                    return mid+1;
//                }
//                else if(arr[mid]> arr[start] && mid+1<arr.length && arr[mid]<arr[mid+1]){
//                    start = mid+1;
//                }else{
//                    end = mid-1;
//                }
//            }
//            return -1;
//        }
//    }
//
////  nums = [4,5,6,7,0,1,2]
//
//
