package Project2;

public class CarTester {
    public static void main(String[] args) {
        Sedan se=new Sedan(15000,"grey",10,35);
         se.calculateSalePrice();

         Truck tr=new Truck(24000,"black",15,6700);
            tr.calculateSalePrice();
    }
}
