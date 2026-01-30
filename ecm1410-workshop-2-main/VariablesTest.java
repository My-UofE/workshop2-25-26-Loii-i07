// VariablesTest application
public class VariablesTest {
    public static void main(String[] args) {
        int x = 4;
         System.out.println("x: " + x);
        byte s_per_min = 60;
        System.out.println("s_per_min: " + s_per_min);
        long s_per_day = (s_per_min * 60 * 24);
        System.out.println("s_per_day: " + s_per_day); 
        
        long s_per_min_long = 60;
        System.out.println("s_per_min_long: " + s_per_min_long);
        byte s_per_day_byte = (byte) (s_per_min * 60 * 24);
        System.out.println("s_per_day_byte: " + s_per_day_byte);
    

        float area = 20.3F;
        System.out.println("area: " + area);
        char a = '\u5468', b = '\\';
        System.out.println("char a: " + a);
        int  nHours = 022;
        System.out.println("hours : " + nHours);
        double ratio = 7/5;
        System.out.println("ratio: " + ratio);


        double d1 = 0.29/0.0001;
        double d2 = 0.00029*1.0e7;
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d1 equals d2: " + (d1 == d2) );

        double epsilon = 1e-10;
if (Math.abs(d1 - d2) < epsilon) {
    System.out.print("d1,d2 differ by less than ");
    System.out.println( epsilon );
}    
    }
}
