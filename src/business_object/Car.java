/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_object;

import MyLib.Validation;
import data_objects.ListVehicle;
import java.util.Date;

/**
 *
 * @author user
 */
public class Car extends Vehicle implements Comparable<Vehicle>{
    private String type;
    private int yearManufacture;

    // constructor
    public Car() {
        
    }
    public Car(Car item){
        super(item);
        this.type = item.getType();
        this.yearManufacture = item.getYearMan/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_object;

import MyLib.Validation;
import data_objects.ListVehicle;
import java.util.Date;

/**
 *
 * @author user
 */
public class Car extends Vehicle implements Comparable<Vehicle>{
    private String type;
    private int yearManufacture;

    // constructor
    public Car() {
        
    }
    public Car(Car item){
        super(item);
        this.type = item.getType();
        this.yearManufacture = item.getYearManufacture();
    }
    public Car(String id, String name, String color, int price, String brand, String type, int yearManufacture) {
        super(id, name, color, price, brand);
        this.type = type;
        this.yearManufacture = yearManufacture;
    }

    

    //getter and setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    @Override
    public void input(ListVehicle list) {
        super.input(list); //To change body of generated methods, choose Tools | Templates.
        boolean flag = false;
        do{
            try{
                type = Validation.inputString("Input type: ", "([\\w])+");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                yearManufacture = Validation.inputYearValid("Input year of manufactor:");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    @Override
    public void update(ListVehicle list) {
        super.update(list); //To change body of generated methods, choose Tools | Templates.
        boolean flag = false;
        do{
            try{
                String tmp = Validation.inputString("Input type: ", "()|([\\w]+)");
                if(!tmp.isEmpty()){
                    type = tmp;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new year of manufactor", "()|([\\d]{4})"); 
                if(!tmp.isEmpty()){
                    int newYear = Integer.parseInt(tmp);
                    if(Validation.checkYearValid(newYear)){
                        yearManufacture = newYear;
                    }else{
                        throw new Exception();
                    }
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    
    @Override
    public String toString() {
        return "car-" + super.toString() + "-" + type + "-" + yearManufacture; //To change body of generated methods, choose Tools | Templates.
    }
}
