package com.rijksmuseum.tests.testData.artObject.en;

import com.rijksmuseum.tests.model.artObject.Acquisition;
import com.rijksmuseum.tests.model.artObject.ArtObject;
import com.rijksmuseum.tests.model.artObject.Label;
import com.rijksmuseum.tests.testData.artObject.DetailsTestData;

import java.util.Arrays;
import java.util.Collections;

public class DetailsTestDataEn implements DetailsTestData {

    public ArtObject getDefaultArtObject() {
        return ArtObject.builder()
                .id("en-SK-C-5")
                .objectNumber("SK-C-5")
                .language("en")
                .title("The Night Watch")
                .titles(Arrays.asList("Officers and other civic guardsmen of District II in Amsterdam, under the command " +
                                "of Captain Frans Banninck Cocq and Lieutenant Willem van Ruytenburch, known as ‘The Night Watch’",
                        "The company of Captain Frans Banninck Cocq and Lieutenant Willem van Ruytenburch, known as 'The nightwatch'"))
                .description("Officieren en andere schutters van wijk II in Amsterdam onder leiding van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch, sinds het einde van de 18de eeuw bekend als ‘De Nachtwacht’. Schutters van de Kloveniersdoelen uit een poort naar buiten tredend. Op een schild aangebracht naast de poort staan de namen van de afgebeelde personen: Frans Banning Cocq, heer van purmerlant en Ilpendam, Capiteijn Willem van Ruijtenburch van Vlaerdingen, heer van Vlaerdingen, Lu[ij]tenant, Jan Visscher Cornelisen Vaendrich, Rombout Kemp Sergeant, Reijnier Engelen Sergeant, Barent Harmansen, Jan Adriaensen Keyser, Elbert Willemsen, Jan Clasen Leydeckers, Jan Ockersen, Jan Pietersen bronchorst, Harman Iacobsen wormskerck, Jacob Dircksen de Roy, Jan vander heede, Walich Schellingwou, Jan brugman, Claes van Cruysbergen, Paulus Schoonhoven. De schutters zijn gewapend met onder anderen pieken, musketten en hellebaarden. Rechts de tamboer met een grote trommel. Tussen de soldaten links staat een meisje met een dode kip om haar middel, rechts een blaffende hond. Linksboven de vaandrig met de uitgestoken vaandel.")
                .principalMaker("Rembrandt van Rijn")
                .acquisition(Acquisition.builder()
                        .method("loan")
                        .date("1808-01-01T00:00:00")
                        .creditLine("On loan from the City of Amsterdam")
                        .build())
                .materials(Arrays.asList("canvas", "oil paint (paint)"))
                .physicalMedium("oil on canvas")
                .longTitle("The Night Watch, Rembrandt van Rijn, 1642")
                .subTitle("h 379.5cm × w 453.5cm × w 337kg")
                .scLabelLine("Rembrandt van Rijn (1606-1669) oil on canvas, 1642")
                .objectTypes(Collections.singletonList("painting"))
                .productionPlaces(Collections.singletonList("Amsterdam"))
                .label(Label.builder()
                        .title("The Night Watch")
                        .makerLine("Rembrandt van Rijn (1606-1669) oil on canvas, 1642")
                        .description("Rembrandt's largest and most famous painting was made for one of the three headquarters " +
                                "of Amsterdam's civic guard. These groups of civilian soldiers defended the city from attack. " +
                                "Rembrandt was the first to paint all of the figures in a civic guard piece in action. " +
                                "The captain, dressed in black, gives the order to march out. The guardsmen are getting into formation. " +
                                "Rembrandt used the light to focus on particular details, like the captain's gesturing " +
                                "hand and the young girl in the foreground. She was the company mascot. " +
                                "The nickname Night Watch originated much later, when the painting was thought " +
                                "to represent a nocturnal scene.")
                        .date("2019-07-02").build())
                .build();
        //TODO: here could be added all necessary fields
    }

    public ArtObject getArtObjectWithWrongObjectNumber() {
        return ArtObject.builder()
                .objectNumber("Sk-C-5")
                .language("en")
                .build();
    }

    public ArtObject getArtObjectWithWrongLanguage() {
        return ArtObject.builder()
                .objectNumber("SK-C-5")
                .language("eng")
                .build();
    }

    //TODO: here could be added all necessary Art Object Details

}
