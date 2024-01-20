public class Find_distance_of_string{
    public static void main(String[] args) {
        // Find the minimum distance between the given two words
        String [] str = {"Do", "one", "thing", "every", "day", "that", "scares", "you"};
        String w1 = "one";
        String w2 = "scares";
        System.out.println("Minimum distance between the given two words = "+findMinimumDistanceBetweenTwoWords(str, w1, w2));
    } 
    public static int findMinimumDistanceBetweenTwoWords(String[] str, String word1, String word2) {
        int w1v = 0;
        int w2v = 0;
        for (int i = 0; i < str.length; i++){
            if (word1 == str[i]){
                w1v = i;
            }
        }
        for (int i = 0; i < str.length; i++){
            if (word2 == str[i]){
                w2v = i;
            }
        }
        w2v = w2v - w1v;
        return w2v;
    }
}
