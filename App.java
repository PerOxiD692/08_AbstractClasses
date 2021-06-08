public class App {
    public static void main(String[] args) {
       
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(10.0, 10.0);

        ausgabe("-------------------- Flächen --------------------");
        ausgabe("Fläche Kreis:   " + circle.area());
        ausgabe("Fläche Dreieck: " + rectangle.area());

    }

    public static void ausgabe(String outStr) {
        System.out.println(outStr);
    }



} //end Class
