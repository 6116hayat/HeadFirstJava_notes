package MovieTestDrive;

public class MovieTestDrive {
    public static void main(String[] args) {
        // Movie One
        Movie one = new Movie();
        one.title = "PK";
        one.genre = "Funny";
        one.rating = 85;

        // Movie Two
        Movie two = new Movie();
        two.title = "1920";
        two.genre = "Horror";
        two.rating = 65;
        two.playIt();

        // Printing the 2 Movies
        System.out.println(one);
        System.out.println(two);
    }
}
