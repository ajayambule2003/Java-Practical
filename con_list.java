// Java Program to convert List to Stream in Java 

import java.util.List;
import java.util.stream.Stream;

class con_list {
    private static <T> Stream<T> convertListToStream(List<T> list)
    {
        return list.stream();
    }

    public static void main(String args[]) 
    {
        List<String> list = Arrays.asList("Java Programming",
                                          "A computer portal", 
                                          "for development");
        System.out.println("List: " + list);

        Stream<String> stream = convertListToStream(list);

        System.out.println("Stream from List: "
                    + Arrays.toString(stream.toArray()));
    }
}
