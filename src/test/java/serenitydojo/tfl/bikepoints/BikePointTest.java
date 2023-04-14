package serenitydojo.tfl.bikepoints;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class BikePointTest {
    @Test
    void shouldDisplayBikePoints(){
        RestAssured.get("https://api.tfl.gov.uk/BikePoint/");
    }
}
