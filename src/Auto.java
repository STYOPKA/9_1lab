public class Auto {
    private String firm;                //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed;               // закрытый член класса, содержащий максимальную скорость
    private int gosNumber;              // гос номер

    public void setFirm(String firma){  //открытая функция (метод класса) для задания
        firm = firma;                   //значения фирмы автомобиля
    }

    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed = speed;                 //значения максимальной скорости автомобиля
    }

    public void setGosNumber(int number) { // открытая функция для задания значения гос номера
        gosNumber = number;
    }

    public int getMaxSpeed(){           //открытая функция (метод класса) для вывода значения
        return maxSpeed;                //максимальной скорости
    }

    public String getFirm(){            //открытая функция (метод класса) для вывода значения
        return firm;                    //заданной фирмы
    }

    public int getGosNumber() {         // открытая функция для вывода значения гос номера
        return gosNumber;
    }

    public Auto(){                      // конструктор класса (без параметров)
        firm = "Без названия";
        maxSpeed = 0;
    }
    public Auto(String firma, int speed, int gosNum){ //конструктор класса (с параметрами)
        firm = firma;
        maxSpeed = speed;
        gosNumber = gosNum;
    }
}
