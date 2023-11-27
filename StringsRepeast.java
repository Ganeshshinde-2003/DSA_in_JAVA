public class StringsRepeast {
    public static void main(String[] args){
        String word = "bacacaddaaa";
        System.out.println(repeat(word, 0));
    }
    static String repeat(String word, int i){
        if(i == word.length()){
            return "";
        }
        if(word.charAt(i) == 'a'){
            return repeat(word, i+1);
        }
        return word.charAt(i) + repeat(word, i+1);
    }
}
