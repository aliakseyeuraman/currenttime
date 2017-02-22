package Worker;

/**
 * Parent class on other worker
 */
public class Worker {
    protected double salary;
    protected double efficiency;
    protected String qualification;

    /**
     * Method for get salary of worker
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     *Method for get efficiency of worker
     * @return efficiency
     */
    public double getEfficiency() {
        return efficiency;
    }
}
