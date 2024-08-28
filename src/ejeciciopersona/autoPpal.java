/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejeciciopersona;

/**
 *
 * @author vina
 */
public class autoPpal {
    
    //main + tab
    public static void main(String[] args) {
        
        auto objauto = new auto();
        System.out.println(objauto.getMarca());
        System.out.println(objauto.getModelo());
        
        auto objauto2 = new auto("KIA", "MORNING", "BENCINA", 2022, 1500);
        System.out.println(objauto2.getMarca());
        System.out.println(objauto2.getModelo());
        System.out.println(objauto2.getTipoCombustible());
        
    }
    
}
