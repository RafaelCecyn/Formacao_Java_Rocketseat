package je03_WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        double d = 100.0;
        int i = (int) d;
        System.out.println(i);

        Double e = 200.0;
        Integer j = e.intValue();
        System.out.println(j);

        String num = "100";
        int p = Integer.parseInt(num);

       // Integer obj = new Integer(100); Deprecated
        Integer obj = Integer.valueOf(100);
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.compareTo(obj2)); // 0
    }
}
