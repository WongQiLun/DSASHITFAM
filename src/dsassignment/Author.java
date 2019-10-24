/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class Author {

    String authorName;
    String authorDOB;
// for reference
    Author() {
        ArrayList<String> authorFirstNameList = new ArrayList(
                Arrays.asList("John", "James", "Alex", "Alfredo", "Ali", "AhMeng")
        );

        ArrayList<String> authorLastNameList = new ArrayList(
                Arrays.asList("Smith", "Fletcher", "Longman", "Alfredo", "Peanut", "Soda")
        );
        this.authorName = authorFirstNameList.get(ThreadLocalRandom.current().nextInt(authorFirstNameList.size()));
        this.authorName += " " + authorLastNameList.get(ThreadLocalRandom.current().nextInt(authorLastNameList.size()));

        GregorianCalendar gc = new GregorianCalendar();

        int year = ThreadLocalRandom.current().nextInt(1910, 2000);

        gc.set(gc.YEAR, year);

        int dayOfYear = ThreadLocalRandom.current().nextInt(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        this.authorDOB = fmt.format(gc.getTime());

    }

    public Author(String authorName, String authorDOB) {
        this.authorName = authorName;
        this.authorDOB = authorDOB;
    }
//use this constructor to prevent over use of memroy
    public Author(String authorName) {
        this.authorName = authorName;
        GregorianCalendar gc = new GregorianCalendar();

        int year = ThreadLocalRandom.current().nextInt(1910, 2000);

        gc.set(gc.YEAR, year);

        int dayOfYear = ThreadLocalRandom.current().nextInt(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        this.authorDOB = fmt.format(gc.getTime());

    }
}
