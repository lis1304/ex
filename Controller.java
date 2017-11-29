package Exception;

public class Controller {

    public String getInfo() throws LogicException{

        try {
            Logic logic = new Logic();
            logic.getInfo();
            return "good Controller";
        } catch (Exception e) {
            e.printStackTrace();
            return "exception Controller";
        }

    }
}
