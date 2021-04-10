import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.println("Nhap vao n : ");
        n = sc.nextInt();

        do{
            System.out.println("Nhap vao m: ");
            m = sc.nextInt();

            if(m != n){
                System.out.println("Gia tri m va n bang nhau. Moi nhap lai lan nua!");
            }
        }while(m != n);

        int [][] arr = new int [n][m];

        nhapMang(arr, n, m);      

        getArray(arr, n, m);

        diagonalMain(arr, n, m);

        diagonalSub(arr, n, m);
    }

    static void getArray(int arr[][], int n, int m){
        System.out.println("Danh sach mang: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void nhapMang(int arr[][], int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap index thu [" + i + "]" + "[" + j + "]" + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void diagonalMain(int[][] arr, int n, int m) {
        int sum = 0;
        System.out.println("* Danh sach cac phan tu tren duong cheo: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("\nTong cac phan tu nam tren duong cheo chinh: " + sum);
    }


    static void diagonalSub(int[][] arr, int n, int m) {
        int sum = 0;
        System.out.println("* Danh sach cac phan tu nam tren duong cheo phu: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == n - 1) {
                    System.out.print(arr[i][j] + "\t");
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("\nTong cac phan tu nam tren duong cheo phu: " + sum);
    }

}