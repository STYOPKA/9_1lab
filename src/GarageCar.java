import java.util.ArrayList;

public class GarageCar {
    private ArrayList<Auto> masCar = new ArrayList<>();     //массив с машинами
    public void addCar(Auto m){                             //метод для добавления машины в гараж
        masCar.add(m);
    }

    public void deleteCar(Auto m) {     // удаление объекта машины из гаража
        masCar.remove(m);
    }

    public void deleteCar(int i) {      // удаление машины из гаража по индексу
        masCar.remove(i);
    }

    public GarageCar () { }

    public Boolean findCar(Auto m){         //для выяснения – есть ли машина m в гараже
        return masCar.contains(m);
    }

    public GarageCar(ArrayList< Auto> n){  //конструктор для внесения существующего списка машин в гараж
        masCar = n;
    }

    public void printGarage() {            //для вывода на экран списка машин в гараже
        System.out.println("В гараже: ");
        for (Auto a:masCar){
            System.out.println("\t"+a.toString());
        }
    }

}
