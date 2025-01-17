
import  java.util.Scanner;
public class Main {

    //Hàm tính phương trình bậc 2
    public static void QuadEqual(int a, int b,int c) {
        double x;
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            x=-c*1.0/b;
            System.out.println("Phương trình có 1 nghiệm: "+String.format("%.2f",x));
        } else {
            double delta = b * b - 4 * a * c;
            if(delta > 0) {
                double x1,x2;
                x1 = (-b + Math.sqrt(delta))/2.0 * a;
                x2 = (-b - Math.sqrt(delta))/2.0 * a;
                System.out.println("Phương trình có 2 nghiệm: x1 = " + String.format("%.2f",x1) + ", x2 = " + String.format("%.2f",x2));
            } else if(delta == 0) {
                double xb = -b / (2.0 * a);
                System.out.println("Phương trình có 1 nghiệm: "+String.format("%.2f",xb));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số phương trình bậc 2: ");

        System.out.print("Nhập hệ số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập hệ số b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập hệ số c: ");
        int c = scanner.nextInt();

        //Biện luận phương trình bậc 2
        QuadEqual(a,b,c);
    }
}