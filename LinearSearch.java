public class LinearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {5, 12, 21, 45, 7, 10};
        int key = 21;
        System.out.println(linearSearch(numbers, key));
    }
}
