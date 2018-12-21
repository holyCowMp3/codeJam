import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args){
        class Rect{
            public Rect(int a,int b) {
                this.a = a;
                this.b =b;
            }
            public int getPerimeter(){
                return (a+b)*2;
            }
            public int getA() {
                return a;
            }

            int a;

            public int getB() {
                return b;
            }
            int b;

        }
        class Triangle{
            public int a;
            public int b;
            public double c;
            public Triangle(Rect rect){
                this.a = rect.getA();
                this.b = rect.getB();
                this.c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            }

            public double getPerimeter() {
                return a+b+c;
            }
        }
        class Trapetsian{
            public double a;
            public double b;
            public double c;
            public double d;

            public double getPerimeter() {
                return perimeter;
            }

            public double perimeter;

            public List<Trapetsian> getAwaliablePerim() {
                return awaliablePerim;
            }

            public List<Trapetsian> awaliablePerim = new ArrayList<>();

            public Trapetsian(Rect rect){
                this.a =0;
                this.b =rect.getB()-this.a;
                this.c = rect.getA();
                this.d= Math.sqrt(Math.pow(c,2)+Math.pow(b-a,2));
                this.perimeter= this.a+this.b+this.c+this.d;
                for (double i = 0; i<b/2;i+=0.1){
                    if(i==0.9) i=i+1;
                    awaliablePerim.add(new Trapetsian(rect,i));
                }
            }
            public Trapetsian(Rect rect, double a){
                this.a =a;
                this.b =rect.getB()-this.a;
                this.c = rect.getA();
                this.d= Math.sqrt(Math.pow(c,2)+Math.pow(b-a,2));
                this.perimeter= this.a+this.b+this.c+this.d;
            }


        }
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int test = in.nextByte(10);
        int numberCook=0;
        int perimeter=0;
        int aSide=0;
        int bSide=0;

        for (int i = 1; i <= test ; i++) {
            List<Triangle>triangleList = new ArrayList<>();
            List<Trapetsian> trapetsians = new ArrayList<>();
            List<Rect> rectList = new ArrayList<>();
            numberCook =in.nextInt();
            perimeter = in.nextInt();
            Rect rect;

            for (int j = 0; j < numberCook ; j++) {
                rect = new Rect(in.nextInt(), in.nextInt());
                rectList.add(rect);
            }

            rectList.forEach(m -> System.out.println(m.getPerimeter()));
            if (perimeter==rectList.stream().mapToInt(j -> j.getPerimeter()).sum()){
                    System.out.println("Case#"+ i +":" + (double) perimeter); continue;
            } else {
                rectList.forEach(k -> triangleList.add(new Triangle(k)));
              double perimeterT = triangleList.stream().mapToDouble(j -> j.getPerimeter()).sum();

              if (perimeter<=perimeterT){
                  System.out.println("Case#"+ i +":" + perimeterT);  continue;
                 }
                 else {  rectList.forEach(k -> trapetsians.add(new Trapetsian(k)));
                  double perimeterTR = trapetsians.get(0).getAwaliablePerim().stream().mapToDouble(l -> l.getAwaliablePerim().stream().mapToDouble(k ->k.getPerimeter()).sum()).sum();
                  if (perimeter<=perimeterTR){
                  System.out.println("Case#"+ i +":" + perimeterTR); continue;
                 } else{
                      System.out.println("Case#"+ i +":" + (double) perimeter); continue;
                  }
                }
        }
    }
}
}
