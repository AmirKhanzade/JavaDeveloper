public class shapeMetricCalculator {
    //Create a New Java Class (as discussed above) and name it ShapeMetricCalculator. 
    //This class will contain methods for calculating shape properties like area in this lab (and maybe perimeter in the future).
    // Inside the ShapeMetricCalculator class, define a method named calculateRectangleArea. 
    //Make this method static so it can be used by any class dealing with Rectangle objects to calculate their area.
    public static double calculateRectangleArea(Recktangle reck1){
        //The method's return type will be double as it will work with double values.
        //Now, because it is supposed to calculate the area of a rectangle, why not pass a Rectangle type of argument to it
        //Just like a method accepts arguments (variables) of type int, double, or String, it can also take a class type of argument. 
        //After all, the rectangle in the above code is a variable of type Rectangle, a class. 
        return reck1.length*reck1.width;
    }
    //Inside the ShapeMetricCalculator class, define another static method named calculateCircleArea.
    public static double calculateCircleArea(Circle circ1){
        return circ1.radius*circ1.radius*3.14;
        
    }
}
