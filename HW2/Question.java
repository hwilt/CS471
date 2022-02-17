/**
 * @author Henry Wilt
 * @version 1.0
 * Class: CS471, Hw2
 */


public class Question{
    private String _question = "";
    private String _answer = "";
    private String _type = "";

    /**
     * Question Constructor
     * Makes a Question object, which contains a question and answer
     *
     * @param question the question
     * @param answer the answer
     * @param type the type of question
     */
    public Question(String q, String a, String t){
        _question = q;
        _answer = a;
        _type = t;
    }

    /**
     * getQuestion
     * Returns the question
     *
     * @return String the question
     */
    public String getQuestion(){
        return this._question;
    }

    /**
     * getAnswer
     * Returns the answer
     *
     * @return String the answer
     */
    public String getAnswer(){
        return this._answer;
    }

    /**
     * getType
     * Returns the type of question
     *
     * @return int the type of question
     */
    public int getType(){
        int ret = -1;
        if(_type.equals("multiplechoice")){
            ret = 1;
        } else if(_type.equals("truefalse")){
            ret = 2;
        } else if(_type.equals("fillinblank")){
            ret = 3;
        }
        return ret;
    }

    /**
     * createQuestino
     * Returns a string representation of the question
     * 
     * @return String the string representation of the question
     */
    public String createTFQuestion(){
        String res = "";
        res += _question + "? True or False";
        return res;
    }
    /**
     * createMPQuestion
     * Returns a string representation of the question
     * 
     * @return String the string representation of the question
     */

    public String createMPQuestion(){
        String res = "";
        res += _question + " \nChoose the correct answer";
        return res;
    }

    /**
     * createOneWordQuestion
     * Returns a string representation of the question
     * 
     * @return String the string representation of the question
     */
    public String createOneWordQuestion(){
        String res = "";
        res += _question + "? Please fill in the blank";
        return res;
    }


    /**
     * setQuestion
     * Puts the question into a String format
     *
     * @param question the question
     */
    public String toString(){
        return _question + " " + _answer + " " + _type;
    }
}