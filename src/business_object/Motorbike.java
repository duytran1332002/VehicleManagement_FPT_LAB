/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_object;

import MyLib.Validation;
import data_objects.ListVehicle;

/**
 *
 * @author user
 */
public class Motorbike extends Vehicle implements Comparable<Vehicle>{
    private int speed;
    private int licenseRequired;

    
    // constructor
    public Motorbike() {
    }
    public Motorbike(Motorbike item){
        super(item);
        this.speed = item.getSpeed();
        this.licenseRequired = item.getLicenseRequired();
    }
    public Motorbike(String id, String name, String color, int price, String brand, int speed, int licenseRequired) {
        super(id, name, color, price, brand);
        this.speed = speed;
        this.licenseRequired = licenseRequired;
    }

    // getter and setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLicenseRequired() {
        return licenseRequired;
    }

    public void setLicenseRequired(int licenseRequired) {
        this.licenseRequired = licenseRequired;
    }
    
    public void makeSound(){
        System.out.println("Tin tin tin");
    }

    @Override
    public void input(ListVehicle list) {
        super.input(list); //To change body of generated methods, choose Tools | Templates.
        boolean flag = false;
        do{
            try{
                speed = Validation.inputNumber("Input speed (km/h)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                licenseRequired = Validation.inputNumber("Input 1 for license required and 0 for not required license:");
                if (licenseRequired != 0 && licenseRequired != 1) throw new Exception();
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    // update motorbike
    
    @Override
    public void update(ListVehicle list) {
        super.update(list); //To change body of generated methods, choose Tools | Templates.
        boolean flag = false;
        do{
            try{
                String tmp = Validation.inputString("Input speed (km/h)", "()|([\\d]+)");
                if(!tmp.isEmpty()){
                    int newSpeed = Integer.parseInt(tmp);
                    if(newSpeed <= 0)throw new Exception();
                    else speed = newSpeed;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input 1 for license required and 0 for not required license:", "()|(0)|(1)");
                if(!tmp.isEmpty()){
                    licenseRequired = Integer.parseInt(tmp); 
                    
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_object;

import MyLib.Validation;
import data_objects.ListVehicle;

/**
 *
 * @author user
 */
public class Motorbike extends Vehicle implements Comparable<Vehicle>{
    private int speed;
    private int licenseRequired;

    
    // constructor
    public Motorbike() {
    }
    public Motorbike(Motorbike item){
        super(item);
        this.speed = item.getSpeed();
        this.licenseRequired = item.getLicenseRequired();
    }
    public Motorbike(String id, String name, String color, int price, String brand, int speed, int licenseRequired) {
        super(id, name, color, price, brand);
        this.speed = speed;
        this.licenseRequired = licenseRequired;
    }

    // getter and setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLicenseRequired() {
        return licenseRequired;
    }

    public void setLicenseRequired(int licenseRequired) {
        this.licenseRequired = licenseRequired;
    }
    
    public void makeSound(){
        System.out.println("Tin tin tin");
    }

    @Override
    public void input(ListVehicle list) {
        super.input(list); //To change body of generated methods, choose Tools | Templates.
        boolean flag = false;
        do{
            try{
                speed = Validation.inputNumber("Input speed (km/h)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                licenseRequired = Validation.inputNumber("Input 1 for license required and 0 for not required license:");
                if (licenseRequired != 0 && licenseRequired != 1) throw new Exception();
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    // update motorbike
    
    @Override
    public void update(ListVehicle list) {
        super.update(list); //To change body of generated methods, choose Tools | Templates.
        boolean flag = false;
        do{
            try{
                String tmp = Validation.inputString("Input speed (km/h)", "()|([\\d]+)");
                if(!tmp.isEmpty()){
                    int newSpeed = Integer.parseInt(tmp);
                    if(newSpeed <= 0)throw new Exception();
                    else speed = newSpeed;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input 1 for license required and 0 for not required license:", "()|(0)|(1)");
                if(!tmp.isEmpty()){
                    licenseRequired = Integer.parseInt(tmp); 
                    
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
        return "motorbike-" + super.toString() + "-" + speed + "-" +licenseRequired; //To change body of generated methods, choose Tools | Templates.
    }
    
}
