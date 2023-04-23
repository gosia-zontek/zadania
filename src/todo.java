import java.util.ArrayList;
import java.util.List;

public class todo {
    public static void main( String[] args )  {

        List<String> todo = new ArrayList<>();
            todo.add("wejdz");
            todo.add("umyj");
            todo.add("zajrzyj");

        System.out.println("1element: " + todo.get(0));
        System.out.println("2element: " + todo.get(1));
        System.out.println("3element: " + todo.get(2));
        System.out.println("cala lista" + todo);
        System.out.println(todo.size());
        }

}
