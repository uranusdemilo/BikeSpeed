//main class
import java.util.Scanner;
public class BikeSpeed {
    public static void main(String[] args){
        char ch = 'g';
        Scanner sc = new Scanner(System.in);
        Crank crank = new Crank();
        Cassette cassette = new Cassette();
        Menu menu = new Menu();
        System.out.println("********Main Menu*********");
        while(ch != 'q'){
            menu.printMainMenu();
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
                case 'R':
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
                case 'C':
                    cassette.showCogs();
                    break;
                case 'u':
                    cassette.shiftUp();
                    break;
                case 'd':
                    cassette.shiftDown();
                    break;
            }
        }

    }
}
