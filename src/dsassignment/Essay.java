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
public class Essay {


    String title;
    String author;
    String content;
    String date;
    String genre;
    public Essay (){
        ArrayList<String> nounList= new ArrayList(
                Arrays.asList("John", "James", "Alex","Alfredo","Ali","AhMeng")        
        );

         ArrayList<String> verbList=new ArrayList (
                Arrays.asList("eats", "buys" ,"cooks","bakes","rides")        
        );

        //todo generate date insert static public final for main program 
         ArrayList<String> objectList=new ArrayList(
                 Arrays.asList("cow", "pig" ,"cake","chicken","horse")
                 );
        ArrayList<String> authorFirstNameList= new ArrayList(
                Arrays.asList("John", "James", "Alex","Alfredo","Ali","AhMeng")        
        ); 
        
        ArrayList<String> authorLastNameList= new ArrayList(
                Arrays.asList("Smith", "Fletcher", "Longman","Alfredo","Peanut","Soda")        
        ); 
         
        
        
    }
        public Essay(String title, String author, String content, String date) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.date = date;
    }
}
