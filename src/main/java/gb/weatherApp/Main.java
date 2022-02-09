package gb.weatherApp;

import com.fasterxml.jackson.databind.DeserializationFeature;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        RequestHandler.objectmapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        String cityName = "Новокузнецк";

        System.out.println(RequestHandler.getCityId(cityName));


    }
}
