/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    /**
     * Delimiter method:
     * Returns the delimiter between the question and answer and the type of question
     * 
     * @param ext the extension of the file
     * @return String[] the delimiters
     */
    public static String[] delimiters(String ext){
        String[] res = new String[2];
        switch(ext){
            case "qa":
                res[0] = "\\?";     // "?" is a special character in regex so it needs to be escaped
                res[1] = ",";
                break;
            case "tf":
                res[0] = "!";
                res[1] = "\\.";     // "." is a special character in regex so it needs to be escaped
                break;
        }
        //System.out.println(res[0] + " " + res[1] + " " + res[2]);
        return res;
    }

    public static void main(String[] args){
        String inputFileName = "";                  // name of the input file
        String outputFileName = "test.txt";         // name of the output file
        String keyFileName = "key.txt";             // name of the key file
        int scheme = -1;                            // the type of question scheme
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the input file: ");
        inputFileName = sc.nextLine();
        System.out.println("What Scheme would you like to use?\n(1). Multiple Choice\n(2). True False\n(3). One Word Answer");
        scheme = sc.nextInt();
        String[] ext = inputFileName.split("\\.");  // gets the extension of the file from the name
        String[] delimiters = delimiters(ext[1]);   // gets the delimiters for the file type
        // creates a new StringReader object
        StringReader sr = new StringReader(inputFileName, delimiters[0], delimiters[1]); 
        ArrayList<Question> questions = sr.getQuestions();
        /* Testing the StringReader class with getting the questions
        for (Question q : questions){
            System.out.println(q.createQuestion() + " " + q.getType());
        }
        */
        // creates a new TestCreator object
        TestCreator tc = new TestCreator(questions, outputFileName, keyFileName, scheme);
        System.out.println("Creating test key file...");
        tc.makeTestKeyFile();
        System.out.println("Key file created. (key.txt)");
        System.out.println("Creating test file...");
        tc.makeTestFile();
        System.out.println("Test file created. (test.txt)");

    }
}