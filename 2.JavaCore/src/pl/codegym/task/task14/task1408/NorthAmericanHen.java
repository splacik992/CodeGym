package pl.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {

    @Override
    public int getMonthlyEggCount() {
        return 25;
    }



    @Override
    public String getDescription() {
        String s = super.getDescription();
        s += " Pochodzę z " + Continent.NORTHAMERICA + ". Znoszę " + this.getMonthlyEggCount() + " jaj na miesiąc";
        System.out.println(s);
        return s;
    }
}
