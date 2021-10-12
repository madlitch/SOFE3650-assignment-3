package Exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductDB {
    Product product = null;
    String filePath = "ProductDatabase.txt";

    public Product GetProductInfo(long UPCCode){
        try {
            File productDatabase = new File (filePath);
            Scanner myReader = new Scanner(productDatabase);

            while (myReader.hasNextLine()){
                String[] product = myReader.nextLine().split(",");
                long UPC = Long.parseLong(product[0]);
                String name = product[1];
                double price = Double.parseDouble(product[2]);

                if (UPCCode == UPC) {
                    this.product = new Product(UPC, name, price);
                    break;
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Error: " + '"' + filePath + '"' + " not found.");
        }
        return product;
    }
}