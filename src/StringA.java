public class StringA {
    public static void main(String[] args) {

        String s = "vimal shah";
        int totalcount = s.length();
        int totalcount_afterRemove= s.replace("a","").length();
        int count= totalcount-totalcount_afterRemove;
        System.out.println("Number Occurance of a is" + count);
    }
}
