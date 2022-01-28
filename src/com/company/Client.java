package com.company;
/*
Consider the following class that stores information about a client,
which includes a name and unique ID (a positive integer).  To
facilitate sorting, clients are ordered alphabetically by name.
If two or more clients have the same name, they are further ordered
by ID number.  A particular client is "greater than" another client
if that client appears later in the ordering than the other client.
*/
public class Client {
    private String cname;
    private int id;
    //Constructs a Client with the given name and ID number
    public Client(String name, int idnum){
        cname = name;
        id = idnum;
    }
    // returns the Client's name
    public String getName(){
        return cname;
    }
    // returns the Client's id
    public int getID(){
        return id;
    }
    public String toString(){
        return cname + " " + id;
    }
    // returns 0 when this Client is equal to the other;
    //   a positive integer when this Client is greater than the other;
    //   a negative integer when this Client is less than the other
    //   Clients are first compared by name, then if the names
    //   are the same, by id
    public int compareClient(Client other){
        int c = cname.compareTo(other.cname);
        if(c != 0) return c;
        return id-other.id;
    }

}
