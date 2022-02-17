/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */


import java.util.*;
import java.io.*;

public class TestCreator{
    private ArrayList<Question> _allQuestions;  // ArrayList of all questions
    private ArrayList<Question> _order = new ArrayList<Question>();     // ArrayList of questions in order
    private String _TestFileName;
    private String _keyFileName;
    private int _scheme;                         // 1 = multiple choice, 2 = true/false, 3 = one answer

    /**
     * TestCreator Constructor
     * Makes a TestCreator object, which contains a list of questions,
     * the name of the test file, and the name of the key file that will be created
     *
     * @param questions the list of questions
     */
    public TestCreator(ArrayList<Question> q, String t, String k, int s){
        _allQuestions = q;
        _TestFileName = t;
        _keyFileName = k;
        _scheme = s;
        createRandomizedOrder();
    }

    /**
     * createRandomizedOrder
     * creates a randomized order of the questions in a hash table
     * 
     */
    private void createRandomizedOrder(){
        int numQuestions = _allQuestions.size();
        for(int i = 0; i < numQuestions; i++){
            if(_scheme == _allQuestions.get(i).getType()){
                _order.add(_allQuestions.get(i));
            }
        }
        Collections.shuffle(_order);
    }

    /**
     * makeTestFile
     * 
     * creates a test file with the questions in the randomized order
     */
    public void makeTestFile(){
        try{
            PrintWriter pw = new PrintWriter(_TestFileName);
            for(int i = 0; i < _order.size(); i++){
                String line = i + 1 + ". ";
                if(_scheme == 1){ // multiple choice
                    pw.println(line + _order.get(i).createMPQuestion());
                }
                else if(_scheme == 2){ // true/false
                    pw.println(line + _order.get(i).createTFQuestion());
                }
                else if(_scheme == 3){ // one word answer
                    pw.println(line + _order.get(i).createOneWordQuestion());
                }
            }
            pw.close();
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
    }

    /**
     * makeTestKeyFile
     * 
     * Creates a key file for the test, which contains the answers to the questions
     */
    public void makeTestKeyFile(){
        try{
            File file = new File(_keyFileName);
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; i < _order.size(); i++){
                String line = i + 1 + ". ";
                pw.println(line + _order.get(i).getAnswer());
            }
            pw.close();
        } catch(FileNotFoundException e){
            System.out.println("Error writing to file");
        }
    }

}
