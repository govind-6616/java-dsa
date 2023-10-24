public class subset_string {
    public static void main(String[] args) {
        String str="abc";
        int end=str.length();
        for (int i = 0; i < end; i++) {
            for (int j = i; j < end; j++) {
                System.out.println(str.substring(i,j+1));
            }
        }
        
    }
}
