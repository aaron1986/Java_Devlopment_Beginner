public class Room {

    private String guest;
    private String number;
    private double dailyRate;

    public Room(String aGuest, String aNumber, double aRate) {
        guest = aGuest;
        number = aNumber;
        dailyRate = aRate;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String isAvailable() {
        if (number.isEmpty()) {
            return "Available";
        } else {
            return "Reserved";
        }
    }

    public boolean verifyRoom() {
        if(number.charAt(0) == '0' && number.charAt(1) == '0') {
            return false;
        } else if(number.length() >= 3 && number.charAt(2) == 'A' || number.charAt(2) == 'B' || number.charAt(2) == 'C') {
            return true;
        }
        return false;
    }

    public String getType() {
        if(number.charAt(2) == 'A') {
            return "Single";
        } else if (number.charAt(2) == 'B') {
            return "Double";
        } else {
            return "Family";
        }
    }

    public String description() {
        //return string describing the room
        //type (room number) (availability) name of guest
        //return this.getType() && isAvailable() && getGuest();
        return(getType() + " " + number + " " + isAvailable() + "" + " " + guest);
    }
}