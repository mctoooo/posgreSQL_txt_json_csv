/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.json_txt_csv;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Json_txt_csv {

    public static void main(String[] args) throws FileNotFoundException, SQLException, IOException {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mctoooo")) 
        {
            if (conn == null) {
                System.out.print("Failed to connect");
                return;
            }

            File file = new File("C:\\Users\\Дракоша Тоша\\Documents\\NetBeansProjects\\posgreSQL_txt_json_csv\\src\\main\\java\\com\\mycompany\\json_txt_csv\\Description.txt");
            Scanner sc = new Scanner(file);
            System.out.println("file: " + file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            String fileName = "C:\\Users\\Дракоша Тоша\\Documents\\NetBeansProjects\\posgreSQL_txt_json_csv\\src\\main\\java\\com\\mycompany\\json_txt_csv\\description of fields.csv";
            CSVReader reader = new CSVReader(new FileReader("fileName")) {

                ArrayList TableCSV = new ArrayList<String[]>();
                String[] lineInArray;

                for(int i = 0;(lineInArray = reader.readNext()) != null; i++){
                    TableCSV.add (lineInArray);
                }

                while((lineInArray  = reader.readNext()) != null)
                {
                    System.out.println(lineInArray[0] + lineInArray[1] + "etc...");
                }
            };
        conn.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(Json_txt_csv.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}


