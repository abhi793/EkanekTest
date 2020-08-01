
package com.example;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator;

public class CheapFlights implements Comparable<CheapFlights>{
    int sum;
    int index;
    
    public CheapFlights(int sum, int index) {
        this.sum = sum;
        this.index = index;
    }
    
    @Override
    public int compareTo(CheapFlights cf) {
        return this.sum - cf.sum;
    }
    
    public static void printCheapestFlights(int [] delhi_to_mumbai, int [] mumbai_to_delhi, int k) {
        List<CheapFlights> flights = new ArrayList<CheapFlights>();
        for(int i=0; i< delhi_to_mumbai.length; i++) {
            CheapFlights flight = new CheapFlights(delhi_to_mumbai[i]+mumbai_to_delhi[i],i);
            flights.add(flight);
        }
        Collections.sort(flights);
        for(int j=0;j<k;j++) {
            int index_to_print = flights.get(j).index;
          System.out.println(delhi_to_mumbai[index_to_print]+", "+ mumbai_to_delhi[index_to_print]);
        }
    }

     public static void main(String []args){
      int [] delhi_to_mumbai = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
      int [] mumbai_to_delhi = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};
      int k = 5;
      CheapFlights.printCheapestFlights(delhi_to_mumbai, mumbai_to_delhi, k);
     }
}
