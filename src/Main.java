import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*100);
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("Mời bạn nhập 1 số bất kì tôi sẽ tìm số đó cho bạn trong mảng này: ");
        Scanner sc = new Scanner(System.in);
        int ran = sc.nextInt();
        System.out.println("Số "+ran);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if (arr[i][j] == ran) {
                    System.out.println( " xuất hiện tại vị trí (hàng: " + i + ", cột: " + j + ")");
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("không tìm thấy trong mảng"+ flag);
        }
    }
}