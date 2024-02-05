package latihan1;
import java.util.Scanner;

public class product {
    String  id_product;
    String  nama_produk;
    double harga_jual;

}

class InputProduct{
    public static void main(String[] args) {
        System.out.println("Input The ID of The Product");
        Scanner sc = new Scanner (System.in);
        String id=sc.nextLine();
        
        System.out.println("Input the name of the product: ");
        String NamaProduk=sc.nextLine();

        System.out.println("Input the price of the product: ");
        double Hargajual=sc.nextDouble();

        product produk1 =new product ();
        produk1.id_product=id;
        produk1.nama_produk=NamaProduk;
        produk1.harga_jual=Hargajual;

        }
    }
    