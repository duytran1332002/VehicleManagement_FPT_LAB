/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_object;

import MyLib.Validation;
import data_objects.ListVehicle;
import java.util.NavigableSet;

/**
 *
 * @author user
 */
public abstract class Vehicle implements Comparable<Vehicle>{
    private String id;
    private String name;
    private String color;
    private int price;
    private String brand;
    
    // Constructor
    public Vehicle() {
        
    }
    public Vehicle(Vehicle item){
        this.id = item.getId();
        this.name = item.getName();
        this.color = item.getColor();
        this.price = item.getPrice();
        this.brand = item.getBrand();
    }

    public Vehicle(String id, String name, String color, int price, String brand) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    public void input(ListVehicle list){
        boolean flag = false;
        do{
            try{
                id = Validation.inputString("Input ID, EX: c4567: ", "([a-zA-Z]{1}\\d{4})");
                if(list.searchById(id) != null){
                    System.out.println("This id has been exist!Please try another");
                    throw new Exception();
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                name = Validation.inputString("Input name: ", "([\\w\\W]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                color = Validation.inputString("Input color, EX: red, green: ", "([a-zA-Z]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                price = Validation.inputNumber("Input the price:");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                brand = Validation.inputString("Input brand: ", "([a-zA-Z]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    //update vehicle
    public void update(ListVehicle list){
        boolean flag = false;
        do{
            try{
                Stri/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_object;

import MyLib.Validation;
import data_objects.ListVehicle;
import java.util.NavigableSet;

/**
 *
 * @author user
 */
public abstract class Vehicle implements Comparable<Vehicle>{
    private String id;
    private String name;
    private String color;
    private int price;
    private String brand;
    
    // Constructor
    public Vehicle() {
        
    }
    public Vehicle(Vehicle item){
        this.id = item.getId();
        this.name = item.getName();
        this.color = item.getColor();
        this.price = item.getPrice();
        this.brand = item.getBrand();
    }

    public Vehicle(String id, String name, String color, int price, String brand) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    public void input(ListVehicle list){
        boolean flag = false;
        do{
            try{
                id = Validation.inputString("Input ID, EX: c4567: ", "([a-zA-Z]{1}\\d{4})");
                if(list.searchById(id) != null){
                    System.out.println("This id has been exist!Please try another");
                    throw new Exception();
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                name = Validation.inputString("Input name: ", "([\\w\\W]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                color = Validation.inputString("Input color, EX: red, green: ", "([a-zA-Z]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                price = Validation.inputNumber("Input the price:");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                brand = Validation.inputString("Input brand: ", "([a-zA-Z]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    //update vehicle
    public void update(ListVehicle list){
        boolean flag = false;
        do{
            try{
                String tmp = Validation.inputString("Input a new ID, EX: s4567: ", "([a-zA-Z]{1}\\d{4})|()");
                if(!tmp.isEmpty()){
                    if(list.searchById(tmp) != null){
                        System.out.println("This id has been existed, please try another");
                        throw new Exception();
                    }else{
                        id = tmp;
                    }
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new name: ", "()|([\\w\\W]+)");
                if(!tmp.isEmpty()){
                    name = tmp;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new color, EX: red, green: ", "()|(([a-zA-Z]+))");
                if(!tmp.isEmpty()){
                    color = tmp;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new price", "()|([\\d]+)");
                if(!tmp.isEmpty()){
                    price = Integer.parseInt(tmp);
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input brand: ", "()|(([a-zA-Z]+))");
                if(!tmp.isEmpty()){
                    brand = tmp;
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
        return id + "-" + name + "-" + color + "-" + price + "-" + brand;
    }

    @Override
    public int compareTo(Vehicle o) {
        if(id.equals(o.getId())){
            return 0;
        }else if(price >= o.getPrice()){
            return 1;
        }else{
            return -1;
        }
    }
}
