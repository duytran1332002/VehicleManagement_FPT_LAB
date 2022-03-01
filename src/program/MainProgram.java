/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import MyLib.Validation;
import business_object.Vehicle;
import data_objects.ListVehicle;
import java.util.Collection;
import service.IServiceListVehicle;
import service.ServiceListVehicle;

/**
 *
 * @author user
 */
public class MainProgram {
    public static void main(String[] args) {
        int choice = 0;
        String[] options = {"Load data from file.", 
                            "Add new vehicle.", 
                            "Update vehicle.",
                            "Delete vehicle.",
                            "Search vehicle.",
                            "Show vehicle list.",
                            "Store data to file.",
                            "Exit."};
        
        IServiceListVehicle serviceList = new ServiceListVehicle();
        do{
            try{
                choice = MyLib.MyTools.inputOptionInMenu(options);
                switch(choice){
                    case 1:
                        serviceList.serviceLoadData();
                        break;
                    case 2: 
                        serviceList.serviceAddVehicle();
                        break;
                    case 3:
                        serviceList.serviceUpdateVehicle();
                        break;
                    case 4:
                        serviceList.serviceRemoveVehicle();
                        break;
                    case 5:
             /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import MyLib.Validation;
import business_object.Vehicle;
import data_objects.ListVehicle;
import java.util.Collection;
import service.IServiceListVehicle;
import service.ServiceListVehicle;

/**
 *
 * @author user
 */
public class MainProgram {
    public static void main(String[] args) {
        int choice = 0;
        String[] options = {"Load data from file.", 
                            "Add new vehicle.", 
                            "Update vehicle.",
                            "Delete vehicle.",
                            "Search vehicle.",
                            "Show vehicle list.",
                            "Store data to file.",
                            "Exit."};
        
        IServiceListVehicle serviceList = new ServiceListVehicle();
        do{
            try{
                choice = MyLib.MyTools.inputOptionInMenu(options);
                switch(choice){
                    case 1:
                        serviceList.serviceLoadData();
                        break;
                    case 2: 
                        serviceList.serviceAddVehicle();
                        break;
                    case 3:
                        serviceList.serviceUpdateVehicle();
                        break;
                    case 4:
                        serviceList.serviceRemoveVehicle();
                        break;
                    case 5:
                        serviceList.serviceSearchVehicle();
                        break;
                    case 6:
                        serviceList.serviceShowVehicle();
                        break;
                    case 7:
                        serviceList.serviceSaveData();
                        break;
                    default:
                        System.out.println("GoodBye!");
                }
            }catch(Exception e){
                System.out.println("Something wrong! check it again!");
            }
        }while(choice <= 7);
    }
}
