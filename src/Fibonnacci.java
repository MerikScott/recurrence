public class Fibonnacci {

    public int fibElement(int n) {
        if (n <2) return n;
        else  {
            return fibElement(n-1) + fibElement(n-2);
        }
    }


}
