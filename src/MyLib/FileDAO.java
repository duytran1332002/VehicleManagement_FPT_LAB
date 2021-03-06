/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import business_object.Car;
import business_object.Motorbike;
import business_object.Vehicle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class FileDAO {
    public static TreeSet<Vehicle> readTextFile(String fileName) throws Exception{
        TreeSet<Vehicle> listVehicle = null;
        File f = new File(fileName);
        if (f.exists()) {
            listVehicle = new TreeSet<>();
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            while (bf.ready()) {
                String s = bf.readLine();
                String[] temp = s.split("-");
                if (temp.length == 8) {
                    Vehicle ob = null;
                    if (temp[0].compareToIgnoreCase("car") == 0) {
                        ob = new Car(temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                        listVehicle.add(ob);
                    } else {
                        ob = new Motorbike(temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], Integer.parseInt(temp[6]), Integer.parseInt(temp[7]));
                        listVehicle.add(ob);
                    }
                }
            }
            System.out.println("Load data from file " + fileName + " successfully!");

            if (fr != null) {
                fr.close();
            }
            if (bf != null) {
                bf.close();
            }
        }
        return listVehicle;
    }
    public static void writeTextFile(String fileName, TreeSet<Vehicle> listVehicle) throws Exception{
        PrintWriter w = new PrintWriter(fileName);
        Collection<Vehicle> collecListVehicle = listVehicle.descendingSet();
        for (Vehicle v : collecListVehicle) {
            w.println(v); //auto goi ham tostring

        }
        System.out.println("Save file to " + fileName + " successfull!");
        if(w != null) w.close();
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import business_object.Car;
import business_object.Motorbike;
import business_object.Vehicle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class FileDAO {
    public static TreeSet<Vehicle> readTextFile(String fileName) throws Exception{
        TreeSet<Vehicle> listVehicle = null;
        File f = new File(fileName);
        if (f.exists()) {
            listVehicle = new TreeSet<>();
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            while (bf.ready()) {
                String s = bf.readLine();
                String[] temp = s.split("-");
                if (temp.length == 8) {
                    Vehicle ob = null;
                    if (temp[0].compareToIgnoreCase("car") == 0) {
                        ob = new Car(temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                        listVehicle.add(ob);
                    } else {
                        ob = new Motorbike(temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], Integer.parseInt(temp[6]), Integer.parseInt(temp[7]));
                        listVehicle.add(ob);
                    }
                }
            }
            System.out.println("Load data from file " + fileName + " successfully!");

            if (fr != null) {
                fr.close();
            }
            if (bf != null) {
                bf.close();
            }
        }
        return listVehicle;
    }
    public static void writeTextFile(String fileName, TreeSet<Vehicle> listVehicle) throws Exception{
        PrintWriter w = new PrintWriter(fileName);
        Collection<Vehicle> collecListVehicle = listVehicle.descendingSet();
        for (Vehicle v : collecListVehicle) {
            w.println(v); //auto goi ham tostring

        }
        System.out.println("Save file to " + fileName + " successfull!");
        if(w != null) w.close();
    }
}
