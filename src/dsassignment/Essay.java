/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class Essay {
    String title;
    Author author;
    String content;
    String date;
    String genre;

    public Essay() {
        ArrayList<String> nounList = new ArrayList(
                Arrays.asList("John", "James", "Alex", "Alfredo", "Ali", "AhMeng")
        );

        ArrayList<String> verbList = new ArrayList(
                Arrays.asList("eats", "buys", "cooks", "bakes", "rides")
        );

        //todo generate date insert static public final for main program 
        ArrayList<String> objectList = new ArrayList(
                Arrays.asList("cow", "pig", "cake", "chicken", "horse")
        );
        //generate title
       
    }
    public String generateSentence( ArrayList<String> nounList,ArrayList<String> verbList,ArrayList<String> objectList ){
        return nounList.get(ThreadLocalRandom.current().nextInt(nounList.size()))+ verbList.get(ThreadLocalRandom.current().nextInt(verbList.size())) + objectList.get(ThreadLocalRandom.current().nextInt(objectList.size()))+".";
    }
    //use this contructor only
    public Essay(String title, Author author, String content, String date) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.date = date;
    }

}
