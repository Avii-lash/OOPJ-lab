package LAB_2;

class q1{
    public static void main(String[] args) {

        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers from the command line.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
