
import java.util.Scanner;
public class exercise1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao n kich thuoc mang: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[10];

        inputArray(arr, n);

        System.out.println("Danh sach mang: ");
        getArray1(arr, n);

        System.out.println("\n\nSo lon nhat trong mang: " + maxArray(arr, n));

        System.out.println("\nSo nho nhat trong mang: " + minArray(arr, n));     
        
        prime(arr, sum);

        System.out.println("\nNhap gia tri muon them: ");
        int x = sc.nextInt();

        System.out.println("\nNhap vi tri muon them: ");
        int k = sc.nextInt();

        chen(arr, n, x, k);

        System.out.printf("Danh sach mang sau khi them gia tri [%d] vao vi tri [%d]: \n" , x , k);
        getArray2(arr, n);

        System.out.println("\nNhap vi tri muon sua: ");
        int e = sc.nextInt();

        change(arr, n, e);
        getArray2(arr, n);
    }

    static void inputArray(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao index thu " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    static void getArray1(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void getArray2(int arr[], int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    


    static int maxArray(int[] arr, int n) {
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minArray(int[] arr, int n) {
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    static void prime(int arr [] ,int sum) {
        System.out.print("\n\nCac so nguyen to trong mang: ");

        for (int i = 0; i < 10; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + "\t");
                sum += arr[i];
            }

        }

        System.out.println("\n\nTong cac so nguyen to trong mang: " + sum);
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
                
        return true;

    }
    
    static void chen(int[] arr, int n, int x, int k) {
        for (int i = n; i > k; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = x;
    
    }
    
    static void change(int [] arr, int n, int e) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[e]) {
                System.out.println("\nNhap gia tri muon sua: ");
                arr[i] = sc.nextInt();
            }
        }
    }
}

