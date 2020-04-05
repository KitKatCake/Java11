//package Daily;
//
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//
//public class test1 {
//    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class<?> klass = methodClass.class;
//        Object obj = klass.newInstance();
//        Method method = klass.getMethod("add", int.class, int.class);
//        Object result = method.invoke(obj, 1, 4);
//        System.out.println(result);
//    }
//
//    class methodClass {
//        public final int fuck = 3;
//
//        public int add(int a, int b) {
//            return a + b;
//        }
//
//        public int sub(int a, int b) {
//            return a - b;
//        }
//    }
//}
