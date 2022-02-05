
public class DataSetGen<T> {
	
	private double sum;
	private T maximum;
	private int count;

	public void DataSet()
	{
		sum = 0;
		count = 0;
		maximum = null;
	}

	public void add(T t) {
		// TODO Auto-generated method stub
		sum = sum + ((Measurable) t).getMeasure();
	    if (count == 0 || ((Measurable) maximum).getMeasure() < ((Measurable) t).getMeasure())
	    maximum = t;
	    count++;
	}
	
	public double getAverage() {
		// TODO Auto-generated method stub
		if (count == 0)
			return 0;
		else
			return sum / count;
	}
	
	public T getMaximum() {
		// TODO Auto-generated method stub
		return maximum;
	}
}
