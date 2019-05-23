//main class
import java.util.Scanner;
public class BikeSpeed {
    public static void main(String[] args){
        char ch = 'g';
        float speed;
        Scanner sc = new Scanner(System.in);
        Crank crank = new Crank();
        Cassette cassette = new Cassette();
        Wheels rearWheel = new Wheels();
        Menu menu = new Menu();
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
                    menu.promptEnterKey();
                    break;
                case 'U':
                    crank.shiftUp();
                    System.out.println("Current Chainring is " + crank.currentRing);
                    menu.promptEnterKey();
                    break;
                case 'D':
                    crank.shiftDown();
                    System.out.println("Current Chainring is " + crank.currentRing);
                    menu.promptEnterKey();
                    break;
                case 'C':
                    cassette.showCogs();
                    menu.promptEnterKey();
                    break;
                case 'u':
                    cassette.shiftUp();
                    System.out.println("Current Cog is " + cassette.currentCog + ", gear number " + cassette.currentCogNumber);
                    menu.promptEnterKey();
                    break;
                case 'd':
                    cassette.shiftDown();
                    System.out.println("Current Cog is " + cassette.currentCog + ", gear number " + cassette.currentCogNumber);
                    menu.promptEnterKey();
                    break;
                case 'W':
                    menu.wheelSizeMenu();
                    rearWheel.setWheelDiameter();
                    menu.promptEnterKey();
                    break;
                case 'S':
                    speed = (float)((188.4 * rearWheel.wheelDiameter * crank.cadence * ((float)(crank.currentRing))/(float)(cassette.currentCog))/63360);
                    System.out.println(speed);
                    menu.promptEnterKey();
                    break;
            }
        }

    }
}
