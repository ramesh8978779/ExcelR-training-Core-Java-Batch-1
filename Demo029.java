public class Demo029 {
    public static void main(String[] args) {
        // Array of Friend objects
        Friend[] friendsArray = {
            new Friend("Swetha", "Kurnool"),
            new Friend("Bhavya", "Guntakal"),
            new Friend("Vivek", "Telangana"),
            new Friend("Kishore", "Atmakur")
        };

        // Output from the array
        System.out.println("FriendsList:");
        for (Friend friend : friendsArray) {
            System.out.println("Name: " + friend.getName() + ", Address: " + friend.getAddress());
        }

        
        }
    }

// Friend class to store name and address
class Friend {
    private final String name;
    private final String address;

    public Friend(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
