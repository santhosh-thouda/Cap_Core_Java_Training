package collection;

import java.util.*;

// using Comparator operator (third party class comparison)

class Trainer {
    private int tid;
    private String tname;
    private String tsub;

    public Trainer(int tid, String tname, String tsub) {
        this.tid = tid;
        this.tname = tname;
        this.tsub = tsub;
    }

    public int getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }

    public String toString() {
        return "Tid: " + tid + ", Tname: " + tname + ", Tsub: " + tsub;
    }
}

class SortById implements Comparator<Trainer> {
    @Override
    public int compare(Trainer t1, Trainer t2) {
        return t1.getTid() - t2.getTid();   // ascending order
    }
}

class SortByName implements Comparator<Trainer> {
    @Override
    public int compare(Trainer t1, Trainer t2) {
        return t1.getTname().compareTo(t2.getTname());
    }
}


public class TrainerDriver {
    public static void main(String[] args) {

        ArrayList<Trainer> a = new ArrayList<>();
        a.add(new Trainer(204, "Santhosh", "Java"));
        a.add(new Trainer(203, "Roshan", "DSA"));
        a.add(new Trainer(201, "Dheeraj", "CP-DSA"));
        a.add(new Trainer(202, "Shubham", "SQL"));

        System.out.println("Before Sorting...");
        for (Trainer t : a) {
            System.out.println(t);
        }

        System.out.println("\nAfter Sorting by ID...");
        Collections.sort(a, new SortById());
        for (Trainer t : a) {
            System.out.println(t);
        }

        System.out.println("\nAfter Sorting by Name...");
        Collections.sort(a, new SortByName());
        for (Trainer t : a) {
            System.out.println(t);
        }
    }
}
