package Chapter3;

import java.util.Calendar;
import java.util.Scanner;

public class Target_Heart_Rate {

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;

    public Target_Heart_Rate(String firstName, String lastname, String gender, int day, int month, int year) {
        setFirstName(firstName);
        setLastName(lastname);
        setGender(gender);
        setDay(day);
        setMonth(month);
        setYear(year);
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

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        Calendar today = Calendar.getInstance();
        int thisDay = today.get(Calendar.DAY_OF_MONTH);
        int thisMonth = today.get(Calendar.MONTH);
        int thisYear = today.get(Calendar.YEAR);

        int age = thisYear - year;

        if(thisMonth < month || (thisMonth == month && thisDay < day)) { age --; }
        return age;
    }

    public int getMaximumHeartBeatRate() {
        return 220 - getAge();
    }

    public String getMaximumHeartBeatRateRange() {
        int heartBeatRange = getMaximumHeartBeatRate();
        return String.format("%.0f - %.0f", heartBeatRange * 0.5, heartBeatRange * 0.85);
    }


    public static void main(String[] args) {
        Scanner samibyrone = new Scanner(System.in);

        System.out.print("What is Your First Name: ");
        String firstName = samibyrone.nextLine();

        System.out.print("What is Your Last Name: ");
        String lastName = samibyrone.nextLine();

        System.out.print("What is Your Gender: ");
        String gender = samibyrone.nextLine();

        System.out.print("What is Your Birth Day (1-31): ");
        int day = samibyrone.nextInt();

        System.out.print("What is Your Birth Month (1-12): ");
        int month = samibyrone.nextInt();

        System.out.print("What is Your Birth Year: ");
        int year = samibyrone.nextInt();

        Target_Heart_Rate target = new Target_Heart_Rate(firstName, lastName, gender, day, month, year);

        System.out.println("\nHere is Your Heart Rate Information:");
        System.out.println("\nYour full Name is: " + target.getFirstName() + " " + target.getLastName());
        System.out.println("\nYour Gender is: " + target.getGender());
        System.out.println("\nYour Date of Birth: " + target.getDay() + "/" + target.getMonth() + "/" + target.getYear());
        System.out.println("\nYour Maximum Heart Beat Rate: " + target.getMaximumHeartBeatRate() + "Beats Per minutes");
        System.out.println("\nYour Maximum Heart Rate Range: " + target.getMaximumHeartBeatRateRange() + "Beats Per minutes");
    }
}
