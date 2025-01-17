import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int n;
    private long[] fib;

    //Hàm khởi tạo
    public Main(int n1) {
        n = n1;
        fib = new long[n+1];
        fib[0] =0;
        if(n > 0) {
            fib[1] = 1;
        }
    }
    //Hàm tìm phần tử thứ n của da Fibonacci
    public void QueryElemN(int m) {
        //Tính phần tử tiếp theo của dãy Fibonacci
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] +fib[i-2];
        }
        if(m<=n) {
            System.out.println("Phần tử thứ "+ m +" là: "+ fib[m]);
        } else {
            System.out.println("Không tồn tại phần tử thứ "+ m);
        }
    }
    //Hàm tìm phần tử gần n nhất
    public void ClosestToN(long m) {
        long closest = fib[0];
        long minDif = Math.abs(m - fib[0]);
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] +fib[i-2];
        }
        for(int i = 1; i<=n; i++) {
            long dif = Math.abs(m - fib[i]);
            if(dif < minDif) {
                closest = fib[i];
                minDif = dif;
            }
        }
        System.out.println("Phần tử trong dãy Fibonacci gần với "+ m +" là: "+ closest);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();
        Main fibonacci = new Main(n);

        //Tìm phần tử thứ n của dãy Fibonacci
        fibonacci.QueryElemN(n);

        long m;
        m = scanner.nextLong();
        Main fibonacci1 = new Main((int)m * 2);
        //Tìm phần tử gần số n nhất trong dãy Fibonacci
        fibonacci1.ClosestToN(m);

        scanner.close();
    }
}