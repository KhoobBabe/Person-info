package com.khubaib;

/**
 * Code author: Khubaib Ahmad Qureshy
 * code takes the info and prints it, utilizing the concepts of inheritance and composition
 */

//class Person
public class Person1 {

    //Declaring instance variables
    private String name;
    private String cNIC;
    private String email;
    private long cellNum;

    //Person constructor
    Person1(String name, String cNIC, String email, long cellNum){

        this.name = name;
        this.cNIC = cNIC;
        this.email = email;
        this.cellNum = cellNum;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getcNIC() {
        return cNIC;
    }

    public String getEmail() {
        return email;
    }

    public long getCellNum() {
        return cellNum;
    }

    @Override
    //printing the strings
    public String toString() {
        return "\nPERSON\n" +
                "\nNAME: " + name +
                "\nCNIC: " + cNIC +
                "\nEMAIL: " + email +
                "\nMOBILE NUMBER: " + cellNum;
    }
}

//class containing job description
class JobDescription{

    //Declaring instance variables
    private String designation;
    private double salary;
    private int teachLoad;

    //Job Description Constructor
    JobDescription(String designation, double salary, int teachLoad){

        this.designation = designation;
        this.salary = salary;
        this.teachLoad = teachLoad;

    }

    //getters
    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public int getTeachLoad() {
        return teachLoad;
    }

    @Override
    //String Printing
    public String toString() {
        return "\nDESIGNATION: " + getDesignation() +
                "\nSALARY: " + getSalary() +
                "\nTEACHING LOAD (HOURS): " + getTeachLoad();
    }
}

//class containing hiring dates
class HiringDate{

    //Declaring Instance Variables
    int day;
    String month;
    int year;

    //Hiring Date Constructor
    HiringDate(int day, String month, int year){

        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters
    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    //Printing the String
    public String toString() {
        return getDay() + " - " + getMonth() + " - " + getYear();
    }
}

//class Student
class Student__ extends Person1{

    //Declaring Instance variables
    int reg;
    int batch;

    //Student Constructor
    Student__(String Name, String cNIC, String email, long cellNum, int batch, int reg){

        super(Name, cNIC, email, cellNum);
        this.batch = batch;
        this.reg = reg;
    }

    //getters
    public int getBatch() {
        return batch;
    }

    public int getReg() {
        return reg;
    }

    @Override
    //String Printing
    public String toString() {
        return "STUDENT\n" +
                "\nNAME: " + getName() +
                "\nCNIC: " + getcNIC() +
                "\nE-MAIL: " + getEmail() +
                "\nMOBILE NUMBER: " + getCellNum() +
                "\nBATCH: " + getBatch() +
                "\nREGISTRATION NO.: " + getReg();
    }
}

//class Faculty
class Faculty__ extends Person1{

    //Declaring instance variables
    long officeNum;
    HiringDate hiringDate;//adding this using composition
    JobDescription jobDescription;//adding this using composition

    //Faculty constructor
    Faculty__(String name, String cNIC, String email, long cellNum, long officeNum, HiringDate hiringDate, JobDescription jobDescription){
        super(name, cNIC, email, cellNum);
        this.officeNum = officeNum;
        this.hiringDate = hiringDate;
        this.jobDescription = jobDescription;
    }

    //getters
    public long getOfficeNum() {
        return officeNum;
    }

    public HiringDate getHiringDate() {
        return hiringDate;
    }

    public JobDescription getJobDescription() {
        return jobDescription;
    }

    @Override
    //Printing String
    public String toString() {
        return "FACULTY MEMBER\n" +
                "\nNAME: " + getName() +
                "\nCNIC: " + getcNIC() +
                "\nE-MAIL: " + getcNIC() +
                "\nOFFICE NUMBER: " + getOfficeNum() +
                "\nMOBILE NUMBER: " + getCellNum() +
                getJobDescription() +
                "\nHIRING DATE: " + getHiringDate();

    }
}

//class test
class Person1Testing{

    public static void main(String[] args) {

        //Person Object
        Person1 person = new Person1("Hamza", "35202-0921117-8", "hqureshy@gmail.com", 03214566243);

        //Student Object
        Student__ student = new Student__("khubaib", "35202-0334212-3", "kqureshy@wth.com", 03354156777, 2024, 336691);

        HiringDate date = new HiringDate(21, "March", 2015);//date object
        JobDescription job = new JobDescription("lab instructor", 1000000, 12);//job description object
        //Faculty object
        Faculty__ faculty = new Faculty__("Nadeem Nawaz", "35201-9768578-1", "nnawaz@bestteacher.com", 51346792, 9267895, date, job);

        //Printing them all
        System.out.println(person);
        System.out.println("\n----------------------------------\n");
        System.out.println(student);
        System.out.println("\n----------------------------------\n");
        System.out.println(faculty);


    }
}

