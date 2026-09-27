public class LargestNumInArray {
    public static int largestNum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 7, 2, 1, 2};
        System.out.println(largestNum(numbers));
    }
}
