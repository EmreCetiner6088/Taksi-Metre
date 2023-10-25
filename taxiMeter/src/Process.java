public class Process {
    double first = 20;
    double ahour = 2.2;

    double cost;
    public double Calculate(double kilometer) {
        kilometer = this.ahour * kilometer;
        this.cost = kilometer + first;
        return this.cost;
    }

}
