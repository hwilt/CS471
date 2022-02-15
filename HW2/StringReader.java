/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */

import java.util.ArrayList;
import java.io.File;

public class StringReader extends FormatReader{
    private char _qaDelimiter = '';
    private char _pairDelimiter = '';
    private char _typeDelimiter = '';

    /**
     * StringReader Constructor
     * Makes a StringReader object, which reads a file and creates a 
     * an array of Question objects. 
     *
     * @param fileName the name of the file to be read
     * @param qaDel the delimiter between the question and answer
     * @param pairDel the delimiter between the question and answer
     */
    public StringReader(String fileName, char qaDel, char pairDel, char typeDel){
        super(fileName);
        _qaDelimiter = qaDel;
        _pairDelimiter = pairDel;
        _typeDelimiter = typeDel;
    }

    /**
     * readFile method
     * Reads the file and creates an array of Question objects
     *
     * @return ArrayList<Question> the array of Question objects
     */
    public ArrayList<Question> readFile(){
        ArrayList<Question> questions = new ArrayList<Question>();
        File file = new File(_fileName);
        String line = "";
        
        return questions;
}