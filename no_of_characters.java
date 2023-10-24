public class no_of_characters {
    public static void main(String[] args) {
        String statement="this is sentence given and we have to find out the number of words in it";
        String str=statement.replaceAll("[\\s,:]", "");
        char c='s';
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println("the number of characters in sentence are "+count);
    }
}
