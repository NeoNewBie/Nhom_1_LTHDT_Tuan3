import java.util.Scanner;

public class bai4 {
     public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui (VND) : ");
        float Tien_gui = sc.nextFloat();
        System.out.print("Nhap lai hang nam (%/nam) : ");
        float lai_hang_nam = sc.nextFloat();
        System.out.print("Nhap so thang gui : ");
        int So_thang = sc.nextInt();
        float Tien_lai = (float)Tien_gui*lai_hang_nam/100/12*So_thang;
        System.out.println("So tien lai sau 12 thang la : " + Tien_lai);
        System.out.println("Tong so tien cuoi ky la : " + (Tien_lai + Tien_gui));
     }
}
