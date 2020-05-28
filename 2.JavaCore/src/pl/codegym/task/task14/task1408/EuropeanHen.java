package pl.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {

    @Override
    public int getMonthlyEggCount() {
        return 40;
    }
    @Override
    public String getDescription(){

        String s = super.getDescription();
        s += " Pochodzę z " + Continent.EUROPE + ". Znoszę " + this.getMonthlyEggCount() + " jaj na miesiąc";
        return s;    }
}
