package star;
import lombok.*;

@Data
@NoArgsConstructor

public class starcom {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < 3-i ; j++){
                System.out.print("");
            }
            for(int k = 0; k <= 10; k++){
            System.out.print("*");
            }
            System.out.println();
        }


    }

}
