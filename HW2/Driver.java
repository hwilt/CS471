/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */

public class Driver_1{

    public static String[] delimiters(String ext){
        String[] res = new String[2];
        switch(ext){
            case ".qa":
                res[0] = "?";
                res[1] = "\t";
                break;
            case ".tf":
                res[0] = "?";
                res[1] = ",";
                break;
        }
        return res;
    }

    public static void main(String[] args){
        String inputFileName = "input.qa.txt"; // name of the input file
        String outputFileName = "output.txt"; // name of the output file
        int index = inputFileName.indexOf(".");
        String extension = inputFileName.substring(index);
        String[] delimiters = delimiters(extension);
        //StringReader sr = new StringReader("input.qa.txt", '?', '\t');
        //ArrayList<Question> questions = sr.readFile();
        //for(int i = 0; i < questions.size(); i++){
        //    System.out.println(questions.get(i).getQuestion());
        //    System.out.println(questions.get(i).getAnswer());
        //}
    }
}