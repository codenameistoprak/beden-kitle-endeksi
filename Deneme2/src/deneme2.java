import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
     // kulanıcıdan boy ve kilo değerlerini alıp
	// vücut kitle endeksini hesaplama kilo/boy*boy
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kilonuzu giriniz:");	
        int kilo = scanner.nextInt();
      System.out.print("Boyunuzu giriniz(Örnek:1,76):");
   
    double boy = scanner.nextDouble();
    double kitle = (kilo/boy)*boy;
    System.out.println("Vücut kitle endeksiniz:" + kitle);
	scanner.close();
	}
	

}
