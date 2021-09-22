/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author JuanLamasRubio
 */
public class LaPrimera implements Serializable {

    /**
     * @param args the command line arguments JAVA API 8 PAGINA DE METODOS
     */
    public static void main(String[] args) {
        /** ArrayList<String> clase = new ArrayList<>();
        clase.add("Luis");
        clase.add("Roberto");
        clase.add("Ridouan");
        clase.add("Pablo");
        
        if(clase.contains("Pablo")){
            System.out.println("Esta Pablo");
        }
        
        System.out.println(clase.remove("Rober"));
        
        System.out.println (clase.size());
        
        System.out.println(clase);
        
        for(String alumno : clase){
            System.out.println("Nombre: "+alumno);
                
        }
        
        for(Integer i=0;i<clase.size();i++) {
            System.out.println("Nombre ["+i+"]: "+clase.get(i));
                 
        }
        
        Iterator<String> iteradorClase = clase.iterator();
        
        while(iteradorClase.hasNext()) {
            System.out.println(iteradorClase.next());
            
        }
    }
        
        HashSet<String> clase = new HashSet<String>();
        
        clase.add("Pablo");
        clase.add("David");
        clase.add("David");
        clase.add("Alenjandro");
        
        clase.remove("David");
        
        Iterator<String> it = clase.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
                   
        }
        
        System.out.println(clase);*/
        
        HashMap<Integer,String> clase = new HashMap<Integer,String>();
        
        clase.put(10, "David");
        clase.put(11, "Roberto");
        clase.put(7, "Diego");
        
        if(clase.containsValue("Roberto")) {
            System.out.println("Roberto esta dentro");
        } else {
            System.out.println("Roberto esta fuera");
        }
        
        System.out.println(clase.get(11));
        
        for( Map.Entry m : clase.entrySet()) {
            System.out.println("["+m.getKey()+"] ");
            System.out.println(m.getValue());
        }
        
        for( Integer i : clase.keySet()) {
            System.out.println(clase.get(i));
        }
        
        System.out.println("---------------------");
        Iterator<Integer> ite = clase.keySet().iterator();
        while(ite.hasNext()) {
            System.out.println( ite.next());
        }
        
        
        System.out.println(clase);
       
    }
}
