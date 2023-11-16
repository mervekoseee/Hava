import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int derece;
        System.out.println("Bir Sıcaklık değeri giriniz: ");
        derece = inp.nextInt();
        if(derece < 5){
        System.out.println("Kayak yapabilirsiniz!");
        } else if (derece >= 5 && derece <=25) {
            if (derece <= 15){
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (derece >= 10){
                System.out.println("Pikniğe gidebilirsin.");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}