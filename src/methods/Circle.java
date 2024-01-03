package methods;

public class Circle {

  // Attributes
    private double radius;
  // Constructor

  public Circle(double radius) {
    this.radius = radius;
  }

  // methods

  // area
public  double calculateArea(){
    return Math.PI * radius * radius; // Math.pow(radius, 2)
}
  // circumference
public  double calculateCircleCircumference(){
    return  2 * Math.PI * radius;
}
  // diameter

  public double calculateCircleDiameter(){
    return  2 * radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        '}';
  }

  // display circle details
public void displayDetails(){
  System.out.println("Circle Details:");
  System.out.println("Radius: "+ radius);
  System.out.println("Area: " + calculateArea());
  System.out.println("Circumference: "+ calculateCircleCircumference());
  System.out.println("Diameter: "+ calculateCircleDiameter());
}

}
