public class RectangleComputation {
   public static void main(String[] args) {
    double width = 3;
    double height = 9;

    double area = width * height;
    double perimeter = 2*  (width + height);

    boolean isSquare = false;
    double ratio = width / height;
    if (Math.abs(ratio - 1.0) <= 0.001){
        isSquare = true;
    }

    if (isSquare) {
            System.out.println("shape: square");
        } else {
            System.out.println("shape: rectangle");
        }

        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
   } 
}
