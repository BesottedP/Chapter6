package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class WordDuoList {

    private ArrayList<Integer> allDuos(String[] strings) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
//        ArrayList<WordDuo> x = new ArrayList<WordDuo>();
//        for (int i = strings.length; i > 0; i--) {
//            for (int j = i; j < strings.length; j++) {
//                x.add(new WordDuo(strings[i], strings[j]));
//            }
//        }
        return x;
    }

    /*
    Write the constructor for the WordDuoList class.  The constructor
    takes an array of Strings as a parameter and initializes the
    instance variable allDuos to an ArrayList of WordDuo objects.

    A WordDuo object consists of a word from the array paired with a
    word that appears later in the array.  The allDuos list constins
    WordDuo objects (words[i], words[j]) for every i and j, where
    0<=i<j<words.length.  Each WordDuo object is added exactly once to
    the list.

    The following examples illustrate two different WordDuo objects.

    Example 1:
    String [] wordNums = {"one", "two", "three"};
    WordDuoList exampleOne = new WordDuoList(wordNums);

    After the code has executed, the allDuos instance variable
    of exampleOne will contain the following WordDuo objects in the
    same order.
    ("one", "two"), ("one", "three"), ("two", "three")

    Example 2:
    String[] phrase = {"the", "more", "the", "merrier"};
    WordDuoList exampleTwo = new WordDuoList(phrase);

    After the code segment has executed, the allDuos instance variable of
    exampleTwo will contain the following WordDuo objects in come order.
    ("the", "more"), ("the", "the"), ("the", "merrier"),
    ("more", "the"), ("more", "merrier"), ("the", "merrier")
     */
    /** Constructor
     * Precondition:  word.length >2
     */

    public WordDuoList(String[] words){
        /* part A */




    }
//    public String toString(){
//        String s = "";
//        for (WordDuo wd: allDuos){
//            s += "("+wd.getFirst() + ", " + wd.getSecond() + ")\n";
//        }
//        return s;
//    }

    /* Write the WordDuoList method numMatches.  This method returns the number
    of WordDuo objects in allDuos for which the two strings match.

    For example, the following code segment creates a WordDuoList object.

    String[] moreWords = {"the", "red", "fox", "the", "red");
    WordDuoList exampleThree = new WordDuoList(moreWords);

    After the code segment has executed, the allDuos instance variable of
    exampleThree will contain the following WordDuo objects in some order.
    The matching pairs are starred **.

    ("the", "red"), ("the", "fox"), **("the", "the")**, ("the", "red")
    ("red", "fox"), ("red", "the"), **("red", "red")**, ("fox", "the")
    ("fox", "red"), ("the", "red")
     */
    public int numMatches(){
        /* part B  */



        return 0;  // replace this
    }

    /*Write the method moveMatchesToTop()  THis method will look for
    WordDuo matches and move them to the beginning of the ArrayList.
    For example, the list above would end up as follows.  The relative
    order of these matches does not matter.

    ("red", "red"), ("the", "the"),("the", "red"), ("the", "fox"),
    ("the", "red") , ("red", "fox"), ("red", "the"), ("fox", "the")
    ("fox", "red"), ("the", "red")

     */
    public void moveMatchesToTop(){
        /* part c */



    }

    public static void main(String[] args){
        String [] stuff = {"to","be","or","not","to","be"};
        WordDuoList wdl = new WordDuoList(stuff);
        System.out.println(wdl);
//        System.out.println(wdl.numMatches());
//        wdl.moveMatchesToTop();
//        System.out.println(wdl);
//
//        String [] stuff2 = {"one","fish","two","fish","red","fish","blue","fish"};
//        WordDuoList wdl2 = new WordDuoList(stuff2);
//        System.out.println(wdl2);
//        System.out.println(wdl2.numMatches());
//        wdl2.moveMatchesToTop();
//        System.out.println(wdl2);
//
//        String [] stuff3 = {"call","me","ishmael"};
//        WordDuoList wdl3 = new WordDuoList(stuff3);
//        System.out.println(wdl3);
//        System.out.println(wdl3.numMatches());
//        wdl3.moveMatchesToTop();
//        System.out.println(wdl3);
    }
}