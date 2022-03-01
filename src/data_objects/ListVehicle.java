/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import MyLib.FileDAO;
import business_object.Car;
import business_object.Motorbike;
import business_object.Vehicle;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class ListVehicle implements IListVehicle{
    private TreeSet <Vehicle> list;
    
    public ListVehicle(TreeSet <Vehicle> list){
        this.list = list;
    }
    public ListVehicle(){
        list = new TreeSet<>();
    }
    
    @Override
    // check the list is empty
    public boolean checkEmpty(){
        return list.isEmpty();/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import MyLib.FileDAO;
import business_object.Car;
import business_object.Motorbike;
import business_object.Vehicle;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class ListVehicle implements IListVehicle{
    private TreeSet <Vehicle> list;
    
    public ListVehicle(TreeSet <Vehicle> list){
        this.list = list;
    }
    public ListVehicle(){
        list = new TreeSet<>();
    }
    
    @Override
    // check the list is empty
    public boolean checkEmpty(){
        return list.isEmpty();
    }
    @Override
    // load the data from file
    public void loadData(String filename){
        try{
            TreeSet<Vehicle> tmp = tmp = FileDAO.readTextFile(filename);
            if(tmp.isEmpty()){
                System.out.println("No item in the list, please add item!");
                return;
            }else{
                for (Vehicle vehicle : tmp) {
                    if(searchById(vehicle.getId()) == null){
                        list.add(vehicle);
                    }else{
                        System.out.println(vehicle.getId() + " has been exist, you can changg and add it again!");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }
    // add new car
    public void addNewCar(){
        Vehicle car = new Car();
        ListVehicle tmp = new ListVehicle(list);
        car.input(tmp);
        list.add(car);
        System.out.println("Add a new car successfully");
        return;
    }
    // add new motobike
    public void addNewMotorbike(){
        Vehicle motorbike = new Motorbike();
        ListVehicle tmp = new ListVehicle(list);
        motorbike.input(tmp);
        list.add(motorbike);
        System.out.println("Add a new Motorbike successfully");
        return;
    }
    @Override
    // add new vehicle to the list
    public void addVehicle(int choice){
        if(choice == 1){
            addNewCar();
        }else{
            addNewMotorbike();
        }
        
    }
    @Override
    // display all the item
    public void displayAll(){ 
        System.out.println("The show room:");
        for (Vehicle item : list) {
            System.out.println(item);
        }
    }
    @Override
    // display all the item descending price
    public void displayDescendingPrice(){
        Collection<Vehicle> tmp = list.descendingSet(); 
        System.out.println("Descending price list:");
        for (Vehicle item : tmp) {
            System.out.println(item);
            if (item instanceof Motorbike) {
                ((Motorbike) item).makeSound();
            }
        }
    }
    @Override
    // search vehicle by id
    public Vehicle searchById(String id){
        for (Vehicle item: list) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    @Override
    // search vehicle by name
    public Collection<Vehicle> searchByName(String keyword){
        TreeSet<Vehicle> afterSearching = new TreeSet<>();
        for (Vehicle item: list) {
            if(item.getName().toLowerCase().contains(keyword.toLowerCase())){
                afterSearching.add(item);
            }
        }
        Collection<Vehicle> descCollect = afterSearching.descendingSet();
        return descCollect;
    }
    @Override
    // remove the a vehicle by id
    public void removeVehicleById(String id){
        Vehicle removeItem = searchById(id);
        if(removeItem == null){
            System.out.println("Vehicle does not exist.");
            return;
        }
        if(!list.remove(removeItem)){ 
            System.out.println("Remove failed!");
            return;
        }else{
            System.out.println("Remove successfull!");
        }
        return;
    }
    @Override
    // update a vehicle
    public void updateVehicleById(String id){
        Vehicle itemUpdate = searchById(id);
        if(itemUpdate == null){
            System.out.println("Vehicle with this id does not exist.");
            return;
        }
        ListVehicle tmp = new ListVehicle(list);
        itemUpdate.update(tmp);
        System.out.println("Update Successfull");
        System.out.println("After update:");
        System.out.println(itemUpdate);
        return;
    }
    
    @Override
    // save all to the file 
    public void saveData(String filenameSave){
        try{
            FileDAO.writeTextFile(filenameSave, list);
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }

}
