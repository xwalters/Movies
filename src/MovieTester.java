/**
 * this program will include at least three Movie objects based on each
 * constructor you will create.
 * Test getters and test setters.
 * Display all information of three movies nicely.
 */
public class MovieTester {
    public static void main(String[] args) {
        Movies mv1 = new Movies();

        System.out.println(mv1);
        //call setters and getters


        Movies mv2 = new Movies("NAME",2000, "something","something");

        //call setters and getters.

        // after you complate toString method in the Movies, class, you will write System.out.println(mv2);
    }

}