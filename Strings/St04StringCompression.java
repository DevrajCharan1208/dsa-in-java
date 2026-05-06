public class St04StringCompression{

    public static String stringCompression1(String str){
        StringBuilder sb = new StringBuilder("");

        int count = 1;
        if(str.length()==0){
            return str;
        }
        sb.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        if(count>1){
            sb.append(count);
        }
        return sb.toString();
    }

    public static String stringCompression2(String str){
        String newStr = "";

        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdde";
        System.out.println(stringCompression1(str));
        System.out.println(stringCompression2(str));
    }
}