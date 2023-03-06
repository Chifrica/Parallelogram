public class Parallelogram {
    private double side1;
    private double side2;
    private double angle;

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getAngle(){
        return angle;
    }

    public void setSide1(double side1){
        if (side1 < 0){
            side1 = 0;
        }
        this.side1 = side1;
    }

    public void setSide2(double side2){
        if (side2 < 0){
            side2 = 0;
        }
        this.side2 = side2;
    }

    public void setAngle(double angle){
        if (angle < 0){
            angle = 0;
        }

        if (angle > 180){
            angle = 180;
        }
        this.angle = angle;
    }

    public Parallelogram(double side1, double side2, double angle){
        setSide1(side1);
        setSide2(side2);
        setAngle(angle);
    }

    public Parallelogram(){
        this(0, 0, 0);
    }

    public double calculateArea() {
        return side1 * side2 * Math.sin(angle * Math.PI/180);
    }

    public double calculatePerimeter(){
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(4.5, 6.5, 34.5);
        System.out.printf("Area: %.1f \nPerimeter: %.2f", parallelogram.calculateArea(), parallelogram.calculatePerimeter());
    }
}
