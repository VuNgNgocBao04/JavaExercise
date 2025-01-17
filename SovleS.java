import java.util.Scanner;


public class Main {
    private  int n;
    private double x;
    //Hàm khởi tạo giá trị
    public Main(int n1, double x1) {
        this.n = n1;
        this.x = x1;
    }
    //Hàm tính giai thừa
    public long Factoria(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factoria(n-1);
        }
    }
    //Hàm tính biểu thức S
    public double Solve(int  n,double x) {
        double term;
        double S=1;
        for(int i = 1; i<=n;i++) {
            term = 1;
            for(int j=0; j<i; j++) {
                term *= (n-j);
            }
            term = (Math.pow(x,n) * term)/Factoria(n);
            S += term;
        }
        return S;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhập n: ");
        n = scanner.nextInt();

        double x;
        System.out.print("Nhập x: ");
        x = scanner.nextDouble();

        Main Result = new Main(n,x);
        System.out.println("Giá trị biểu thức S là: "+ String.format("%.2f", Result.Solve(n,x)));
    }
}