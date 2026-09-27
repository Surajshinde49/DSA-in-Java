public class NonChangeble {
    public static void update(int numbers[], int nonChangeble){
        for(int i=0; i<numbers.length; i++){
            numbers[i] += 1;
            System.out.print(numbers[i] + " ");
        }
        nonChangeble = 10;
    }

    public static void main(String[] args) {
        int nonChangeble = 5;
        int numbers[] = {10, 5, 15, 21};
        update(numbers, nonChangeble);
        System.out.println();
        System.out.println(nonChangeble);
    }
}
