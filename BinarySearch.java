public class BinarySearch {

    // time complexity : O(logn)
    public static int solution1(int[] array, int target){
        if(array.length == 0) return -1;

        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        test1();
        test2();
    }

    public static void test1(){
        int output = BinarySearch.solution1(new int[]{1, 2, 3, 4,5}, 4);
        if(output == 3){
            System.out.print("Success");
        }else{
            System.out.print("Failed");
        }
        System.out.println();
    }

    public static void test2(){
        int output = BinarySearch.solution1(new int[]{1, 2, 3, 4,5}, 9);
        if(output == -1){
            System.out.print("Success");
        }else{
            System.out.print("Failed");
        }
        System.out.println();
    }
}
