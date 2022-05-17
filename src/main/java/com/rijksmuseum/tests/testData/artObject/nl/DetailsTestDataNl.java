package com.rijksmuseum.tests.testData.artObject.nl;

import com.rijksmuseum.tests.model.artObject.Acquisition;
import com.rijksmuseum.tests.model.artObject.ArtObject;
import com.rijksmuseum.tests.model.artObject.Label;
import com.rijksmuseum.tests.testData.artObject.DetailsTestData;

import java.util.Arrays;
import java.util.Collections;

public class DetailsTestDataNl implements DetailsTestData {

    public ArtObject getDefaultArtObject() {
        return ArtObject.builder()
                .id("nl-SK-C-5")
                .objectNumber("SK-C-5")
                .language("nl")
                .title("De Nachtwacht")
                .titles(Arrays.asList("Officieren en andere schutters van wijk II in Amsterdam, onder leiding " +
                                "van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch, bekend als " +
                                "‘De Nachtwacht’",
                        "Het korporaalschap van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch," +
                                " bekend als de 'Nachtwacht'"))
                .description("Officieren en andere schutters van wijk II in Amsterdam onder leiding van kapitein " +
                        "Frans Banninck Cocq en luitenant Willem van Ruytenburch, sinds het einde van de 18de eeuw bekend " +
                        "als ‘De Nachtwacht’. Schutters van de Kloveniersdoelen uit een poort naar buiten tredend. " +
                        "Op een schild aangebracht naast de poort staan de namen van de afgebeelde personen: " +
                        "Frans Banning Cocq, heer van purmerlant en Ilpendam, Capiteijn Willem van Ruijtenburch " +
                        "van Vlaerdingen, heer van Vlaerdingen, Lu[ij]tenant, Jan Visscher Cornelisen Vaendrich, " +
                        "Rombout Kemp Sergeant, Reijnier Engelen Sergeant, Barent Harmansen, Jan Adriaensen Keyser, " +
                        "Elbert Willemsen, Jan Clasen Leydeckers, Jan Ockersen, Jan Pietersen bronchorst, " +
                        "Harman Iacobsen wormskerck, Jacob Dircksen de Roy, Jan vander heede, Walich Schellingwou, " +
                        "Jan brugman, Claes van Cruysbergen, Paulus Schoonhoven. De schutters zijn gewapend met onder " +
                        "anderen pieken, musketten en hellebaarden. Rechts de tamboer met een grote trommel. " +
                        "Tussen de soldaten links staat een meisje met een dode kip om haar middel, rechts een " +
                        "blaffende hond. Linksboven de vaandrig met de uitgestoken vaandel.")
                .principalMaker("Rembrandt van Rijn")
                .acquisition(Acquisition.builder()
                        .method("bruikleen")
                        .date("1808-01-01T00:00:00")
                        .creditLine("Bruikleen van de gemeente Amsterdam")
                        .build())
                .materials(Arrays.asList("doek", "olieverf"))
                .physicalMedium("olieverf op doek")
                .longTitle("De Nachtwacht, Rembrandt van Rijn, 1642")
                .subTitle("h 379,5cm × b 453,5cm × g 337kg")
                .scLabelLine("Rembrandt van Rijn (1606-1669) olieverf op doek, 1642")
                .objectTypes(Collections.singletonList("schilderij"))
                .productionPlaces(Collections.singletonList("Amsterdam"))
                .label(Label.builder()
                        .title("De Nachtwacht")
                        .makerLine("Rembrandt van Rijn (1606-1669) olieverf op doek, 1642")
                        .description("Rembrandts beroemdste en grootste schilderij werd gemaakt voor de Kloveniersdoelen. " +
                                "Dit was een van de drie hoofdkwartieren van de Amsterdamse schutterij, " +
                                "de burgerwacht van de stad. Rembrandt was de eerste die op een schuttersstuk " +
                                "alle figuren in actie weergaf. De kapitein, in het zwart, geeft zijn luitenant " +
                                "opdracht dat de compagnie moet gaan marcheren. De schutters stellen zich op. " +
                                "Met behulp van licht vestigde Rembrandt de aandacht op belangrijke details, " +
                                "zoals het handgebaar van de kapitein en het kleine meisje op de voorgrond. " +
                                "Zij is de mascotte van de schutters. De naam Nachtwacht is pas veel later ontstaan, " +
                                "toen men dacht dat het om een nachtelijk tafereel ging.")
                        .date("2019-07-02").build())
                .build();
        //TODO: here could be added all necessary fields
    }

    public ArtObject getArtObjectWithWrongObjectNumber() {
        return ArtObject.builder()
                .objectNumber("Sk-C-5")
                .language("nl")
                .build();
    }

    public ArtObject getArtObjectWithWrongLanguage() {
        return ArtObject.builder()
                .objectNumber("SK-C-5")
                .language("ndl")
                .build();
    }

    //TODO: here could be added all necessary Art Object Details

}
