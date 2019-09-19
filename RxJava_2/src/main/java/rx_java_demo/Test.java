package rx_java_demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class Test {

	public static void main(String[] args) {
		
//		Observable<String> observable = Observable.just("First", "Second", "third");
//		Observer<String> observer = new Observer<String>() {
//
//			@Override
//			public void onCompleted() {
//				// TODO Auto-generated method stub
//				System.out.println("All Opration are completed");
//			}
//
//			@Override
//			public void onError(Throwable e) {
//				// TODO Auto-generated method stub
//				System.out.println(e);
//			}
//
//			@Override
//			public void onNext(String element) {
//				// TODO Auto-generated method stub
//				System.out.println(element);
//			}
//		};
//	observable.subscribe(observer);
//	
//	
//	Observable<String> observale2 = Observable.create(emitter -> {
//		try {
//			emitter.onNext("First-sort");
//			emitter.onNext("Second-sort");
//			emitter.onNext("Third-sort");
//			emitter.onNext("Fourth-sort");
//			emitter.onCompleted();
//	
//		} catch (Exception e) {
//			emitter.onError(e);
//		}	});
//	
//	observale2.subscribe(observer);
//	
//	
//	Observable<String> observable3 = Observable.just("PR", "PUPA");
//	observable3.subscribe(System.out::println, Throwable::printStackTrace , ()-> System.out.println("All done :)"));
//	
//	//Cold Observable
//	Observable<String> observable4 = Observable.just("First", "Second" ,"third");
//	observable4.subscribe(e -> System.out.println("Observer1" +e));
//	System.out.println("---------------");
//	observable4.subscribe(e -> System.out.println("Observer2" +e));
//	
//	//Iterable
//	List<String> names= Arrays.asList("Pr" , "Panda" );
//	Observable<String> observable5 = Observable.from(names);
//	observable5.subscribe(System.out::println);
//	}
		
		
		
		
		
		
		
	//Day-2:
//		Observable<String> observable = Observable.just("Pr", "Pupa");
//		observable.subscribe(str -> System.out.println(str + "-from emmter."));
//
//		System.out.println("-----------------");
//
//		List<String> color = Arrays.asList("Red", "Black", "Yellow", "Pink", "White");
//		
//		//Cold Observable.
//		Observable<String> colorColdObservable = Observable.fromIterable(color);
//
//		//		colorObservable.subscribe(c -> System.out.println("emiting --" + c), e -> System.out.println("Error--" + e),
//		//				() -> System.out.println("emition completed"));
//	
//		colorColdObservable.subscribe(c -> System.out.println("ColdObrerver -1 emiting --" + c));
//		colorColdObservable.subscribe(c -> System.out.println("ColdObrerver -2 emiting --" + c));
//	
//		System.out.println("------------------------");
//		
//		//Hot Observable or connectibleObservable
//		ConnectableObservable<String> colorConnectableObservable = Observable.fromIterable(color).publish();
//		
//		colorConnectableObservable.subscribe(c -> System.out.println("HotObserver -1 emiting--"+ c));
//		colorConnectableObservable.subscribe(c -> System.out.println("HotObserver -2 emiting--"+ c));
//		colorConnectableObservable.connect();
//		
//		colorConnectableObservable.subscribe(c -> System.out.println("HotObserver -3 emiting--"+ c));
//		colorConnectableObservable.connect();
//		
//		
//		//Range and Interval factories
//		
//		//Interval factory
//		//interval factory method will return the sequence of numbers starting from zero in every given time interval till the main thread stops.
//		Observable.interval(300, TimeUnit.MILLISECONDS).subscribe(val -> {
//			System.out.println("Thread.currentThread().getName() ::"+Thread.currentThread().getName());
//			System.out.println("Thread.currentThread().getPriority()) ::"+Thread.currentThread().getPriority());
//			System.out.println("Thread.currentThread().getThreadGroup() ::"+Thread.currentThread().getThreadGroup());
//			System.out.println("Thread.currentThread().getStackTrace() ::"+Thread.currentThread().getStackTrace());
//			System.out.println("interval value" +val);
//		});
//		
//		try {
//			Thread.sleep(3000);
//		}catch(InterruptedException e){
//			System.out.println(e);
//		}
//		
//		System.out.println();
//		System.out.println("---------");
//		
//		//Range factory
//		//range factory will emit from the starting value to the count value, it will run till the range is not completed.
//		//will print 3 to 10;
//		Observable.range(3, 7).subscribe(System.out::println);
//		
//		
//		//empty , never factories
//		//empty factory will emit nothing and directly calls the onComplet() method of observer
//		//but never factory will not emit anything and never call the onComplet() method of observer so it will go to waiting stage for for ever.
//		Observable.empty().subscribe(System.out::println, System.out::println,
//				() -> System.out.println("emition Completed(empty() factory)"));		
//		
//		//never factory
//		Observable.never().subscribe(System.out::println, System.out::println,
//				() -> System.out.println("emition Completed(never() factory)"));
//		
//		
//		

		
		//Error factory
		Observable.error(new Exception("I want a Exception") ).subscribe(System.out::println ,Throwable::printStackTrace ,()->System.out.println("Emition Completrd"));
		
		
		Observable.error(new Exception("I want one more Exception") ).subscribe(System.out::println ,e -> {
			System.out.println("Thread.currentThread().getName() ::"+Thread.currentThread().getName());
			System.out.println("Thread.currentThread().getPriority()) ::"+Thread.currentThread().getPriority());
			System.out.println("Thread.currentThread().getThreadGroup() ::"+Thread.currentThread().getThreadGroup());
			System.out.println("Thread.currentThread().getStackTrace() ::"+Thread.currentThread().getStackTrace());
			System.out.println("e.printStackTrace()::");e.printStackTrace();
			} ,()->System.out.println("Emition Completrd"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("mainthread is sleeping");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			//System.out.println(e);
		}
		
		
		
	}
}
