import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String attractionName, String time, int price) {
        Attraction attraction = new Attraction(attractionName, time, price);
        attractions.add(attraction);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Парк " + name + "\n");
        for (int i = 0; i < attractions.size(); i++) {
            Attraction attraction = attractions.get(i);
            info.append("аттракцион ").append(i + 1).append(": ")
                    .append(attraction.getAttraction())
                    .append(", время работы ").append(attraction.getTime())
                    .append(", стоимость ").append(attraction.getPrice()).append("\n");
        }
        return info.toString();
    }

    public class Attraction {
        private String attraction;
        private String time;
        private int price;

        public Attraction(String attraction, String time, int price) {
            this.attraction = attraction;
            this.time = time;
            this.price = price;
        }

        public String getAttraction() {
            return attraction;
        }

        public String getTime() {
            return time;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Stars");
        park.addAttraction("Карусель", "9.00-22.00", 600);
        park.addAttraction("Горки", "9.00-22.00", 1000);
        System.out.println(park);
    }
}