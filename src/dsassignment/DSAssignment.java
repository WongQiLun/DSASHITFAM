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


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Form.main(args);

    }

    public static ArrayList<Author> GenerateAuthorList(int count) {
        ArrayList<Author> AuthorList = new ArrayList<>();

        if (count == 0) {
            //default to 30
            count = 30;
        }
        ArrayList<String> authorFirstNameList = new ArrayList(
                Arrays.asList("John", "James", "Alex", "Alfredo", "Ali", "AhMeng")
        );

        ArrayList<String> authorLastNameList = new ArrayList(
                Arrays.asList("Smith", "Fletcher", "Longman", "Alfredo", "Peanut", "Soda")
        );

        while (count != 0) {
            String authorName1 = authorFirstNameList.get(ThreadLocalRandom.current().nextInt(authorFirstNameList.size()));
            authorName1 += " " + authorLastNameList.get(ThreadLocalRandom.current().nextInt(authorLastNameList.size()));
            Author author = new Author(authorName1);
            AuthorList.add(author);
            count--;
        }
        return AuthorList;
    }

    public static ArrayList<Essay> GenerateEssayList(int count, ArrayList<Author> authorList) {
        ArrayList<Essay> essayList = new ArrayList<>();
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
                Arrays.asList("adventure", "action", "sci-fi")
        );
        //todo generates essay List
        while (count != 0) {
            Essay essay = new Essay();
            essay.selectAuthor(authorList);
            essay.generateContent(nounList, verbList, objectList);
            essay.generateDate();
            essay.generateTitle(nounList, verbList, objectList);
            essay.selectGenre(genreList);
            count--;
            essayList.add(essay);
        }
        return essayList;
    }
}
