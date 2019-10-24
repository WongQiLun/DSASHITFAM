/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class EssayList {

    ArrayList<Essay> essayList;

    EssayList(int count, ArrayList<Author> authorList) {

        if (count == 0) {
            //default to 150
            count = 150;

        }
        //load the assets here
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
           ArrayList<String> genreList = new ArrayList(
                Arrays.asList("adventure","action","sci-fi")
        );
        //todo generates essay List
        while (count != 0) {
            
            GregorianCalendar gc = new GregorianCalendar();

            int year = ThreadLocalRandom.current().nextInt(2000, 2019);

            gc.set(gc.YEAR, year);

            int dayOfYear = ThreadLocalRandom.current().nextInt(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

            gc.set(gc.DAY_OF_YEAR, dayOfYear);
            SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
            String dateFormatted = fmt.format(gc.getTime());
            
            count--;
        }
    }

}
