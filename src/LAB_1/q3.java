package LAB_1;

class q3 {
    public static void main(String[] args) {

        // Mention the day number of the current month
        int dayNumber = 14;

        String weekday;

        // Assuming day 1 of the current month is Sunday
        int remainder = dayNumber % 7;

        switch (remainder) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 0:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid Day";
        }

        System.out.println("Weekday: " + weekday);
    }
}
