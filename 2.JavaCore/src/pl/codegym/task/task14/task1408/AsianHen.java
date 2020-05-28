package pl.codegym.task.task14.task1408;

public class AsianHen extends Hen {

    @Override
    public int getMonthlyEggCount() {
        return 55;
    }
    @Override
    public String getDescription(){

        String s = super.getDescription();
        s += " Pochodzę z " + Continent.ASIA + ". Znoszę " + this.getMonthlyEggCount() + " jaj na miesiąc";
        return s;    }
}
