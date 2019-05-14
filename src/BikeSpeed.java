//main class
import java.util.Scanner;
public class BikeSpeed {
    public static void main(String[] args){
        char ch = 'g';
        Scanner sc = new Scanner(System.in);
        Crank crank = new Crank();
        System.out.println("********Main Menu*********");
        while(ch != 'q'){
            System.out.println("Enter Chainrings   - E");
            System.out.println("Display Chainrings - d");
            System.out.println("Shift Chainring Up - U");
            System.out.println("Shift Chainring Dn - D");
            System.out.println("Quit Program -     - q");
            ch = sc.next().charAt(0);
            //System.out.println(ch);
            switch(ch){
                case 'E':
                    System.out.println("Enter Teeth in Big Chainring");
                    crank.bigRing = sc.nextInt();
                    System.out.println("Enter Teeth in Middle Chainring");
                    crank.midRing = sc.nextInt();
                    System.out.println("Enter Teeth in Lower Chainring");
                    crank.smlRing = sc.nextInt();
                    break;
                case 'd':
                    System.out.println("Big Ring    : " + crank.bigRing);
                    System.out.println("Middle Ring : " + crank.midRing);
                    System.out.println("Small Ring  : " + crank.smlRing);
                    System.out.println("Current Ring: " + crank.currentRing);
                    break;
                case 'U':
                    crank.shiftUp();
                    break;
                case 'D':
                    crank.shiftDown();
                    break;
                default:
                    break;
            }
        }


    }
}
