public class Circle extends Shape {

    private double radius;

    public Circle(double d) {
        this.radius = d;
    } //end Constructor


    @Override
    public double area() {
        //return Math.PI * radius * radius;
        return Math.PI * Math.pow(radius, 2);
    } //end area()
    

} //end Class
