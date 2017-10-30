package design_patterns_2;


/**
 * ¥DÃD
 * @author hrne
 *
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
	int a=0;
}
