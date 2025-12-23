public class Shape {

    public String shape;
    public double area;
    public int side1;
    public int side2;
    public double side3;
    public double side4;
    public int radius;




    public void setParameters(String shape, int radius){
        this.shape = shape;
        this.radius = radius;
        area = 3.1416*radius*radius;
    }
    public void setParameters(String shape, int side1, int side2){
        this.shape = shape;
        this.side1 = side1;
        this.side2 = side2;
        area = 1.00/2.00 * side1 * side2;
    }

    public void setParameters(String shape, double side3, double side4){
        this.shape = shape;
        this.side3 = side3;
        this.side4 = side4;
        area = side3*side4;
    }


    public String details(){
       return "Shape Name: " + shape + "\n" + "Area: " + area;
    }

}
