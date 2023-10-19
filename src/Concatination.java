import java.util.Arrays;

public class Concatination {

    public class Language{

        private String[] language1;
        private String[] language2;
        private String[] concatinationResult;

        public void SetLanguage1(String[] language){
            this.language1 = language;
        }

        public void SetLanguage2(String[] language){
            this.language2 = language;
        }

        public String[] GetConcatinationResult(){
            return concatinationResult;
        }

        public void Concatination(){

            concatinationResult = new String[language1.length * language2.length];
            int count = 0;
            for (int i = 0; i < this.language1.length; i++){
                for (int j = 0; j < this.language2.length; j++){
                    this.concatinationResult[count] = this.language1[i] + this.language2[j];
                    count++;
                }
            }
        }
    }
    public static void main(String[] args){
        

        Concatination concatination = new Concatination();
        Language language = concatination.new Language();
        language.SetLanguage1(new String[]{
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38"});
        language.SetLanguage2(new String[]{
            "a", "b", "c", "d", "e", "f", "g", "e", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z"});
        language.Concatination();
        String[] concatinationResult = language.GetConcatinationResult();

        for (int i = 0; i < concatinationResult.length; i++){
            System.out.print(concatinationResult[i] + " ");
        }

    }
}
