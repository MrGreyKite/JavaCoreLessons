package gb.weatherApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty("Headline")
    public Headline headline;
    @JsonProperty("DailyForecasts")
    public ArrayList<DailyForecast> dailyForecasts = new ArrayList<>();

    public WeatherResponse() {
    }

    public ArrayList<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    public void setDailyForecasts(ArrayList<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public class Headline{
        @JsonProperty("EffectiveDate")
        public Date effectiveDate;
        @JsonProperty("Text")
        public String text;
        @JsonProperty("Category")
        public String category;
        @JsonProperty("EndDate")
        public Date endDate;

        public Date getEffectiveDate() {
            return effectiveDate;
        }

        public void setEffectiveDate(Date effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Date getEndDate() {
            return endDate;
        }

        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }
    }

    public static class DailyForecast{
        @JsonProperty("Date")
        public Date date;
        @JsonProperty("Temperature")
        public Temperature temperature;
        @JsonProperty("Day")
        public Day day;
        @JsonProperty("Night")
        public Night night;

        public DailyForecast() {
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Temperature getTemperature() {
            return temperature;
        }

        public void setTemperature(Temperature temperature) {
            this.temperature = temperature;
        }

        public Day getDay() {
            return day;
        }

        public void setDay(Day day) {
            this.day = day;
        }

        public Night getNight() {
            return night;
        }

        public void setNight(Night night) {
            this.night = night;
        }
    }

    public static class Temperature{
        @JsonProperty("Minimum")
        public Minimum minimum;
        @JsonProperty("Maximum")
        public Maximum maximum;

        public Minimum getMinimum() {
            return minimum;
        }

        public void setMinimum(Minimum minimum) {
            this.minimum = minimum;
        }

        public Maximum getMaximum() {
            return maximum;
        }

        public void setMaximum(Maximum maximum) {
            this.maximum = maximum;
        }
    }

    public static class Minimum{
        @JsonProperty("Value")
        public double value;
        @JsonProperty("Unit")
        public String unit;
        @JsonProperty("UnitType")
        public int unitType;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getUnitType() {
            return unitType;
        }

        public void setUnitType(int unitType) {
            this.unitType = unitType;
        }
    }

    public static class Maximum{
        @JsonProperty("Value")
        public double value;
        @JsonProperty("Unit")
        public String unit;
        @JsonProperty("UnitType")
        public int unitType;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getUnitType() {
            return unitType;
        }

        public void setUnitType(int unitType) {
            this.unitType = unitType;
        }
    }

    public static class Day{
        @JsonProperty("IconPhrase")
        public String iconPhrase;

        public String getIconPhrase() {
            return iconPhrase;
        }

        public void setIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
        }
    }

    public static class Night{
        @JsonProperty("IconPhrase")
        public String iconPhrase;

        public String getIconPhrase() {
            return iconPhrase;
        }

        public void setIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
        }
    }
}
