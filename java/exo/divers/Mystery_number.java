import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
class Mystery_number{
    Random rand;
    public static void main(String[] args) {
        int mystery_number = ThreadLocalRandom.current().nextInt(1, 11);
        int count = 0;
        //System.out.println(mystery_number);
        Scanner sc = new Scanner(System.in);
        String num = "20";
        String continue_game = "";
        while(Integer.parseInt(num) != mystery_number || continue_game.equals("Y")){
            System.out.println("Tapez un nombre :");
            num = sc.nextLine();
            if(Integer.parseInt(num) < 0 || Integer.parseInt(num) > 10)
            {
                System.out.println("Chiffre hors limites ! Le chiffre mystère est entre 1 et 10 !");
                continue;
            }
            if(count >=5){
                System.out.println("Perdu ! Vous avez épuisé vos 5 essais. Voulez-vous retenter ? Y pour oui, autre touche pour non: ");
                continue_game = sc.nextLine();
                if(continue_game.equals("Y"))
                {
                    count = 0;
                    continue;
                }
                else
                {
                    break;
                }
            }
            count++;
            if(Integer.parseInt(num) == mystery_number){
                System.out.println(String.format("Bravo vous avez trouvé en %d essai !",count));
                System.out.println("Gagné ! Voulez-vous retenter ? Y pour oui, autre touche pour non: ");
                continue_game = sc.nextLine();
                if(continue_game.equals("Y"))
                {
                    count = 0;
                    continue;
                }
                else
                {
                    break;
                }
            }else if(Integer.parseInt(num) > mystery_number){
                System.out.println("Trop grand");
            }else{
                System.out.println("Trop petit");
            }
        }
        sc.close();
    }
}