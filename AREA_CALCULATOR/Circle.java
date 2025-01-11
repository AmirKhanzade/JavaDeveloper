public class Circle {
    // Create a New Java Class (as discussed above) named Circle to represent a
    // circle shape
    //The Circle class represents a circular shape;
    // therefore, it will store information such as the radius of the circle. Declare a member variable named radius of double type.
    double radius;

    //Define a No-argument constructor inside the Circle class like the Rectangle class, and assign a default value to radius (for example, 1.0)
    public Circle(){
        this.radius=1.00;

    }
    // Now, define a Parameterized constructor.
    public Circle(double radius){
        this.radius=radius;
        
    }
}
