public class Question{
    private String _question = "";
    private String _answer = "";

    public Question(String q, String a){
        _question = q;
        _answer = a;
    }

    public String getQuestion(){
        return _question;
    }

    public String getAnswer(){
        return _answer;
    }
}