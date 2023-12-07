package Loops;

public class MultiFor {
    // Output
    /*
    0  4
    0  3
    2  4
    2  3
    3  4
    3  3
    */

    public static void main(String[] args) {
        // loop for x
        for(int x = 0; x < 4; x++){
            for (int y = 4; y > 2 ; y--) {
                if (x == 1){
                    x++;
                } // if end
                System.out.println(x +" "+ y);
            } // end y-for loop
        } // end x-for loop
    } // main end
} // class end
