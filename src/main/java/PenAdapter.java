package main.java;

/**
 * Created by cmalik on 7/7/2017.
 */
public class PenAdapter implements Pen {
    PilotPen pp=new PilotPen();
    @Override
    public void write(String str)
    {
        pp.mark(str);
    }
}
