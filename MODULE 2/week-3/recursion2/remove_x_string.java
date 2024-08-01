

public class remove_x_string {

    public static String removex(String str){
        if(str.length()==0){
            return str;
        }

        String ans= "";
        if(str.charAt(0)!='x'){
            ans=ans+str.charAt(0);
        }

        String smallans = removex(str.substring(1));
        return ans+smallans;
    }   
    
    public static void main(String[] args) {
        String name="xxaxnxuxxrxxaxxg";
        System.out.println(removex(name));   /*This function is used to remove x from string */
    }
}
