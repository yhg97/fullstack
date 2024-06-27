package star;
import lombok.*;

@Data
@NoArgsConstructor

public class starcom {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int p = 1; p <= 3; p++) {
            for (int k = p; k >= 1; k--){
                System.out.print(" ");
            }
        for (int k = 20-(2* p); k >= 1; k--) {
            System.out.print("*");
        }

            System.out.println();
        }

        for(int i=1; i<=10; i+=2){
            for(int j=3; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=10; j>i-1; j-=2){
                System.out.print("*");
            }
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=10; j>=i; j-=2){
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 1 ; i <= 5; i++) {
//            for (int k = 1; k <= 4; k++){
//                System.out.print(" ");
//            }
//
//            for (int k = 12; k >= 1; k--) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 10 - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
    }

    }




