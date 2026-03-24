public class UseCase4_BookMyStay {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay Application =====");
        System.out.println("Hotel Booking System v4.0\n");

        RoomInventory inventory = new RoomInventory();

        List<Room> rooms = new ArrayList<>();
        rooms.add(new SingleRoom());
        rooms.add(new DoubleRoom());
        rooms.add(new SuiteRoom());

        RoomSearchService.searchAvailableRooms(inventory, rooms);

        System.out.println("\nSearch completed (no data modified).");
    }
}