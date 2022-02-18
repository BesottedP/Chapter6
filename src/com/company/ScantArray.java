package com.company;

import java.util.ArrayList;

/*
The ScantArray class represents a 2D array with few non-zero
entries.  It contains a list of ScantArrayEntry objects, each
of which represents one of the non-zero elements in the array.
The entries representing the non-zero elements are stored in the
list in no particular order.  Each non-zero element is represented
by exactly one entry in the list.
 */

public class ScantArray {
    /** number of rows and columns in the list */
    private int numRows;
    private int numColumns;

    /** The list of entries representing the non-zero elements of
     * the scant array.  Entries are stored in no particular order.
     */
    private ArrayList<ScantArrayEntry> entries;

    /** constructor */
    public ScantArray(int r, int c){
        numRows = r;
        numColumns = c;
        entries = new ArrayList<ScantArrayEntry>();
    }

    /** Accessors - return the number or rows/columns in the array*/
    public int getNumRows(){return numRows;}
    public int getNumColumns(){return numColumns;}

    /** Adds a new entry to the array */
    public void addEntry(int row, int col, int val){
        entries.add(new ScantArrayEntry(row, col, val));
    }

    /** Returns the value of the element at position (row, column)
     * in the sparse array
     * @param row
     * @param col
     * @return   the value in the array
     * Precondition:  0 <= row < getNumRows()
     *                0 <= col < getNumColumns()
     */
    public int getValueAt(int row, int col){
        int fin = 0;
        int x = entries.size();
        for(int i = 0; i<x; i++){
            if(entries.get(i).getColumn() == col){
                if(entries.get(i).getRow() == row){
                    fin = entries.get(i).getValue();
                }
            }
        }

        return fin;    // replace this
    }

    /** Removes a column from the scant array and shifts
     * columns to the right of col one column to the left.
     * (see description in word doc.
     * @param col
     * Precondition:  0 <= col < getNumColumns()
     */
    public void removeColumn(int col){
        /* part b */




    }

    /** Allows the ScantArray to be printed.  The
     * result should look like a 2D array.  Entries
     * not represented should display 0.  Ex:
     * 0 0 3 0 2
     * 1 0 0 0 0
     * 0 0 3 4 0
     *
     * @return
     */
    public String toString(){
        /* part c */
        String s = "";




        return s;
    }

    public static void main(String[] args){
        ScantArray sa1 = new ScantArray(4,5);
        sa1.addEntry(1,4,4);
        sa1.addEntry(2,0,1);
        sa1.addEntry(3,1,-9);
        sa1.addEntry(1,1,5);

        System.out.println(sa1.getValueAt(2,0));
        System.out.println(sa1.getValueAt(3,1));
        System.out.println(sa1.getValueAt(2,3));
        System.out.println("rows "+ sa1.getNumRows());
        System.out.println("columns "+ sa1.getNumColumns());

        System.out.println(sa1);

        sa1.removeColumn(1);
        System.out.println(sa1);

        /******* please add one more test of your own *******/
    }
}