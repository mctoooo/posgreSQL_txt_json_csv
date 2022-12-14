/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.json_txt_csv;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Json_txt_csv {

        public static void main(String[] args) throws FileNotFoundException {
      

File file = new File("D:\\Документы\\NetBeansProjects\\Json_txt_csv\\src\\main\\java\\com\\mycompany\\json_txt_csv\\Description.txt");
Scanner sc = new Scanner(file);

while (sc.hasNextLine())
System.out.println(sc.nextLine());

}

    
}
