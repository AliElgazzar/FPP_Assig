
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static class HeartRates {

        final int heartRate = 70;
        private final float Lower_Boundary = 0.5f;
        private final float Upper_Boundary = 0.85f;
        private String firstname;
        private String lastname;
        private LocalDate DateofBirth;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");


        public HeartRates(String firstname, String lastname, LocalDate dateofBirth) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.DateofBirth = dateofBirth;
        }


        public void SetDateofBirth(LocalDate dateofBirth) {
            this.DateofBirth = dateofBirth;
        }

        public void SetFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void SetLastname(String lastname) {
            this.lastname = lastname;
        }

        public String GetDateofBirth() {
            return DateofBirth.format(formatter);
        }

        public String GetFirstname() {
            return firstname;
        }

        public String GetLastname() {
            return lastname;
        }


        public String Target_HeartRate() {
            int result = Maximum_Heart_Rate() - heartRate;
            float AVERAGE = Math.round(result);

            float LBTHR = (AVERAGE * Lower_Boundary) + heartRate;

            float UBTHR = (AVERAGE * Upper_Boundary) + heartRate;

            String Heart_Rate = String.format("The Target Heart Rate Range is between: % f and % f ", LBTHR, UBTHR);
            return Heart_Rate;
        }

        public int Maximum_Heart_Rate() {
            int result = 220 - CalculateAge(DateofBirth);
            return result;
        }

        public int CalculateAge(LocalDate DateOfBirth) {
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(DateOfBirth, currentDate);
            int Years = age.getYears();
            return Years;
        }

        @Override
        public String toString() {
            return Target_HeartRate() + "\nfirstname: " + firstname + "\nLastname: " + lastname + "\nDate of Birth: " + DateofBirth + "\nAge : " + CalculateAge(DateofBirth) + "\nMaximum Heart Rate: " + Maximum_Heart_Rate();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstname = sc.nextLine();
        System.out.println("Enter your Last Name");
        String lastname = sc.nextLine();
        System.out.println("Enter your Birthday as format -> year-month-day");
        LocalDate dateofBirth = LocalDate.parse(sc.nextLine());
        sc.close();
        HeartRates Personnalinfo = new HeartRates(firstname, lastname, dateofBirth);
        String data = Personnalinfo.toString();
        System.out.println(data);
    }
}
