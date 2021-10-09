package builder;

public interface State {
    public void lock();
	public void unlock();
	public void getIn();
	public void getOut();
	public void open();
	public void close();
	public void repair();

}
