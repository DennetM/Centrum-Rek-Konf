package filter;

import java.util.List;
import java.util.Properties;

public interface Filter<T> {

	public List<T> filter(List<T> inputList, Properties var);
}
