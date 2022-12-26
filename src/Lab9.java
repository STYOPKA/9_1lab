public class Lab9 {

    // Добавить к гаражу возможность удаления из него машины,
    // а к классу Auto добавить поле с гос. номером.

    public static void main(String[] args) {
        // протестируем новые добавленные методы
        GarageCar myGarage = new GarageCar(); //создаем новый гараж

        Car myCar1 = new Car("Ford", 200, 22898, "Mustang",2,false); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж

        myGarage.addCar(new Car("LADA", 140, 228790,  "Kalina", 4, false));//добавляем еще одну машину

        Truck myTruck = new Truck("Dove",160, 298908, "DTS",700,true);//создаем грузовик
        myGarage.addCar(myTruck); //добавляем его в гараж


        myGarage.printGarage(); //выводи на экран содержимое гаража
        if (myGarage.findCar(myTruck)) { //ищем грузовик
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }


        // удалим грузовик из гаража и попробуем найти
        myGarage.deleteCar(myTruck);
        if (myGarage.findCar(myTruck)) { //ищем грузовик
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

    }
}
