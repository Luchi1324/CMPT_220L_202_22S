import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
        new GregorianCalendar(2014, 4, 5, 5, 5, 0),
        new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235",
        new GregorianCalendar(2014, 4, 5, 6, 55, 0),
        new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237",
        new GregorianCalendar(2014, 4, 5, 9, 35, 0),
        new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTime());
        System.out.println(itinerary.getTotalFlightTime());
    }
}


class Flight {
    // Datafields
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    // Constructor
    Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getters
    public String getFlightNo() {
        return flightNo;
    }
    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }
    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    // Setters
    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }
    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // Methods
    public long getFlightTime() {
        return (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis())/60000;
    }
}

class Itinerary {
    // Datafields
    private List<Flight> flights;

    // Constructor
    Itinerary(List<Flight> flights) {
        this.flights = flights;
    }

    // Methods
    public long getTotalTime() {
        long firstFlight = (flights.get(0).getDepartureTime().getTimeInMillis());
        long finalFlight = (flights.get(flights.size()-1).getArrivalTime().getTimeInMillis());
        return (finalFlight - firstFlight) / 60000; 
    }

    public long getTotalFlightTime() {
        long flightTotal = 0;
        for (int i = 0; i < flights.size(); i++) {
            long temp = (flights.get(i).getArrivalTime().getTimeInMillis() - flights.get(i).getDepartureTime().getTimeInMillis())/60000;
            flightTotal += temp;
        }
        return flightTotal;
    }
}