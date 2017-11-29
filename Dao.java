package Exception;

public class Dao {

    public String getInfo() throws SqlException{

        Source source = new Source();
        source.getInfo();
        return "Dao";
    }
}
