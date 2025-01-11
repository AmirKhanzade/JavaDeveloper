public class Recktangle {
    //rectangle is the name of the class for this project
    // Declare two member variables of double type:

    //length: Stores the length of the rectangle.

    //width: Stores the width of the rectangle.
    double length;
    double width;

    // Firstly, a No-argument constructor that enables you to create a rectangle object without specifying an initial value for its properties.
    // You can assign default values (for example, 1.0), within the constructor if needed.
    public Recktangle(){
        this.length=1.00;
        this.width=1.00;

    }
    //Secondly, a Parameterized constructor that helps you have control over the initial state of your objects. 
    //You can ensure that rectangles have valid dimensions when they are created. Place this one after your No-argument constructor.
    public Recktangle(double length,double width){
        this.length=length;
        this.width=width;
        
    }
}
