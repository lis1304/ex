package Exception;

public class Dao {

    public String getInfo() throws DaoException {
        try {
            Source source = new Source();
            source.getInfo();
            return "good Dao";
        } catch (SqlException e) {
            throw new DaoException();
           // return "exception Dao";
        }

    }
}
