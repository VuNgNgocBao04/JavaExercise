import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private String string;

    //Hàm tạo chuỗi đầu vào
    public Main(Scanner scanner) {
        System.out.print("Nhập chuỗi: ");
        this.string = scanner.nextLine().trim();
    }

    // Hàm xoá bỏ chữ a và đảo ngược chuỗi
    public void removeTargetCharAndReverse(char target) {
        StringBuilder alterString = new StringBuilder();
        for(char c : string.toCharArray()) {
            if(c != target) {
                alterString.append(c);
            }
        }
        string = alterString.reverse().toString();
    }

    // Hàm kiểm tra xem chuỗi là các số cách nhau không và nếu có thì có bao nhiêu số
    public boolean checkNum(String inp) {
        String num = "^-?\\d+(\\.\\d+)?$";
        return inp.matches(num);
    }

    public void validateAndCountNum(String inp) {
        String[] parts = inp.split(" ");
        int count = 0;
        boolean check = true;

        for(String part: parts) {
            if(checkNum(part)) {
                count ++;
            } else {
                check = false;
                break;
            }
        }
        System.out.println("Output: " + check + (check ? ", có " + count + " số." : ""));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main Str = new Main(scanner);

        //Nhập ký tự cần loại bỏ và đảo ngược chuỗi
        System.out.print("Nhập ký tự cần loại bỏ: ");
        char target = scanner.next().charAt(0);
        Str.removeTargetCharAndReverse(target);
        System.out.println("CHuỗi sau khi xử lý: " + Str.string);

        //Kiểm tra xem chuỗi chỉ có phần tử số và đếm các phần tử số đó
        scanner.nextLine();
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String Str1 = scanner.nextLine();
        Str.validateAndCountNum(Str1);
    }
}