package rijksmuseum.testData.search;

import java.util.HashMap;

public class SearchParamTestsData {

    public static HashMap<String, String> getPsParamMoreThanAllowed() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("ps", "101");
        return parameters;
    }

    public static HashMap<String, String> getPageParamMax() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("p", "100");
        parameters.put("ps", "100");
        return parameters;
    }

    public static HashMap<String, String> getPageParamMoreThanAllowed() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("p", "101");
        parameters.put("ps", "100");
        return parameters;
    }

    public static HashMap<String, String> getIncorrectPageNumber() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("p", "test");
        return parameters;
    }
}
