import java.io.IOException;

public class Menu {
    public Menu(){
    }
    public void printMainMenu(){
        System.out.println("*********MAIN MENU*********");
        System.out.println("* Enter Chainrings   - E  *");
        System.out.println("* Display Chainrings - R  *");
        System.out.println("* Shift Chainring Up - U  *");
        System.out.println("* Shift Chainring Dn - D  *");
        System.out.println("* Display Cass Cogs  - C  *");
        System.out.println("* Shift Cass Up      - u  *");
        System.out.println("* Shift Cass Down    - d  *");
        System.out.println("* Set Wheel Size     - W  *");
        System.out.println("* Calculate Speed    - S  *");
        System.out.println("* Reserved Test      - x  *");
        System.out.println("* Quit Program -     - q  *");
        System.out.println("***************************");
    }
    public void wheelSizeMenu(){
        System.out.println("*Set Wheel Size*");
        System.out.println(" 26 in   - M");
        System.out.println(" 700c    - R");
        System.out.println(" Enter Selection: ");
    }
    public void promptEnterKey() {
        System.out.println("Press ENTER Key to Continue");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
