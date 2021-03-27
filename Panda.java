class Panda extends Animal {
    public Panda(int hunger) {
        super(hunger);
    }

    public void eat(Food food) {
        System.out.println("Eat" + " " + food.name);
        // Hunger decrease 10 after eating food.
        super.hunger -= 10;
    }
}
