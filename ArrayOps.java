public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15}; 
        int sum = 0;

        int largest = arr[0];
        int smallest = arr[0];

        
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];

            if(arr[i] > largest)
                largest = arr[i];

            if(arr[i] < smallest)
                smallest = arr[i];
        }

        double avg = sum / arr.length;

        System.out.println("Array: 10 20 5 30 15");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
