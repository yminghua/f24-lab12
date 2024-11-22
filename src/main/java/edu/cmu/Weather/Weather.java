package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private boolean inches;

    /**
     * Sets the length scale for rainfall.
     *
     * @param inches if true, sets the scale to inches; if false, sets the scale to millimeters.
     */
    public void setLengthScale(boolean inches) {
        this.inches = inches;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service
     * in the specified scale and updates the default scale.
     *
     * @param inches if true, retrieves rainfall in inches and sets the default scale to inches;
     *               if false, retrieves rainfall in millimeters and sets the default scale to millimeters.
     * @return the rainfall amount in the specified scale.
     */
    public double getRainfall(boolean inches) {
        // Update the default scale
        setLengthScale(inches);

        // Retrieve rainfall in the specified scale
        double wsRainfall = weatherService.getRainfall();
        if (this.inches) {
            return wsRainfall / 25.4; // Convert millimeters to inches
        } else {
            return wsRainfall; // Return millimeters by default
        }
    }
}
