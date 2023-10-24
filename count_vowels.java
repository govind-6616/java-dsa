public class count_vowels {
    public static void main(String[] args) {
        String statement="this is my java program to count number of vowels,s and consonants:";
        String str=statement.toLowerCase().replaceAll("[\\s,:]","");
        System.out.println(str);
        int right=str.length()-1;
        int left=0;
        int count=0;
       while (left <= right) {
        char ch=str.charAt(left);
        switch (ch) {
            case 'a':count++;
                break;
                case 'e':count++;
        break;
        case 'o':count++;
        break;
        case 'u':count++;
        break;
        case 'v':count++;
        break;
            default:
                break;
        }
        left++;
       }
       int consonants=str.length()-count;
       System.out.println("the number of vowels "+count);
       System.out.println("the number of consonants are "+consonants);
       System.out.println("the length of string "+str.length());
    }
}
