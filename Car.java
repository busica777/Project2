package Project2;

public class Car {
int carPrice;
String color;
double discount;
  Car( int carPrice, String color,double discount){
      this.carPrice=carPrice;
      this.color=color;
      this.discount=discount;
  }
   void calculateSalePrice(){
      double offdiscount=(carPrice*discount)/100;
      System.out.println("The discount is "+offdiscount);
  }
}
class Sedan extends Car{
    private  int lenght;
    Sedan(int carPrice, String color, double discount, int lenght) {
        super(carPrice, color, discount);
        this.lenght = lenght;
    }
    void calculateSalePrice(){
        double offdiscount=(carPrice*discount)/100;
        if (lenght>20) {
            discount = 5;
        }else {
            discount = 10;
        }
            System.out.println();
            System.out.println("The final price of this truck is "+(carPrice-offdiscount));
        }
    }
class Truck extends Car{
private int weight;
    Truck(int carPrice, String color, double discount,int weight) {
        super(carPrice, color, discount);
        this.weight = weight;
    }
        void calculateSalePrice() {
            double offdiscount = (carPrice * discount) / 100;

            if (weight > 2000) {
                discount = 10;
            } else {
                discount = 20;
            }
            System.out.println();
            System.out.println("The final price of this sedan is "+(carPrice-offdiscount));
        }
        }

