public class MutableImutable {
    public static void main(String[] args) {
        String s3=new String("agsadja");
        s3.concat("lkj");
        System.out.println(s3);
        StringBuffer sb=new StringBuffer("india");
        sb.append("  bbsr");
        System.out.println(sb);
    }
}
