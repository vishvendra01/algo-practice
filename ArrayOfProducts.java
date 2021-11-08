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

    public static int[] solution2(int[] array){
        int[] output = new int[array.length];
        int[] leftProduct = new int[array.length];
        int[] rightProduct = new int[array.length];
        
        int product = 1;
        for(int i=0; i<array.length; i++){
            if(i == 0){
                leftProduct[i] = product;
            }else{
                leftProduct[i] = product * array[i - 1];
                product = leftProduct[i];
            }
        }

        product = 1;
        for(int i=array.length - 1; i >= 0; i--){
            if(i == array.length - 1){
                rightProduct[i] = product;
            }else{
                rightProduct[i] = product * array[i + 1];
                product = rightProduct[i];
            }
        }

        for(int i=0; i<array.length; i++){
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }

    public static void main(String[] args){
        solution1_test1();
    }

    public static void solution1_test1(){
        int[] output = ArrayOfProducts.solution2(new int[]{1, 2, 3, 4});
        if(Arrays.equals(output, new int[]{24, 12, 8, 6})){
            System.out.print("Success");
        }else{
            System.out.print("Failed");
        }
        System.out.println();
    }
}
