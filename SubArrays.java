public class SubArrays {
    public static void subArrays(int arr[]){
        for(int start=0; start<arr.length; start++){
            for(int end=start+1; end<arr.length; end++){
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i] + ",");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 9, 1};
        subArrays(arr);
    }
}
