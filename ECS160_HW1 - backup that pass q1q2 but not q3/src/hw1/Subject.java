package hw1;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	private String name;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Subject(String name) {
		this.name = name;
	}
	public void attach(Observer observer) {
		this.observers.add(observer);
		FileOutputter.write(observer.name + " is now watching " + this.name + "\n");
	}
	public void detach(Observer observer) {
		this.observers.remove(observer);
		FileOutputter.write(observer.name + " is no longer watching " + this.name + "\n");
	}
	public void Notify() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	
}