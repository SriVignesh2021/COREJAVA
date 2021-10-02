class Weather{
 static int numberOfInstances=0;
 WeatherSeason season;
 float temperatureinCelsius=28.0f;
 String humidity;
 boolean feel;
 
 
 Weather(WeatherSeason season,String humidity)
 
 {
   numberOfInstances++;
   this.season=season;
   this.humidity=humidity;
 
 }

}