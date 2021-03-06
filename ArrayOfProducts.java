import java.util.Arrays;

public class ArrayOfProducts {

    public static int[] solution1(int[] array) {
        int[] output = new int[array.length];
        for(int i = 0; i<array.length; i++){
            int product = 1;
            for(int j=0; j<array.length; j++){
                if(i != j){
                    product = product * array[j];
                }
            }
            output[i] = product;
        }
        return output;
    }

    public static void main(String[] args){
        solution1_test1();
    }

    public static void solution1_test1(){
        int[] output = ArrayOfProducts.solution1(new int[]{1, 2, 3, 4});
        if(Arrays.equals(output, new int[]{24, 12, 8, 6})){
            System.out.print("Success");
        }else{
            System.out.print("Failed");
        }
        System.out.println();
    }
}
