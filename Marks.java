package Project2;

 public abstract class Marks {
    double a;
    double b;
    double c;
    Marks(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    abstract void getPercentage();
}
     class A extends Marks {
         A(double a, double b, double c) {
             super(a, b, c);
         }
         void getPercentage() {
             System.out.println("Average:" + (a + b + c) / 3);
         }
     }
        class B extends Marks{
             double d;
         B(double a, double b,double c,double d){
        super(a,b,c);
           this.d=d;}
           void getPercentage(){
               System.out.println("Average:"+(a+b+c+d)/4);
         }
        }
class Tester{
     public static void main(String[] args) {
  A avg=new A(12.4,14.6,19.2);
  avg.getPercentage();


  B avg1=new B(20.0, 11.4, 18.4, 15.5);
  avg1.getPercentage();
         }}