package co.com.tcs.prueba.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Formatter;

public class CreateArchive {

    public void createArchive(String nameProduct, int price, int quantity){
        try{
            String ruta = "//product.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nameProduct);
                bw.write(price);
                bw.write(quantity);
            bw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
