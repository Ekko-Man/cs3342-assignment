class Animal {
    privat int hunger;

    public Animal(int hunger) {
        this.hunger = hunger;
    }

    public boolean isHungry() {
        if (hunger > 0)
            return true;
        else
            return false;
    }

    public void eat(Food food){
    System.out.println("Eat"+" "+ food.name)
      }
}
