package co.com.tcs.prueba.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Archive {

    public void createArchive(String nameProduct, String price, String quantity){
        try{
            String ruta = "src\\main\\java\\co\\com\\tcs\\prueba\\utils\\product.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nameProduct);
                bw.newLine();
                bw.write(price);
                bw.newLine();
                bw.write(quantity);
            bw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> readArchive(){
        ArrayList<String> List = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File ("src\\main\\java\\co\\com\\tcs\\prueba\\utils\\product.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null) {
                List.add(linea);
            }
            fr.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(List);
        return List;
    }


}
