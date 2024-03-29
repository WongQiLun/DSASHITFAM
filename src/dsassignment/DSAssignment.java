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
public class DSAssignment {
         public static ArrayList<Author> authorList = GenerateAuthorList(0);
         public static ArrayList<Essay> essayList = GenerateEssayList(0, authorList);
         static    ArrayList<String> nounList = new ArrayList(
                Arrays.asList("John", "James", "Alex", "Alfredo", "Ali", "AhMeng")
        );

        static ArrayList<String> verbList = new ArrayList(
                Arrays.asList("eats", "buys", "cooks", "bakes", "rides")
        );

        //todo generate date insert static public final for main program 
        static ArrayList<String> objectList = new ArrayList(
                Arrays.asList("cow", "pig", "cake", "chicken", "horse")
        );
        static ArrayList<String> genreList = new ArrayList(
                Arrays.asList("adventure", "action", "sci-fi")
        );
        static ArrayList<String> authorFirstNameList = new ArrayList(
                Arrays.asList("John", "James", "Alex", "Alfredo", "Ali", "AhMeng")
        );

        static ArrayList<String> authorLastNameList = new ArrayList(
                Arrays.asList("Smith", "Fletcher", "Longman", "Alfredo", "Peanut", "Soda")
        );
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Form.main(args);

    }

    public static ArrayList<Author> GenerateAuthorList(int count) {
        ArrayList<Author> generatedAuthorList = new ArrayList<>();

        if (count == 0) {
            //default to 30
            count = 30;
        }


        while (count != 0) {
            String authorName1 = authorFirstNameList.get(ThreadLocalRandom.current().nextInt(authorFirstNameList.size()));
            authorName1 += " " + authorLastNameList.get(ThreadLocalRandom.current().nextInt(authorLastNameList.size()));
            Author author = new Author(authorName1);
            generatedAuthorList.add(author);
            count--;
        }
        return generatedAuthorList;
    }

    public static ArrayList<Essay> GenerateEssayList(int count, ArrayList<Author> authorList) {
        ArrayList<Essay> generatedEssayList = new ArrayList<>();
        if (count == 0) {
            //default to 150
            count = 150;
        }
        //load the assets here

        //todo generates essay List
        while (count != 0) {
            Essay essay = new Essay();
            essay.selectAuthor(authorList);
            essay.generateContent(nounList, verbList, objectList);
            essay.generateDate();
            essay.generateTitle(nounList, verbList, objectList);
            essay.selectGenre(genreList);
            count--;
            generatedEssayList.add(essay);
        }
        return generatedEssayList;
    }
}
