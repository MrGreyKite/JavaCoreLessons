package gb.weatherApp;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
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
                .addQueryParameter("apikey", "4rAAoBa4m9GjN4cW10MyRSurnXbWnaIA")
                .addQueryParameter("q", cityName)
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


}
