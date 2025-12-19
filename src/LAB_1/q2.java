package LAB_1;

class q2{
    public static void main(String[] args) {

        int marks = 85;  // Mention the mark here

        String grade;

        if (marks >= 90) {
            grade = "O";
        } else if (marks >= 80) {
            grade = "E";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Display Grade: " + grade);
    }
}
