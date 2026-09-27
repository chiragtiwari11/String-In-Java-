public class PassingStringTOMethod {
    public static void change (String s){
        s = "utkarsh";
        
    }
    public static void main(String[] args) {
        String s = "vinay";
        System.out.println(s);
        change(s);
        System.out.println(s);
    
    }
    
}
