/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vut.question6;

/**
 *Program to capture and display student name, subject code, test1, test2 and test3 marks
 *and then calculates final mark
 * 
 * @author BN Moketa (219030294)
 */
public class Student
{
    private String name;
    private String subjcode;
    private int test1;
    private int test2;
    private int test3;
    
    /**
     * Sets object to default values
     */
    
    public Student()
    {
        this("none","none",0,0,0);
    }
    
    /**
     * Creates object with given data
     * @param name The name of the student
     * @param subjcode The subject code for the student
     * @param test1 Test 1 for the student
     * @param test2 Test 2 for the student 
     * @param test3 Test 3 for the student
     * 
     */
    
    public Student(String name, String subjcode, int test1, int test2, int test3)
    {
        setName(name);
        setSubjcode(subjcode);
        setTest1(test1);
        setTest2(test2);
        setTest3(test3);
    }
    
    /**
     * Returns the name of the student
     * @return The name of the student
     */
    
    public String getName()
    {
        return name;
    }
    
    /**
     *Returns the subject code for the student 
     * @return The subject code for the student
     */
    
    public String getSubjcode()
    {
        return subjcode;
    }
    
    /**
     * Returns the test 1 mark for the student
     * @return The test 1 mark for the student
     */
    
    public int getTest1()
    {
        return test1;
    }
    
    /**
     *Returns the test 2 mark for the student 
     * @return The test 2 mark for the student
     */
    
    public int getTest2()
    {
        return test2;
    }
    
    /**
     *Return the test 3 mark for the student 
     * @return The test 3 mark for the student
     */
    
    public int getTest3()
    {
        return test3;
    }
    
    /**
     * Changes the name of the student
     * @param name The name of the student
     */
    
    public final void setName(String name)
    {
        if(name.length()<3)
            throw new IllegalArgumentException("Name must be more than 3 "
                    + "characters long");
        this.name = name;
    }
    
    /**
     * Changes the subject code for the student
     * @param subjcode The subject code for the student
     */
    
    public final void setSubjcode(String subjcode)
    {
        if(subjcode.length()<3)
            throw new IllegalArgumentException("Subject code must be more than 3 "
                    + "characters long");
        this.subjcode = subjcode;
    }
    
    /**
     * Changes the test 1 mark for the student
     * @param test1 The test 1 mark for the student
     */
    
    public final void setTest1(int test1)
    {
        if(test1<0)
            throw new IllegalArgumentException("Test1 must be a positive number");
        this.test1 = test1;
    }
    
    /**
     * Changes the test 2 mark for the student
     * @param test2 The test 2 mark for the student
     */
    
    public final void setTest2(int test2)
    {
        if(test2<0)
            throw new IllegalArgumentException("Test2 must be a positive number");
        this.test2 = test2;
    }
    
    /**
     * Changes the test 3 mark for the student
     * @param test3 The test 3 mark for the student 
     */
    
    public final void setTest3(int test3)
    {
        if(test3<0)
            throw new IllegalArgumentException("Test3 must be a positive number");
        this.test3 = test3;
    }
    
    /**
     * Calculates semester mark for the student
     * @param test1 Test 1 for student
     * @param test2 Test 2 for student
     * @param test3 Test 3 for student
     * @return The semester mark for the student
     */
    
    public int calcSemesterMark(int test1,int test2,int test3)
    {
        int semMark = (test1+test2+test3)/3;
        return semMark;
    }
    
    /**
     * Calculates final mark for the student
     * @param semesterMark Semester mark for the student
     * @param examMark Exam mark for the student
     * @return Final mark for the student
     */
    
    public int calcFinalMark(int semesterMark,int examMark)
    {
        return (semesterMark+examMark)/2;
    }
    
    @Override
    public String toString()
    {
        return getClass().getName() + "[Name=" + name + "\tSubjcode=" + 
                subjcode +"\tTest1=" + test1 + "\tTest2=" + test2 + "\tTest3=" 
                + test3 +  "]";
    }
    
    
}
