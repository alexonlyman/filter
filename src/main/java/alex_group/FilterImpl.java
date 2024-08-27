package alex_group;

import java.util.*;

public class FilterImpl implements Filter{

    private <T> void filter(T[] arr) {
        Arrays.stream(arr).filter(word -> word.toString().toLowerCase().contains("a"))
                .filter(number -> number.toString().contains("1")).forEach(System.out::println);

    }

    @Override
    public Object apply(Object object) {
        Object[] objects = (Object[]) object;
        filter(objects);
        return objects;
    }
}
