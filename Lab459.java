public class Lab459 {
    public static void main(String[] args) {
        String s="ram";
        String s2=new String("ram");
        String s3=s2.intern();
        System.out.println(s==s2);
        System.out.println(s3==s2);
        System.out.println(s==s3);
    }
}
