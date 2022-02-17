package gb.weatherApp;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class RequestHandler {
    static OkHttpClient client = new OkHttpClient();
    static ObjectMapper objectmapper = new ObjectMapper();

    public static String getCityId(String cityName) throws IOException {

        HttpUrl citiesUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "KmJqNQwPaf6jYCwG8CLfO3WL5cAMp3ow")
                .addQueryParameter("q", cityName)
                .addQueryParameter("language", "ru")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(citiesUrl)
                .build();

        Response response = client.newCall(request).execute();

        String jsonCities = Objects.requireNonNull(response.body()).string();
        String cityID = objectmapper.readTree(jsonCities).get(0).at("/Key").asText();

        return cityID;
    }

    public static ArrayList<WeatherResponse.DailyForecast> getWeatherForDays(String cityID, int days) throws IOException {

        HttpUrl weatherUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment(days + "day")
                .addPathSegment(cityID)
                .addQueryParameter("apikey", "KmJqNQwPaf6jYCwG8CLfO3WL5cAMp3ow")
                .addQueryParameter("language", "ru")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(weatherUrl)
                .build();

        Response response = client.newCall(request).execute();

        String weatherJson = Objects.requireNonNull(response.body()).string();

//        String firstDate = objectmapper.readTree(weatherJson).at("/DailyForecasts").get(0).at("/Date").asText();

        WeatherResponse weatherFor5Days = objectmapper.readValue(weatherJson, WeatherResponse.class);

//        System.out.println(firstDate);

        return weatherFor5Days.getDailyForecasts();
    }

}
