package JavaSertification;
import java.lang.Math;


public class Template_1_2 {

    public static void template12 (){

        double x1 = -2.0, x2 = 4.2, dx=0.3, y;
        System.out.println("  X  |  Y ");

        for (double i=x1; i<=x2; i+=dx ){
            y=(Math.log(i+5)/Math.log(2))/(5-Math.pow(i,3));
            //System.out.println(i+ "   "+y);
            System.out.printf("%.1f  %.2f \n", i,y);

        }

    }

}
