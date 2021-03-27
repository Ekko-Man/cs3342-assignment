class ZooManagementSystem {
    public static void main(String[] args) {
        // Creation of animals and zoo managers.
        Monkey monkey = new Monkey(100);
        Panda panda = new Panda(50);
        Feeder feeder = new Feeder();
        Veterinarian veterinarian = new Veterinarian();
        // Health check for animals.
        veterinarian.checkHealth(monkey);
        veterinarian.checkHealth(panda);
        // Feed animals.
        feeder.feed(monkey);
        System.out.println(monkey.hunger);
        feeder.feed(panda);
        System.out.println(panda.hunger);
    }
}
