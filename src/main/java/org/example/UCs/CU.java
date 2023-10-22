package org.example.UCs;

import java.util.ArrayList;

public class CU
{
    private String nameCu;
    private ArrayList<Mark> marks;
    private int totalStudents;

    private double averageNote;

    public CU(String nameCu)
    {
        this.nameCu = nameCu;
        this.marks = new ArrayList<>();
        this.totalStudents = 0;
    }

    public void insertMark(int numStudent, double mark)
    {
        marks.add(new Mark(numStudent,mark));
    }

    public double searchStudentNote(int numStudent)
    {
        Mark tempMark = searchStudent(numStudent);
        if(tempMark != null)
        {
            return tempMark.getMark();
        }
        return -1;
    }

    public Mark searchStudent(int numStudent)
    {
        for(Mark mark : marks)
        {
            if(mark.getNumStudent() == numStudent)
            {
                return mark;
            }
        }
        return null;
    }

    public double averageCU()
    {
        calcularNotaMedia();
        return averageNote;
    }
    public void calcularNotaMedia()
    {
        int count = 0;
        double soma = 0;
        for(Mark m : marks)
        {
            soma += m.getMark();
            count ++;
        }
        averageNote = (soma/count);
    }
    public boolean isApproved (int numStudent)
    {
        Mark tempMark = searchStudent(numStudent);
        if(tempMark != null)
        {
            if(tempMark.getMark() >= 9.5)
            {
                return true;
            }
        }
        return false;
    }


}
