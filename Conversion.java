import java.util.Scanner;
class Conversion {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 // decimal number
 int decimal = in.nextInt();
 // convert decimal to binary
 String binary = Integer.toBinaryString(decimal);
 System.out.println("BINARY IS " + binary);
 //convert decimal to octal
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(decimal));
 }
}