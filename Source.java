package Exception;

public class Source {

    public String getInfo() throws SqlException {

        throw new SqlException("Source");

//        return "";
}

}
