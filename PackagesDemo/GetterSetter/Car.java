package PackagesDemo.GetterSetter;

public class Car {
    private String colour; //want public access
    private String model; //public access
    private double fuellevel;
    private long costOfPurchase; //want default access

    
    public Car(String colour, String model, double fuellevel, long costOfPurchase) {
        this.colour = colour;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColour(){
        return(colour);
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getModel(){
        return(model);
    }
}
