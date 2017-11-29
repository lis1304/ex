package Exception;

public class View {



    public String getInfo(){

        try {
            Controller controller = new Controller();
            controller.getInfo();
            return "good View";
        } catch (Exception e) {
            return "exception View";
        }


    }
}
