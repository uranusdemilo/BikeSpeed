public class Cassette {
    int rearCogs[] = {28,26,24,22,20,18,16,14,12};
    int currentCogNumber;
    int currentCog;
    public Cassette(){
        this.rearCogs=rearCogs;
        this.currentCogNumber = 4;
        this.currentCog = rearCogs[currentCogNumber];
    }
    public void showCogs(){
        System.out.println("Gear 1      : " + this.rearCogs[0]);
        System.out.println("Gear 2      : " + this.rearCogs[1]);
        System.out.println("Gear 3      : " + this.rearCogs[2]);
        System.out.println("Gear 4      : " + this.rearCogs[3]);
        System.out.println("Gear 5      : " + this.rearCogs[4]);
        System.out.println("Gear 6      : " + this.rearCogs[5]);
        System.out.println("Gear 7      : " + this.rearCogs[6]);
        System.out.println("Gear 8      : " + this.rearCogs[7]);
        System.out.println("Gear 9      : " + this.rearCogs[8]);
        System.out.println("Current Gear: " + this.currentCog);
    }
    public void shiftUp(){
        if(this.currentCogNumber != 8){
            this.currentCogNumber++;
            this.currentCog = this.rearCogs[currentCogNumber];
        }
        else{
            System.out.println("In highest gear, cant shift up!");
        }
    }
    public void shiftDown() {
        if (this.currentCogNumber != 0) {
            this.currentCogNumber--;
            this.currentCog = this.rearCogs[currentCogNumber];
        } else {
            System.out.println("In lowest gear, cant shift down!");
        }
    }
}
