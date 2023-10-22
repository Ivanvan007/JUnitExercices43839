package org.example.UCs;

public class Mark
{
    private int numStudent;
    private double mark;

    private static final int NUM_STUDENT = 00000;
    private static final double MARK_STUDENT = 0;

    public Mark(int numStudent, double mark)
    {
        this.numStudent = numStudent;
        this.mark = mark;
    }

    public Mark()
    {
        this.numStudent = NUM_STUDENT;
        this.mark = MARK_STUDENT;
    }

//Getters & Setters

    public int getNumStudent()
    {
        return numStudent;
    }

    public void setNumStudent(int numStudent)
    {
        this.numStudent = numStudent;
    }

    public double getMark()
    {
        return mark;
    }

    public void setMark(double mark)
    {
        this.mark = mark;
    }

//To String Method

    @Override
    public String toString()
    {
        return "Student: \n" +
                "\t numStudent: " + numStudent + "\n" +
                "\t mark: " + mark + "\n";
    }
}
