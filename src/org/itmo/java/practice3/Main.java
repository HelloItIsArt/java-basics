package org.itmo.java.practice3;

public class Main {
    public static void main(String[] args) {
        /* item 1 */
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        System.out.println("\n *********** \n");

        /* item 2 */
        SomeCar car1 = new SomeCar(ColorRange.BLACK, "KIA", 1550);
        System.out.println(car1.showCarFeatures());
        SomeCar car2 = new SomeCar(ColorRange.RED, "Skoda", 1200);
        System.out.println(car2.showCarFeatures());

        SomeCar car3 = new SomeCar(ColorRange.RED, 1200);
        System.out.println(car3.showCarFeatures());

        System.out.println("\n *********** \n");

        /* item 3 */
        House house1 = new House();
        house1.valueSetter();
        System.out.println(house1.valuesOfHouse());
        System.out.println(house1.houseAge());

        System.out.println();

        House house2 = new House();
        house2.valueSetter();
        System.out.println(house2.valuesOfHouse());
        System.out.println(house2.houseAge());

        System.out.println("\n *********** \n");

        /* item 4 */
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(50, "willow");
        Tree tree3 = new Tree(30, true, "Pine");

        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}
