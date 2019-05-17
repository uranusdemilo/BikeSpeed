// Crankset Gears
public class Crank {
    int bigRing;
    int midRing;
    int smlRing;
    int cadence;
    int currentRing;
    float speed = (float)(0.0);
    public Crank(){
        this.bigRing = 46;
        this.midRing = 34;
        this.smlRing = 22;
        this.currentRing = this.midRing;
        this.cadence = 90;
        this.speed = 0.0F;
    }
    public void showRings(){
        System.out.println("Big Ring   = " + bigRing);
        System.out.println("Mid Ring   = " + bigRing);
        System.out.println("Small Ring = " + bigRing);
    }

    public void shiftUp(){
        if(this.currentRing == this.smlRing) {
            this.currentRing = this.midRing;
        }
        else if(this.currentRing == this.midRing){
            this.currentRing = this.bigRing;
        }
        else{
            System.out.println("In Big Ring, Cant Upshift!");
        }
    }

    public void shiftDown(){
        if(this.currentRing == this.bigRing){
            this.currentRing = this.midRing;
        }
        else if(this.currentRing == this.midRing){
            this.currentRing = this.smlRing;
        }
        else{
            System.out.println("In Small Ring, Can't Donwshift!");
        }
    }
}
