package rijksmuseum.testData.search;

import java.util.HashMap;

public class SearchParamTestsData {

    public static HashMap<String, String> getParamPsMoreThanAllowed() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("ps", "101");
        return parameters;
    }

    public static HashMap<String, String> getParamPagingMax() {
        HashMap<String, String> parameters = new HashMap<>();
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

    public static HashMap<String, String> getParamIncorrectPageNumber() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("p", "test");
        return parameters;
    }

    public static HashMap<String, String> getParamInvolvedMarker() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("involvedMaker", "Rembrandt%2Bvan%2BRijn");
        return parameters;
    }
}
