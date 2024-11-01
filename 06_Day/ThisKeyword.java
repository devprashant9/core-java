public class ThisKeyword {
    String name = "";
    float speed = 0.0f;
    ThisKeyword(String name1, float speed1){ //constructor
        this.name = name1; //refers to current instance variable
        this.speed = speed1;
    }
    public void getName() {
        System.out.println("Name of the Car is: " +name);
    }
    public ThisKeyword getSpeed(){
        System.out.println("Speed of the Car is: " +speed);
        return(this); //returning this instance
    }
    public static void main(String[] args) {
        ThisKeyword thar = new ThisKeyword("Thar", 95.06f);
        thar.getName();
        thar.getSpeed();
        ThisKeyword fortuner = new ThisKeyword("Fortuner", 70.06f);
        fortuner.getName();
        fortuner.getSpeed();
    }
}
