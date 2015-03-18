package ronandoyle.ie.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Used to parse the weather data.
 *
 * @author Ronan Doyle <ronan@donedeal.ie>
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject object = new JSONObject(weatherJsonStr);
        JSONArray dateArray = object.getJSONArray("list");
        JSONObject date = (JSONObject) dateArray.get(dayIndex);
        JSONObject temp = date.getJSONObject("temp");
        return temp.getDouble("max");
    }
}
