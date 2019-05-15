import java.util.Scanner;
public class Wheels {
    int wheelDiameter;
    private char wheelIn;
    private char ch;
    Scanner wsc = new Scanner(System.in);
    public Wheels(){
        this.wheelDiameter = 25;
        this.ch = 'M';
    }
    public void setWheelDiameter(){
        System.out.println(" 26 in   - M");
        System.out.println(" 700c    - R");
        this.ch = wsc.next().charAt(0);
        if(ch == 'M'){
            this.wheelDiameter = 25;}
        else if(ch == 'R'){
            this.wheelDiameter = 26;}
        else{
            System.out.println("Not an option....try again");}
    }
}
