/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */

public class Driver{
    /**
     * Delimiter method:
     * Returns the delimiter between the question and answer and the type of question
     * 
     * @param ext the extension of the file
     * @return String[] the delimiters
     */
    public static String[] delimiters(String ext){
        String[] res = new String[3];
        switch(ext){
            case ".qa":
                res[0] = "?";
                res[1] = "\t";
                res[2] = ")";
                break;
            case ".tf":
                res[0] = "?";
                res[1] = ",";
                res[2] = ")";
                break;
        }
        //System.out.println(res[0] + " " + res[1] + " " + res[2]);
        return res;
    }

    public static void main(String[] args){
        String inputFileName = "input.qa"; // name of the input file
        String outputFileName = "test.txt"; // name of the output file
        int index = inputFileName.indexOf(".");
        String extension = inputFileName.substring(index);
        String[] delimiters = delimiters(extension);
        StringReader sr = new StringReader(inputFileName, delimiters[0], delimiters[1], delimiters[2]);

        //ArrayList<Question> questions = sr.readFile();
        //for(int i = 0; i < questions.size(); i++){
        //    System.out.println(questions.get(i).getQuestion());
        //    System.out.println(questions.get(i).getAnswer());
        //}
    }
}