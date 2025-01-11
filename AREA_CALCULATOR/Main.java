public class Main {
   //Create Rectangle and Circle objects inside your main program to represent these shapes
   // and provide values to their properties using their parameterized constructors, 
   //so you can leverage the flexibility of deciding the state of your object while it is created. 
   public static void main(String[] args){
    Recktangle reck1=new Recktangle(2.43,1.96);
    Circle circ1=new Circle(2.63);
    // Within the main method, 
    //call the calculateRectangleArea method, pass the rectangle reference as an argument, and store the result in a double type of variable.
    double areaofRecktangle=shapeMetricCalculator.calculateRectangleArea(reck1);
    //do this for circle
    double areaofCircle=shapeMetricCalculator.calculateCircleArea(circ1);
    //Now, call the calculateCircleArea method, in the same way, and store the result in a double type of variable. like above
    //Print the respective areas of Rectangle and Circle objects using the print statements.
    System.out.println("the area of the circle is : "+areaofCircle);
    System.out.println("the area of the recktangle is : "+areaofRecktangle);


   }
}
