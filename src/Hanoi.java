public class Hanoi {

    public  void move (int n, String start, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println(start + "->" + destination);
            return;
        }
        move(n-1, start, destination, auxiliary);
        System.out.println(start + "->" + destination);
        move(n-1, auxiliary, start, destination);

    }
}
