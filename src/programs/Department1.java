package programs;
public class Department1 extends Department{
    private final int size;

    public Department1(int size) {
        this.size = size;
    }

    @Override
    public int getDepartmentSize() {
        return size;
    }
}
