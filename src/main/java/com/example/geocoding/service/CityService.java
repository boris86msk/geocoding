package com.example.geocoding.service;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageResponse;
import com.byteowls.jopencage.model.JOpenCageReverseRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class CityService {

    @Value("${API_KEY}")
    private String api_key;

    public String getCity(String latitude, String longitude) {
        double lat = Double.parseDouble(latitude);
        double lon = Double.parseDouble(longitude);
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(api_key);

        JOpenCageReverseRequest request = new JOpenCageReverseRequest(lat, lon);
        request.setLanguage("ru"); // prioritize results in a specific language using an IETF format language code
        request.setNoDedupe(true); // don't return duplicate results
        request.setLimit(4); // only return the first 5 results (default is 10)
        request.setNoAnnotations(true); // exclude additional info such as calling code, timezone, and currency
        request.setMinConfidence(3); // restrict to results with a confidence rating of at least 3 (out of 10)

        JOpenCageResponse response = jOpenCageGeocoder.reverse(request);

        String formattedAddress = response.getResults().get(0).getFormatted();
        String[] split = formattedAddress.split(", ");
        //Arrays.stream(split).forEach(System.out::println); //all info

        return Pattern.matches("\\d+", split[split.length-1]) ?
                split[split.length-4] : split[split.length-3];
    }

}
