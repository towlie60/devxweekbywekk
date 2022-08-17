package Week11;

public class cars {

    private String name;
    private String price;
    private String topspeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(String topspeed) {
        this.topspeed = topspeed;
    }

    public cars(String name, String price, String topspeed) {
        this.name = name;
        this.price = price;
        this.topspeed = topspeed;

    }
}
