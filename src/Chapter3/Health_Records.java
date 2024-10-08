package Chapter3;

import java.util.Calendar;
import java.util.Scanner;

public class Health_Records {
    String firstName;
    String lastName;
    String gender;
    int birthDay;
    int birthMonth;
    int birthYear;
    double height;
    double weight;

    public Health_Records(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear, double height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setBirthDay(birthDay);
        setBirthMonth(birthMonth);
        setBirthYear(birthYear);
        setHeight(height);
        setWeight(weight);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH);
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;

        if(currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) { age--; }
        return age;
    }

    public double getBodyMassIndex() {
        if(height <= 0) System.out.println("Height must be greater than 0");
        return (weight * 703) / (height * height);
    }

    public int getBodyMassIndex_maximumHeartRate() {
        return 200 - getAge();
    }

    public String getBodyMassIndex_heartRateRange() {
        int heartRange = getBodyMassIndex_maximumHeartRate();
        return String.format("%.0f - %.0f", heartRange * 0.5, heartRange * 0.85);
    }

    public static void main(String[] args) {

        Scanner samibyrone = new Scanner(System.in);

        System.out.print("What is Your First Name: ");
        String firstName = samibyrone.nextLine();

        System.out.print("What is Your Last Name: ");
        String lastName = samibyrone.nextLine();

        System.out.print("What is Your Gender: ");
        String gender = samibyrone.nextLine();

        System.out.print("What is Your Birth Day: ");
        int birthDay = samibyrone.nextInt();

        System.out.print("What is Your Birth Month: ");
        int birthMonth = samibyrone.nextInt();

        System.out.print("What is Your Birth Year: ");
        int birthYear = samibyrone.nextInt();

        System.out.print("What is Your Height (in inches): ");
        double height = samibyrone.nextDouble();

        System.out.print("What is Your Weight (in pounds): ");
        double weight = samibyrone.nextDouble();

        Health_Records healthRecords = new Health_Records(firstName, lastName, gender, birthDay, birthMonth, birthYear, height, weight);

        System.out.println("\nHere is your Health Records profile Information: ");
        System.out.println("\nYour Full Name is: " + healthRecords.getFirstName() + " " + healthRecords.getLastName());
        System.out.println("\nYour Gender is: " + healthRecords.getGender());
        System.out.println("\nYour Date of Birth is: " + healthRecords.getBirthDay() + "/" + healthRecords.getBirthMonth() + "/" + healthRecords.getBirthYear());
        System.out.println("\nYour Age is: " + healthRecords.getAge() + " years");
        System.out.println("\nYour Height is: " + healthRecords.getHeight() + " inches");
        System.out.println("\nYour Weight is: " + healthRecords.getWeight() + " pounds");
        System.out.println("\nYour Body Mass Index is: " + healthRecords.getBodyMassIndex());
        System.out.println("\nYour Maximum Heart Rate is: " + healthRecords.getBodyMassIndex_maximumHeartRate());
        System.out.println("\nYour Heart Beat Rate Range is Between: " + healthRecords.getBodyMassIndex_heartRateRange());
    }
}
