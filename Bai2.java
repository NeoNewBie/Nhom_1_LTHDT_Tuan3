import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap chieu cao (m): ");
        double chieuCao = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Nhap gioi tinh (nam/nu): ");
        String gioiTinh = sc.nextLine();
        System.out.print("Ban co thich lap trinh khong? (co/khong): ");
        String traLoi = sc.nextLine();
        boolean thichLapTrinh = traLoi.equalsIgnoreCase("co");
        System.out.println("\n===== THONG TIN CA NHAN =====");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieuCao + " m");
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Co thich lap trinh khong? " + (thichLapTrinh ? "Co" : "Khong"));
    }
}
