package Day_14_ExceptionHandling.in.kgcoding;

public class CustomException extends Exception {
    private double degrees;

    public CustomException(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public String getMessage(){
        return("Not in Normal Range");
    }

    public double degrees() {
        return(this.degrees);
    }
}
