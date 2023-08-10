package car;

public class Car {

    int carId;
    String carNME;
    String carMake;
    int carYear;
    int carPrice;

    public Car() {
    }

    public Car(int carId, String carNME, String carMake, int carYear, int carPrice) {
        this.carId = carId;
        this.carNME = carNME;
        this.carMake = carMake;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarNME() {
        return carNME;
    }

    public String getCarMake() {
        return carMake;
    }

    public int getCarYear() {
        return carYear;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarNME(String carNME) {
        this.carNME = carNME;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carNME='" + carNME + '\'' +
                ", carMake='" + carMake + '\'' +
                ", carYear=" + carYear +
                ", carPrice=" + carPrice +
                '}';
    }
}
