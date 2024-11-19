class Animal {
    protected String name;
    protected static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            isFull = true;
            System.out.println(name + " покушал и теперь сыт");
        } else {
            System.out.println(name + " не покушал, так как еды недостаточно");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в миске");
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды в миску. Теперь в миске " + food + " единиц еды.");
        } else {
            System.out.println("Невозможно добавить отрицательное количество еды");
        }
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        var cat1 = new Cat("Степан");
        var cat2 = new Cat("Стасик");
        var dog1 = new Dog("Стивен");

        var bowl = new Bowl(15);

        var cats = new Cat[]{cat1, cat2};
        for (var cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        bowl.addFood(20);
    }
}
