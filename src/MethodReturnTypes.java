
public class MethodReturnTypes {
    public static void main (String[] args) {
        String text = methodString("string of text");
        System.out.println(text);

        int value = methodInteger(5);
        System.out.println(value);

        boolean result = methodBoo(5);
        System.out.println(result);
    }


    public static String methodString(String text) {
        return text;
    }
    public static int methodInteger(int x){
        return x;
    }
    public static boolean methodBoo(int num1) {
        return (num1 < 0);
    }
}