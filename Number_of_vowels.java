public class Number_of_vowels {
    public static void main(String[] args) {
        String s = " I am a bad boy ";
        
        int count = 0; 
        for ( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if ( ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' ||
             ch== 'u'|| ch== 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch== 'U' ) 
            count ++;
        }
        System.out.println (" No. of vowels in the string is : " + count);
    }
}
