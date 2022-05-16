package com.rijksmuseum.tests.testData.artObject;

import java.util.HashMap;
import java.util.Map;

public class ParamsTestsData {

    public Map<String, String> getParamPsMoreThanAllowed() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("ps", "101");
        return parameters;
    }

    public Map<String, String> getParamPagingMax() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("p", "100");
        parameters.put("ps", "100");
        return parameters;
    }

    public HashMap<String, String> getParamPagingMoreThanAllowed() {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("p", "101");
        parameters.put("ps", "100");
        return parameters;
    }

    public Map<String, String> getParamIncorrectPageNumber() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("p", "test");
        return parameters;
    }
}
