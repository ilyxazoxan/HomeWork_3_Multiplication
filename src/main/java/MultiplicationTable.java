public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("    2  3  4  5  6  7  8  9");
        int i = 2;
        while (i < 10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j < 10) {
                int mul = i * j;
                if (mul < 10)
                    System.out.print(mul + "  ");
                else
                    System.out.print(mul + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
