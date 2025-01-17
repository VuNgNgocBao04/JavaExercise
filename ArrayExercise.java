import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private int n;
    private int[] array;
    //Hàm tạo
    public Main(int n1) {
        n = n1;
        array = new int[n];
    }
    //Hàm in
    public void PrintArray(){
        System.out.println(Arrays.toString(array));
    }
    //Hàm gán giá trị cho mảng
    public void setArray(int[] inputArray) {
        System.arraycopy(inputArray, 0, array, 0, n);
    }
    //Hàm tìm số số dương không chia hết cho 3
    public int CountPositiveNotDiv3() {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] > 0 && array[i] % 3 != 0) {
                count ++;
            }
        }
        return count;
    }
    //Hàm tính tổng và trung bình cộng của dãy trong khoảng [-5,25]
    public void SumandAverage(int a, int b) {
        int count=0;
        int sum=0;
        double average;
        for(int i = 0; i < n; i++) {
            if(array[i] >= a && array[i] <= b) {
                count ++;
                sum += array[i];
            }
        }
        if(count > 0) {
            average = sum * 1.0 /  count;
            System.out.println("Tổng các phần tử nằm trong khoảng [" + a + "," + b + "]: " + sum + " và trung bình cộng: " + String.format("%.2f", average));
        } else {
            System.out.println("Tổng các phần tử nằm trong khoảng [" + a + "," + b + "]");
        }
    }
    //Hàm xác định phần tử lớn nhất chia hết cho 3
    public void MaxDiv3() {
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] % 3 == 0){
                if(array[i] > max) {
                    max = array[i];
                }
            }
        }
        System.out.println("Phần tử lớn nhất chia hết cho 3: " + max);
    }
    //Hàm sắp xếp phần tử theo giá trị tuyệt đối tăng dần
    public void SortAbs() {
        Integer[] tempArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(tempArray, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        array = Arrays.stream(tempArray).mapToInt(Integer::intValue).toArray();
    }
    //Hàm loại bỏ phần tử chia hết cho 5 và không chia hết 3
    public void removeDiv5andnotDiv3() {
        array = Arrays.stream(array).filter(x -> !(x % 5 == 0 && x % 3 != 0)).toArray();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] Input_array;
        Input_array = new int[n];
        for(int i = 0; i < n; i++) {
            Input_array[i] = scanner.nextInt();
        }

        Main arr = new Main(n);
        arr.setArray(Input_array);

        //Đếm số phần tử dương không chia hết cho 3
        System.out.println("Số phần tử dương không chia hết cho 3 là: " + arr.CountPositiveNotDiv3());

        //Tính tổng và trung bình cộng các phần tử trong khoảng [-5,25]
        arr.SumandAverage(-5,25);

        //Sắp xếp dãy để có giá trị tuyệt đối tăng dần
        System.out.println("Dãy sắp xếp có giá trị tuyệt đối tăng dần: ");
        arr.SortAbs();
        arr.PrintArray();

        //Tìm phần tử chia hết cho 3 lớn nhất
        System.out.println("Phần tử chia hết cho 3 lớn nhất trong dãy là: ");
        arr.MaxDiv3();

        //Loại bỏ các phàn tử chia hết cho 5 và không chia hết cho 3
        System.out.println("Dãy mới sau khi loại bỏ phần tử chia hết cho 5 và không chia hết cho 3 là: ");
        arr.removeDiv5andnotDiv3();
        arr.PrintArray();

    }
}