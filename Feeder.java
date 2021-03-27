class Feeder extends ZooManager {
    void feed(Animal animal) {
        if (animal.isHungry()) {
            Food food = new Food("food");
            animal.eat(food);
        }
    }
}
