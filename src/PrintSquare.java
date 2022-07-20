public class PrintSquare {
    public static void main(String[] args) {
        int size = 8;
        //zmeneny size
        for(int k = 0; k < size; k++) {
            for(int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
