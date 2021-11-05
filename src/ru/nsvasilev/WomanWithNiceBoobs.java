package ru.nsvasilev;

public class WomanWithNiceBoobs {
    private String family;
    private double age;
    private double sizeOfTheBoobs;
    private int countOfTheGuysBeforeYour;
    private boolean niceAss;

    WomanWithNiceBoobs(String f, double a, double s, int countOfTheGuysBeforeYour, boolean niceAss){
        family = f;
        age = a;
        sizeOfTheBoobs = s;
        this.countOfTheGuysBeforeYour = countOfTheGuysBeforeYour;
        this.niceAss = niceAss;
    }

    @Override
    public String toString() {
        return "WomanWithNiceBoobs{" +
                "family='" + family + '\'' +
                ", age=" + age +
                ", sizeOfTheBoobs=" + sizeOfTheBoobs +
                ", countOfTheGuysBeforeYour=" + countOfTheGuysBeforeYour +
                ", niceAss=" + niceAss +
                '}';
    }

    public boolean pumpAss(int squats){
        if(squats <= 200){
            System.out.println("Твоя жопа - хуйня, надо еще");
            this.niceAss = false;
            return false;
        } else {
            this.niceAss = true;
            System.out.println("your Ass is a big Bank");
            return true;
        }
    }



    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSizeOfTheBoobs() {
        return sizeOfTheBoobs;
    }

    public void setSizeOfTheBoobs(double sizeOfTheBoobs) {
        this.sizeOfTheBoobs = sizeOfTheBoobs;
    }

    public int getCountOfTheGuysBeforeYour() {
        return countOfTheGuysBeforeYour;
    }

    public void setCountOfTheGuysBeforeYour(int countOfTheGuysBeforeYour) {
        this.countOfTheGuysBeforeYour = countOfTheGuysBeforeYour;
    }

}
