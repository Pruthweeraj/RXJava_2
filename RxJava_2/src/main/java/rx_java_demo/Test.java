package rx_java_demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.genetics.OnePointCrossover;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.ConnectableObservable;

public class Test {

	static int a = 0;
	static int b = 10;
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

//		
//		//Error factory
//		Observable.error(new Exception("I want a Exception") ).subscribe(System.out::println ,Throwable::printStackTrace ,()->System.out.println("Emition Completrd"));
//		
//		
//		Observable.error(new Exception("I want one more Exception") ).subscribe(System.out::println ,e -> {
//			System.out.println("Thread.currentThread().getName() ::"+Thread.currentThread().getName());
//			System.out.println("Thread.currentThread().getPriority()) ::"+Thread.currentThread().getPriority());
//			System.out.println("Thread.currentThread().getThreadGroup() ::"+Thread.currentThread().getThreadGroup());
//			System.out.println("Thread.currentThread().getStackTrace() ::"+Thread.currentThread().getStackTrace());
//			System.out.println("e.printStackTrace()::");e.printStackTrace();
//			} ,()->System.out.println("Emition Completrd"));
//		
//		
		
		
//		//defer Factory
//		//defer factory will not create the Observable when it declared, It create a NEW observable ONLY when a Observer will subscribe that Observable the Observable when it is 
//        Observable<Integer> defertObservable = Observable.defer(() ->Observable.range(a , b));
//        defertObservable.subscribe(System.out::println);
//        System.out.println("--------------");
//        b = 15;
//        defertObservable.subscribe(System.out::println);
//		
//		
//		
		
		
		
//		//single
//		//Single  will only emites a SINGLE/ONE value through it's lifetime.
//		Observable.just("One","Two").first("default").subscribe(System.out::println);
//		
//		Single.just("x").subscribe((onComplet,onError)->System.out.println(onComplet +"" +onError));
//		
//		
//		//mayBe
//		//It will accept only ONE value or NOTHING , if it has nothing it will directly call the onComplet() method directly.
//		
//		
//		
//		//completable
//		Completable.fromRunnable(()->System.out.println("Called just before the OnComplet called")).subscribe(()->System.out.println("OnCompletAction called."));
//		
//		
//		
		
//		Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
//		Disposable disposable = observable.subscribe(System.out::println);
//		Sleep(5000);
//		disposable.dispose();
//		Sleep(5000);
//		
//		
		
//		
//		//RxOperaor
//		//filter(Predicate)
//		//filter operator Returns the Observable<T> according to the predicate condition.		
//		Observable<String> stringObservable = Observable.just("Alpha", "Beta", "Gamma", "Omega");
//		stringObservable.filter(s -> (s.length()>4)).subscribe(System.out::println);
	
		
//		//take , skip and first Operators
//		//take(x)
//		//take will emites only first 'x' numbers of value from n numbers of emitions.
//		Observable<String> stringObservable = Observable.just("aaa" ,"bbb" ,"ccc" ,"ddd" ,"eee");
//		stringObservable.take(2).subscribe(System.out::println);
//		
//		//skip(x)
//		//skip will skips the first x numbers of value and emites all rest emitions.
//		stringObservable.skip(3).subscribe(System.out::println);
//		
//		//first("default_value")
//		//first will emit only the first element from the Observable.
//		//And if the Observable don't have any element then it will emite the degault_value.
//		stringObservable.first("foo").subscribe(System.out::println);
//		
		
//		//takeWhile(predicate) and skipWhile(predicate) 
//		//takeWhile(predicate) will 'TAKE/emits' the value till the predicate returns "true" .
//		//,But when ever the predicate returns a "false" value ,from that time it will never check the predicate again and will starts 'SKIPING' from THAT element to rest ALL.
//		Observable<Integer> integerObservable = Observable.just(0,1,2,3,4,0,1,2,3,4);
//		integerObservable.takeWhile((i)->i<=2).subscribe(System.out::println);
//		System.out.println("--------------------------");
//		
//		//skipWhile(predicate) is the opposite of takeWhile(Predicate)
//		//skipWhile(predicate) will 'SKIP' the values till the predicate returns "true".
//		//,But when ever the predicate the predicate returns a "false" value ,from that time it will never checks the predicate again and will start 'TAKING/Emiting' from that value to rest ALL.
//		Observable<Integer> integerObservable2 = Observable.just(0,1,2,3,4,0,1,2,3,4);
//		integerObservable2.skipWhile(i -> i<=2).subscribe(System.out::println);
//		
		
		
//		//distinct()
//		Observable<String> stringObservable = Observable.just("Alpha", "Beta",  "Gamma", "Omega" ,"Alpha");
//		stringObservable.distinct().subscribe(System.out::println);// Alpha, Beta, Gamma, Omega.
//		System.out.println("--------------------------");
//		
//		//distinct(function)
//		stringObservable.distinct(String::length).subscribe(System.out::println); //Alpha, Beta.
//		System.out.println("--------------------------");
//		
//		//elemenAt(index)
//		stringObservable.elementAt(2).subscribe(System.out::println);//Gamma
//		System.out.println("--------------------------");
//		
		
		
		
		
		
		
		
		
	}
	
	
	public static void Sleep(int time) {
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("mainthread is sleeping for " + time);
		try {
			Thread.sleep(time);
		}catch(InterruptedException e){
			//System.out.println(e);
		}
		}
}
