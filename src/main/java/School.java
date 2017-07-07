package main.java;

/**
 * Created by cmalik on 7/7/2017.
 */
public class School {
    public static  void main(String[] args)
    {
        Pen p=new PenAdapter();
        Assignment a=new Assignment();
        a.setP(p);
        a.writeAssignment("i am trying");

    }
}
