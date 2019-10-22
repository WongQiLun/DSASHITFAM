/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Author {
    String authorName;
    String authorDOB;
    
    Author(){
            ArrayList<String> authorFirstNameList= new ArrayList(
                Arrays.asList("John", "James", "Alex","Alfredo","Ali","AhMeng")        
        ); 
        
        ArrayList<String> authorLastNameList= new ArrayList(
                Arrays.asList("Smith", "Fletcher", "Longman","Alfredo","Peanut","Soda")        
        ); 
         }
}
