public class App {
    public static void main(String[] args) {
       
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Triangle triangle = new Triangle(10.0,10.0);

        ausgabe("-------------------- Flächen --------------------");
        ausgabe("Fläche Kreis:    " + circle.area());
        ausgabe("Fläche Rechteck: " + rectangle.area());
        ausgabe("Fläche Dreieck:  " + triangle.area());

    } //end main

    public static void ausgabe(String outStr) {
        System.out.println(outStr);
    } //end ausgabe()

} //end Class
