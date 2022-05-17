package com.rijksmuseum.tests.steps;

import com.google.inject.Inject;
import com.rijksmuseum.tests.steps.artObject.AssertionSteps;
import com.rijksmuseum.tests.steps.artObject.details.DetailsSteps;
import com.rijksmuseum.tests.steps.artObject.images.ImagesSteps;
import com.rijksmuseum.tests.steps.artObject.collection.CollectionSteps;

public class ServiceSteps {

    @Inject
    public DetailsSteps details;

    @Inject
    public ImagesSteps images;

    @Inject
    public AssertionSteps generic;

    @Inject
    public CollectionSteps search;
}
