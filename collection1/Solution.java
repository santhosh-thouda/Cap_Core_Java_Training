package collection1;

import java.util.*;

public class Solution{
    public static void main(String[] args){
        HashSet<Booking> set = new HashSet<>();
        Passenger p1 = new Passenger("P123", "Ravi");
        Passenger p2 = new Passenger("P999", "Amit");
        
        Booking b1 = new Booking(9001, p1);
        Booking b2 = new Booking(9001, p2);

        set.add(b1);
        set.add(b2);

        System.out.println(set.size());
        System.out.println(set);
    }
}

class Passenger{
    String passportNo;
    String name;

    Passenger(String passportNo, String name){
        this.passportNo = passportNo;
        this.name = name;
    }
}

class Booking{
    int bookingId;
    Passenger passenger;

    Booking(int bookingId, Passenger passenger){
        this.bookingId = bookingId;
        this.passenger = passenger;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Booking))return false;
        Booking that = (Booking)obj;
        return this.bookingId == that.bookingId;
    }

    public int hashCode(){
        return Integer.hashCode(bookingId);
    }

    public String toString(){
        return "Booking[id="+bookingId+", passenger="+passenger.name+"]";
    }
}