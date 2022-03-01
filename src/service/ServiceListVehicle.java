/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import MyLib.Validation;
import business_object.Vehicle;
import data_objects.IListVehicle;
import data_objects.ListVehicle;
import java.util.Collection;

/**
 *
 * @author user
 */
public class ServiceListVehicle implements IServiceListVehicle{
    private IListVehicle list;
    private final String filename = "list_vehicle.txt";
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import MyLib.Validation;
import business_object.Vehicle;
import data_objects.IListVehicle;
import data_objects.ListVehicle;
import java.util.Collection;

/**
 *
 * @author user
 */
public class ServiceListVehicle implements IServiceListVehicle{
    private IListVehicle list;
    private final String filename = "list_vehicle.txt";
    private final String filenameSave = "ok_good.txt";
    
    public ServiceListVehicle() {
         list = new ListVehicle();
    }
    
    @Override
    // service load data
    public void serviceLoadData(){
        list.loadData(filename);
    }
    
    @Override
    //service add new vehicle to list
    public void serviceAddVehicle(){
        String[] addOptions = {"Add new car", "Add new motorbike"};
        int addChoice = 0;
        String check = "";
        do {
            try {
                addChoice = MyLib.MyTools.inputOptionInMenu(addOptions);
                if (addChoice > 2) {
                    throw new Exception();
                }
                list.addVehicle(addChoice);
                check = Validation.inputString("Continue?(y/n)", "^(.)$");                  
            } catch (Exception e) {
                System.out.println("Something wrong, please check!");
            }
        } while (!check.equalsIgnoreCase("n"));
    }
    
    @Override
    // service update Vehicle
    public void serviceUpdateVehicle(){
        if(list.checkEmpty()){
            System.out.println("Nothing in the list");
            return;
        }
        try {
            String id = Validation.inputString("Input ID of Vehicle that you want to update, EX: S4567: ", "([a-zA-Z]{1}\\d{4})");
            list.updateVehicleById(id);
        } catch (Exception e) {
            System.out.println("Something is wrong, please check!");
        }
        return;
    }
    
    @Override
    // service remove Vehicle
    public void serviceRemoveVehicle(){
        if(list.checkEmpty()){
            System.out.println("Nothing in the list");
            return;
        }
        list.displayAll();
        String checkRemove = "";
        try {
            String id = Validation.inputString("Input ID that you want to remove, EX: S4567: ", "([a-zA-Z]{1}\\d{4})");
            checkRemove = Validation.inputString("Are you sure want to remove? (y/n)", "^(.)$");
            if (!checkRemove.equalsIgnoreCase("n")) {
                list.removeVehicleById(id);
            }else{
                System.out.println("Do not remove anything!");
            }
        } catch (Exception e) {
            System.out.println("Something is wrong, please check!");
        }
        return;
    }
    
    @Override
    // service search Vehicle
    public void serviceSearchVehicle(){
        if(list.checkEmpty()){
            System.out.println("Nothing in the list");
            return;
        }
        String[] searchOptions = {"Search by name", "Search by id"};
        int searchChoice = 0;
        try {

            searchChoice = MyLib.MyTools.inputOptionInMenu(searchOptions);
            switch (searchChoice) {
                case 1:
                    String name = Validation.inputString("Input charater in the name that you want to search: ", "([\\w\\W]+)");
                    Collection<Vehicle> nameCollect = list.searchByName(name);
                    for (Vehicle vehicle : nameCollect) {
                        System.out.println(vehicle);
                    }
                    break;
                case 2:
                    String id = Validation.inputString("Input ID that you want to search, EX: S4567: ", "([a-zA-Z]{1}\\d{4})");
                    System.out.println(list.searchById(id));
                    break;
            }
        } catch (Exception e) {
            System.out.println("something wrong, please check again!");
        }
        return;

    }
    
    @Override
    // service show Vehicle
    public void serviceShowVehicle(){
        if (list.checkEmpty()) {
            System.out.println("Nothing in the list");
            return;
        }
        String[] showOptions = {"Show all", "Show all (descending by price)"};
        int showChoice = 0;
        try {
            showChoice = MyLib.MyTools.inputOptionInMenu(showOptions);
            switch (showChoice) {
                case 1:
                    list.displayAll();
                    break;
                case 2:
                    list.displayDescendingPrice();
                    break;
            }
        } catch (Exception e) {
            System.out.println("something wrong, please check again!");
        }

        return;
    }
    
    @Override
    // service save data to file
    public void serviceSaveData(){
        if(list.checkEmpty()){
            System.out.println("Nothing in the list");
            return;
        }
        list.saveData(filenameSave);
        return;
    }
}
