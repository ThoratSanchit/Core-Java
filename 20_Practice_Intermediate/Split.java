//We have given string. seaparate the all words and find the word who starts with 's'.  String is.
//sun is the most important part in the universe this is the source of the sunlight 
class Split {
    public static void main(String[] args) {
        String string = "sun is the most important part in the universe, this is the source of the sunlight";
        String[] words = string.split(" ");
        System.out.println("Word with start \'s' ");
        for(String word:words){
            if(word.startsWith("s")){
                System.out.println(word);
            }
        }
    }
}