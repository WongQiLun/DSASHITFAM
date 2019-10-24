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
public class Essay {

    String title;
    Author author;
    String content;
    String date;
    String genre;

    public Essay() {
//        ArrayList<String> nounList = new ArrayList(
//                Arrays.asList("John", "James", "Alex", "Alfredo", "Ali", "AhMeng")
//        );
//
//        ArrayList<String> verbList = new ArrayList(
//                Arrays.asList("eats", "buys", "cooks", "bakes", "rides")
//        );
//
//        //todo generate date insert static public final for main program 
//        ArrayList<String> objectList = new ArrayList(
//                Arrays.asList("cow", "pig", "cake", "chicken", "horse")
//        );
//        //generate title
//       this.title= generateSentence( nounList,verbList, objectList );
//       this.content = generateContent (nounList,verbList, objectList );
//       
    }

    public String generateSentence(ArrayList<String> nounList, ArrayList<String> verbList, ArrayList<String> objectList) {
        return nounList.get(ThreadLocalRandom.current().nextInt(nounList.size())) + " " + verbList.get(ThreadLocalRandom.current().nextInt(verbList.size())) + " " + objectList.get(ThreadLocalRandom.current().nextInt(objectList.size())) + ".";
    }

    public void generateTitle(ArrayList<String> nounList, ArrayList<String> verbList, ArrayList<String> objectList) {
        this.title = generateSentence(nounList, verbList, objectList);
    }

    public void generateContent(ArrayList<String> nounList, ArrayList<String> verbList, ArrayList<String> objectList) {
        String content = "";
        for (int x = 0; x < 5; x++) {
            content += generateSentence(nounList, verbList, objectList);

        }
        this.content = content;
    }

    public void selectAuthor(ArrayList<Author> authorList) {
        this.author = authorList.get(ThreadLocalRandom.current().nextInt(authorList.size()));
    }

    public void selectGenre(ArrayList<String> genreList) {
        this.genre = genreList.get(ThreadLocalRandom.current().nextInt(genreList.size()));
    }

    public void generateDate() {
        GregorianCalendar gc = new GregorianCalendar();

        int year = ThreadLocalRandom.current().nextInt(2000, 2019);

        gc.set(gc.YEAR, year);

        int dayOfYear = ThreadLocalRandom.current().nextInt(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        this.date = fmt.format(gc.getTime());

    }

    public Essay(String title, Author author, String content, String date) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.date = date;
    }



}
