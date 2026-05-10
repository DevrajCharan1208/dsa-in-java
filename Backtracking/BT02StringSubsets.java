public class BT02StringSubsets{
    public static void stringSubset(String str,int i, String subStr){
        if (i == str.length()){
            if(subStr.length()==0){
                System.out.print("null");
            }else{
                System.out.print(subStr + " ");
            }            
            return;
        }
        stringSubset(str, i+1, subStr+str.charAt(i));
        stringSubset(str, i+1, subStr);
        
    }

    public static void main(String[] args) {
        String str = "abcd";
        stringSubset(str, 0, "");
    }
}