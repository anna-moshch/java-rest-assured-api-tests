package rijksmuseum.artObject.testData.search;

import java.util.HashMap;
import java.util.Map;

public class ParamsTestsData {

    public static Map<String, String> getParamPsMoreThanAllowed() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("ps", "101");
        return parameters;
    }

    public static Map<String, String> getParamPagingMax() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("p", "100");
        parameters.put("ps", "100");
        return parameters;
    }

    public static HashMap<String, String> getParamPagingMoreThanAllowed() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("p", "101");
        parameters.put("ps", "100");
        return parameters;
    }

    public static Map<String, String> getParamIncorrectPageNumber() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("p", "test");
        return parameters;
    }
}
