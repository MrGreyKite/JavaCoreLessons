package gb.weatherApp;

import com.fasterxml.jackson.databind.DeserializationFeature;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        RequestHandler.objectmapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        String cityName = "Новокузнецк";
        String pattern = "dd.MM.yyyy";
        DateFormat df = new SimpleDateFormat(pattern);

        System.out.println(RequestHandler.getCityId(cityName));

        RequestHandler.getWeatherForDays(RequestHandler.getCityId(cityName), 5);

        for (WeatherResponse.DailyForecast element : RequestHandler.getWeatherForDays(RequestHandler.getCityId(cityName), 5)) {
            System.out.println("Погода на день: В городе " + cityName + " на дату " + df.format(element.getDate())
                    + " ожидается ночью: " + element.getNight().getIconPhrase()
            +  ", днем: " + element.getDay().getIconPhrase() + ", минимальная температура: " +
                    element.getTemperature().getMinimum().getValue() + element.getTemperature().getMinimum().getUnit() +
                    ", максимальная температура: " + element.getTemperature().getMaximum().getValue() + element.getTemperature().getMaximum().getUnit());
        }


    }
}
