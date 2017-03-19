package JavaSertification;
public class Template_1_1 {
    public static void template11 (){
        Double c=5.6, d=7.2, x=3.0;
        Double y, z=0.0;
        System.out.printf("X = %.1f\n",x);
        y=(c>d ? Math.min(c,d)/(2-5) : Math.max(c,d));
        System.out.printf("Y = %.2f\n",y);

        if(Math.abs(x)> Math.abs(y)){
            z = Math.pow(Math.pow(x,2)+(1/Math.sqrt(y)),1/5);
        } else if(x == y){
            z =(x+5)/y;
        } else if(Math.abs(x)< Math.abs(y)){
            z = Math.sin(x)+ Math.pow(2.718, Math.cos(y));
        }
        System.out.printf("Z = %.2f\n",z);

    }
}
