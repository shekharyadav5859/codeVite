public class tree {

    static void fun(int i) {

        if (i == 4) {
            return;
        }

        System.out.println("Before: " + i);

        fun(i + 1);

        System.out.println("After: " + i);
    }

    public static void main(String[] args) {
        fun(1);
    }
}