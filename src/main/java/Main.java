public class Main {
    public static void main(String[] args) {

        System.out.printf("Datenanzeige:%n------------%n%n");

        Figure[] figures = {
          new Triangle(15, 30, 20),
          new Rectangle(5, 20),
          new Square(3),
          new Ellipse(10, 6),
          new Circle(5),
        };


        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].output());
        }
    }
}
