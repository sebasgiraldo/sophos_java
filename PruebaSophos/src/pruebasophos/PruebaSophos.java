/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasophos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author sebastiangiraldo
 */
public class PruebaSophos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = new int[]{ 1,2,2,5,4,6,7,8,8,8 };
        
        int Longest=0;
        int Number = 0;
        
        HashMap<Integer, Integer> mapOcurrencias = new HashMap<>();
        
        for (int arr: myArray){
            
             if(mapOcurrencias.containsKey(arr)){
                 
                Integer oc = mapOcurrencias.get(arr);
                oc += 1;
                mapOcurrencias.put(arr, oc);
                
             }else{                                                                                 
                mapOcurrencias.put(arr, 1);
             }
        }
        
        Longest=(Collections.max(mapOcurrencias.values()));
        
        for (Entry<Integer, Integer> entry : mapOcurrencias.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==Longest) {
                Number = entry.getKey();
                break;
            }
        }
        
        System.out.println("Longest: " + Longest);
        System.out.println("Number: " + Number);
    }
    
}
