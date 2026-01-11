public class Shape2D {
    public String shape;
    public int length;
    public int side1;
    public int side2;
    public int side3;
    public double area;


    public Shape2D(){
        shape = "Square";
        length = 5;
        System.out.println("A " + shape + " has been created with length: " +length);
    }

    public Shape2D(int side1, int side2){
        shape = "Rectangle";
        this.side1 = side1;
        this.side2 = side2;
        System.out.println("A " + shape + " has been created with length: " + side1 +
                " and breadth: " + side2);
    }


    public Shape2D(int side1, int side2, String shape){
        this.shape = "Triangle";
        this.side1 = side1;
        this.side2 = side2;
        System.out.println("A Triangle has been created with height: " + side1 +
                " and base: " + side2);
    }

    public Shape2D(int side1, int side2, int side3){
        this.shape = "Triangle";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("A Triangle has been created with the following sides: " +
                side1 + ", " + side2 + ", " + side3);
    }

    public void area(){
        if (shape.equals("Square"))
        {
            area = length * length;
        }

         else if (shape.equals("Rectangle"))
         {
            area = side1 * side2;
        }

        else if (shape.equals("Triangle"))
        {
            if (side3 == 0) {
                area = 0.5 * side1 * side2;
            }
            else
            {
                double s = (side1 + side2 + side3) / 2.0;
                area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            }
        }

        System.out.println("The area of the " + shape + " is: " + area);

        }

    }
