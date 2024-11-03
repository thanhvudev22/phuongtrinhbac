/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phuongtrinhbac1;

import java.util.Scanner;





public class Phuongtrinhbac1 {

        public static String giaiPhuongTrinh(double a, double b) {
          if (a == 0) {
            if (b == 0) {
                return "Phương trình có vô số nghiệm.";
            } else {
                return "Phương trình vô nghiệm.";
            }
        } else {
            double x = -b / a;
            return "Phương trình có nghiệm x = " + x;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            System.out.println("Giải phương trình bậc 1 dạng ax + b = 0");
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();
            
            // Gọi phương thức giaiPhuongTrinh và in ra kết quả
            String ketQua = giaiPhuongTrinh(a, b);
            System.out.println(ketQua);
        }
    
}

   