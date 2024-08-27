package alex_group;

public class Main {
    public static void main(String[] args) {
        Filter filter = new FilterImpl();
        String[] strings = {"1Adfd", "ffffg", "1dffsa"};
        filter.apply(strings);

    }
}