package be.vdab.jpfhfdst7;

public class Waarnemer {
    private int aantal;
    private double maxTemp;
    private double minTemp;
    private double somTemp;

    public int getAantal() {
        return aantal;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getSomTemp() {
        return somTemp;
    }

    public void getalIngeven(double temp){
        if (aantal == 0) {
            maxTemp = temp;
            minTemp = temp;
        }
        if (temp > maxTemp){
            maxTemp = temp;
        }
        if (temp < minTemp){
             minTemp = temp;
        }
        somTemp += temp;
        aantal++;
    }
}
