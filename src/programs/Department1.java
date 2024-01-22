package programs;
public class Department1 extends Department{
    private int size;

    public Department1(int size) {
        this.size = size;
    }

    @Override
    public int getDepartmentSize() {
        return size;
    }
}
