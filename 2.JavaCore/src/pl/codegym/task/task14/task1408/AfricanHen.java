package pl.codegym.task.task14.task1408;

public class AfricanHen extends Hen {

    @Override
    public int getMonthlyEggCount() {
        return 100;
    }

    @Override
    public String getDescription() {

        String s = super.getDescription();
        s += " Pochodzę z " + Continent.AFRICA + ". Znoszę " + this.getMonthlyEggCount() + " jaj na miesiąc";
        return s;    }
}
