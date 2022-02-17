/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class StringReader extends FormatReader{
    private String _pairDelimiter;
    private String _typeDelimiter;

    /**
     * StringReader Constructor
     * Makes a StringReader object, which reads a file and creates a 
     * an array of Question objects. 
     *
     * @param fileName the name of the file to be read
     * @param qaDel the delimiter between the question and answer
     * @param pairDel the delimiter between the question and answer
     */
    public StringReader(String fileName, String pairDel, String typeDel){
        super(fileName);
        _pairDelimiter = pairDel;
        _typeDelimiter = typeDel;
        readFile();
    }

    /**
     * readFile method
     * Reads the file and creates an array of Question objects
     *
     * @return ArrayList<Question> the array of Question objects
     */
    public void readFile(){
        ArrayList<Question> questions = getQuestions();
        try{
            File file = new File(this.getFileName());
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] lineArray = line.split(_typeDelimiter);
                String[] questionArray = lineArray[0].split(_pairDelimiter);
                String question = questionArray[0]; // Question
                String answer = questionArray[1];   // Answer
                String type = lineArray[1];         // type of question
                Question q = new Question(question, answer, type);
                questions.add(q);                   // adds question object to array
                //System.out.println(q.createQuestion());
            }

        } catch(FileNotFoundException e){
            System.out.println("Error reading file");
        }
        this.setQuestions(questions);
    }
}