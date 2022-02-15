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
        return _question;
    }

    /**
     * getAnswer
     * Returns the answer
     *
     * @return String the answer
     */
    public String getAnswer(){
        return _answer;
    }

    /**
     * getType
     * Returns the type of question
     *
     * @return String the type of question
     */
    public String getType(){
        return _type;
    }

    /**
     * setQuestion
     * Puts the question into a String format
     *
     * @param question the question
     */
    public toString(){
        return _question + " " + _answer + " " + _type;
    }
}