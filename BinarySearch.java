public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            else if (numbers[mid] < key) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {5, 10, 17, 25, 29};
        int key = 25;
        System.out.println(binarySearch(numbers, key));
    }
}
