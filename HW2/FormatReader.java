
/*
Henry Wilt
CS471
HW2
*/

import java.util.ArrayList;

public class FormatReader{
    private String _fileName = "";
    private ArrayList<Question> _Questions = new ArrayList<Question>();
    

    /**
    * Format Reader Constructor
    * Makes a Format Reader object, which reads a file and creates a 
    * an array of Question objects. 
    *
    * @param fileName the name of the file to be read
    */
    public FormatReader(String fileName){
        _fileName = fileName;
    }

    /** 
     * getFileName
     * returns the file's name
     * 
     * @return String the file's name
     */
    public String getFileName(){
        return this._fileName;
    }

    /**
    * getQuestions
    * Returns the array of Question objects created by the Format Reader
    *
    * @return ArrayList<Question> the array of Question objects
    */
    public ArrayList<Question> getQuestions(){
        return this._Questions;
    }

    /**
     * setQuestions
     * Sets the array of Question objects created by the Format Reader
     * 
     * @param questions the array of Question objects
     */
    public void setQuestions(ArrayList<Question> questions){
        this._Questions = questions;
    }

}