package org.example;

public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this(0); // Calls the other constructor with 0
    }

    // Method to return the current value of the counter
    public int value() {
        return this.value;
    }

    // Method to increase the value by 1
    public void increase() {
        this.value++;
    }

    // Method to decrease the value by 1
    public void decrease() {
        this.value--;
    }

    // Overloaded method to increase the value by increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    // Overloaded method to decrease the value by decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        // Using the constructor that sets the start value to 10
        Counter counter1 = new Counter(10);
        System.out.println("Counter1 initial value: " + counter1.value());

        // Using the increase method with no parameters
        counter1.increase();
        System.out.println("Counter1 after increase(): " + counter1.value());

        // Using the increase method with a parameter
        counter1.increase(5);
        System.out.println("Counter1 after increase(5): " + counter1.value());

        // Using the decrease method with no parameters
        counter1.decrease();
        System.out.println("Counter1 after decrease(): " + counter1.value());

        // Using the decrease method with a parameter
        counter1.decrease(3);
        System.out.println("Counter1 after decrease(3): " + counter1.value());

        // Using the constructor that sets the start value to 0
        Counter counter2 = new Counter();
        System.out.println("Counter2 initial value: " + counter2.value());

        // Using the increase method with no parameters
        counter2.increase();
        System.out.println("Counter2 after increase(): " + counter2.value());

        // Using the decrease method with a parameter
        counter2.decrease(2);
        System.out.println("Counter2 after decrease(2): " + counter2.value());

        // Using the overloaded increase method with a negative parameter (should not change value)
        counter2.increase(-5);
        System.out.println("Counter2 after increase(-5): " + counter2.value());

        // Using the overloaded decrease method with a negative parameter (should not change value)
        counter2.decrease(-3);
        System.out.println("Counter2 after decrease(-3): " + counter2.value());
    }
}
