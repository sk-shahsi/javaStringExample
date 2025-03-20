public class Lab461 {
    public static void main(String[] args) {
        String s1="ram";
        String s2="ram";
        String s3="sita";
        System.out.println(s1==s2);
        System.out.println(s3==s1);
        System.out.println(s1.equals(s2));
        String s4= new String("ram");
        String s5=new String("ram");
        System.out.println(s4==s5);
        System.out.println(s5.equals(s2));
    }
}
