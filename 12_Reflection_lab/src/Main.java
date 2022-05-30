import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args){

        Class<Reflection> reflection = Reflection.class;

        Method[] methods = reflection.getDeclaredMethods();



        Arrays.stream(methods)
                .filter(m -> !m.getName().equals("toString"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(Main::printer);

//        Arrays.stream(methods)
//                .filter(m -> !m.getName().equals("toString"))
//                .filter(m -> m.getReturnType() == void.class)
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(m -> System.out.printf("%s and will set field of class %s%n"
//                        ,m.getName(), m.getParameterTypes()[0].getSimpleName()));

    }
    public static void printer(Method m){
        if (m.getName().startsWith("get")){
            System.out.printf("%s will return class %s%n"
                    ,m.getName(), m.getReturnType().getSimpleName());
        } else {
            System.out.printf("%s and will set field of class %s%n"
                    ,m.getName(), m.getParameterTypes()[0].getSimpleName());
        }
    }
}
