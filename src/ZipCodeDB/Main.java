package ZipCodeDB;

public class Main {

    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton", 75.16, 44.59, 11781);
        Zipcode z2 = new Zipcode("13083", "NY", "Marathon",76.04, 42.45, 3586);

        //System.out.println(z1);
       // System.out.println(z2);

        Database db = new Database();
        //System.out.println(db.findByZip("13047"));

        System.out.println(db.getNorthern());

       // System.out.println(db.search("43221"));

        WeatherObservation wob = db.search("13617").getWeatherData();
        //System.out.println(wob);

        return;
    }
}
