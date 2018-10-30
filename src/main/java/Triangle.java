public class Triangle extends Figure{

    double angle;
    double side1;
    double side2;


    public Triangle(int side2, int side1, int angle) {
        this.angle = angle;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {

        return side1 * side2 * Math.sin(angle) / 2;
    }

    @Override
    public double circumference() {
        double c;

        c = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 2 * side1 * side2 * Math.cos(angle));

        return side1 + side2 + c;
    }

    @Override
    public String output() {
        return "Dreieck mit Seitenlänge 1 = " + side1 + " und Seitenlänge 2 = " + side2 + ": " + "Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}