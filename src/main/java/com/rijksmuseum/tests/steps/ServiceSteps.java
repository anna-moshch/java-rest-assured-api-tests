package com.rijksmuseum.tests.steps;

import com.google.inject.Inject;
import com.rijksmuseum.tests.steps.artObject.details.DetailsSteps;
import com.rijksmuseum.tests.steps.artObject.images.ImagesSteps;
import com.rijksmuseum.tests.steps.artObject.search.SearchSteps;

public class ServiceSteps {

    @Inject
    public DetailsSteps details;

    @Inject
    public ImagesSteps images;

    @Inject
    public SearchSteps search;
}
