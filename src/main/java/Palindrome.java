public class Palindrome {

    // if the reverse of string is same as string then it is palindrome

    public static void main(String[] args) {
        String input = "madam";

        if(palindrome1(input))
            System.out.println("Its Palindrome");
        else
            System.out.println("Its not Palindrome");

    }

    public static boolean palindrome(String input){
        StringBuilder sb = new StringBuilder(input);
        String temp = sb.reverse().toString();
        if(input.equals(temp))
            return true;
        return false;
    }

    public static boolean palindrome1(String input){
        int l = input.length();
       for(int i=0; i < l/2; i++ ){
           if(input.charAt(i) != input.charAt(l-1-i))
               return false;
       }
       return true;
    }

}
