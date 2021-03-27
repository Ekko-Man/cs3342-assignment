class Monkey extends Animal {
    public Monkey(int hunger) {
        super(hunger);
    }

    public void eat(Food food) {
        System.out.println("Eat" + " " + food.name);
        // Hunger decrease 5 after eating food.
        super.hunger -= 5;
    }
}
