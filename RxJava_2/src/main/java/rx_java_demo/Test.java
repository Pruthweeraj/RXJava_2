package rx_java_demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class Test {

	public static void main(String[] args) {

		Observable<String> observable = Observable.just("Pr", "Pupa");
		observable.subscribe(str -> System.out.println(str + "-from emmter."));

		System.out.println("-----------------");

		List<String> color = Arrays.asList("Red", "Black", "Yellow", "Pink", "White");
		
		//Cold Observable.
		Observable<String> colorColdObservable = Observable.fromIterable(color);

		//		colorObservable.subscribe(c -> System.out.println("emiting --" + c), e -> System.out.println("Error--" + e),
		//				() -> System.out.println("emition completed"));
	
		colorColdObservable.subscribe(c -> System.out.println("ColdObrerver -1 emiting --" + c));
		colorColdObservable.subscribe(c -> System.out.println("ColdObrerver -2 emiting --" + c));
	
		System.out.println("------------------------");
		
		//Hot Observable or connectibleObservable
		ConnectableObservable<String> colorConnectableObservable = Observable.fromIterable(color).publish();
		
		colorConnectableObservable.subscribe(c -> System.out.println("HotObserver -1 emiting--"+ c));
		colorConnectableObservable.subscribe(c -> System.out.println("HotObserver -2 emiting--"+ c));
		colorConnectableObservable.connect();
		
		colorConnectableObservable.subscribe(c -> System.out.println("HotObserver -3 emiting--"+ c));
		colorConnectableObservable.connect();
		
		
		//Range and Interval factories
		
		//Interval factory
		//interval factory method will return the sequence of numbers starting from zero in every given time interval till the main thread stops.
		Observable.interval(300, TimeUnit.MILLISECONDS).subscribe(val -> System.out.println("interval value" +val));
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("---------");
		
		//Range factory
		//range factory will emit from the starting value to the count value, it will run till the range is not completed.
		//will print 3 to 10;
		Observable.range(3, 7).subscribe(System.out::println);
		
		
		//empty , never factories
		//empty factory will emit nothing and directly calls the onComplet() method of observer
		//but never factory will not emit anything and never call the onComplet() method of observer so it will go to waiting stage for for ever.
		Observable.empty().subscribe(System.out::println, System.out::println,
				() -> System.out.println("emition Completed(empty() factory)"));		
		
		//never factory
		Observable.never().subscribe(System.out::println, System.out::println,
				() -> System.out.println("emition Completed(never() factory)"));
		
		
		
		System.out.println("mainthread is sleeping");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			//System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}