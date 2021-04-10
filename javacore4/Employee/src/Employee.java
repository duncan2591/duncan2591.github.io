import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee{
    private int id;
    private String name;
    private Date dateOfBirth;
    private String address;
    private String position;
    private float basicSalary;
    private int houserOvertime;

    public Employee() {
    }

    public Employee(int id, String name, Date dateOfBirth, String address, String position, float basicSalary,
            int houserOvertime) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
        this.basicSalary = basicSalary;
        this.houserOvertime = houserOvertime;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Date(dd-MM-yyyy): ");
        try {
            dateOfBirth = df.parse(sc.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Position: ");
        position = sc.nextLine();
        System.out.println("Basic Salary: ");
        basicSalary = sc.nextFloat();
        System.out.println("Overtime hours: ");
        houserOvertime = sc.nextInt();
    }

    public float salaryCalculator() {
        return (basicSalary + (100000 * houserOvertime));
    }

    public void display() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Id: " + id + " || " + "Name: " + name + " || " + "Date: " + df.format(dateOfBirth) + " || "
                + "Address: " + address + " || " + "Position: " + position + " || " + "Salary: " + salaryCalculator());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getHouserOvertime() {
        return houserOvertime;
    }

    public void setHouserOvertime(int houserOvertime) {
        this.houserOvertime = houserOvertime;
    }

}