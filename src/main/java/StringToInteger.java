public class StringToInteger {

        public static int myAtoi(String s) {
            if(s.length() <=0)
                return 0;
            StringBuilder sb = new StringBuilder();
            int index =0;
            boolean isNegative = false;

            while(index < s.length() && Character.isWhitespace(s.charAt(index)))
                index++;

            if(index < s.length() && s.charAt(index) == '-'){
                isNegative = true;
                index++;
            }else if(index < s.length() && s.charAt(index) == '+')
                index++;

            if((index < s.length() && !Character.isDigit(s.charAt(index))) || index == s.length())
                return 0;


            for(int i=index; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i)))
                    sb.append(s.charAt(i));
                else{
                    break;
                }
            }

            int ans = isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            try{
                ans = Integer.valueOf(sb.toString());
            }catch(NumberFormatException ne){}
            if(isNegative)
                return ~(ans) + 1;

            return ans;
        }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
