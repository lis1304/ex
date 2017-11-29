package Exception;

public class Logic {

    public String getInfo() throws LogicException{

        try {
            Dao dao = new Dao();
            dao.getInfo();
            return "good Logic";
        } catch (DaoException e) {
            throw new LogicException();
        }

    }
}
