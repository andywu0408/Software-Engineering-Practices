package hw1;

public interface Subject {
	
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void Notify(String src, String dest);
	
}