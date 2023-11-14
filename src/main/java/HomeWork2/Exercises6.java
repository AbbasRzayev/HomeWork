package HomeWork2;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {

            System.out.println("Add which month:");
            Scanner answerMonth = new Scanner(System.in);
            int answerAy = answerMonth.nextInt();

            System.out.println("Add which day:");
            int answerGun = answerMonth.nextInt();

            String month = getMonthCheck(answerAy);
            String day = getWeekDaysByIndex(answerGun);
            System.out.println("Month:" + month + " Day:" + day);

        }
        private static String getMonthCheck(int check)
        {
            switch (check) {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "Octaber";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return null;
            }
        }

        private static String getWeekDaysByIndex(int index) {
            switch (index) {
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Friday";
                case 5:
                    return "Saturday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
                default:
                    return null;
            }
        }
    }
