package Exception;

public class Logic {

    public String getInfo() throws DaoException{

        try {
            Dao dao = new Dao();
            dao.getInfo();
            return "good Logic";
        } catch (Exception e) {
            return "exception Logic";
        }

    }
}
