package rx_java_demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.schedulers.Schedulers;

public class Test {

	static int a = 0;
	static int b = 10;
	/**
	 * @param args
	 */
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
		
		
//		//Observable map(function)
//		//map(function) will take a function and it execute the function on every emition and returns a Observable. 
//		Observable<Long> sequenceObservable = Observable.interval(1, TimeUnit.SECONDS);
//		sequenceObservable.map(i -> i+1 ).subscribe(System.out::println);
//		pr2learn
//		
//		Observable<String> stringObservable = Observable.just("Hi", "Hello");
//		stringObservable.map(i -> i.length()).subscribe(System.out::println);
//		Sleep(10000);
//		
		
//		
//		//Observable cast(foo.class)
//		//cast(foo.class) is needed when you wany to change all the emition from oneType to otherType.
//		Observable<String> stringObservable = Observable.just("Hi", "Hello");
//		stringObservable.cast(Object.class).subscribe(System.out::println);
//		
//		
//		//startWith()
//		System.out.println("------------------");
//		stringObservable.startWith("Here your Emition Starts:: ").subscribe(System.out::println);
//		
		
//		
//		//defaultIfEmpty() and switchIfEmpty()
//		Observable<String> stringObservable = Observable.just("Hi", "Hello");
//		Observable<String> emptyObservable = Observable.empty();
//		
//		//defaultIfEmpty(string)
//		//If the Observable is empty then it emit the default value ,else it will emit the observable values.
//		emptyObservable.defaultIfEmpty("NoEmitions..Printing DefaultValue!!").subscribe(System.out::println);
//		
//		//switchIfEmpty(ObservableSource)
//		//If the Observable is empty then it will swith to the other given ObservableSource and starts emiting ObservableSource's values.else will emit the observable valus.
//		System.out.println("-----------------------");
//		emptyObservable.switchIfEmpty(stringObservable).subscribe(System.out::println);
//		
//		
		
		
//		//delay()
//		Observable<Integer> integerObservable  = Observable.just(1, 2, 4, 3, 6, 4, 1, 41, 54, 21);
//		
//		integerObservable.delay(5, TimeUnit.SECONDS).subscribe(System.out::println);
//		Sleep(10000);
//		
		
//		//sorted(Comparator c)
//		Observable<Integer> integerObservable  = Observable.just(1, 2, 4, 3, 6, 4, 1, 41, 54, 21);
//		integerObservable.sorted().subscribe(System.out::println);
//		System.out.println("-------------------");
//		integerObservable.sorted(Comparator.reverseOrder()).subscribe(System.out::println);
//		
		
		
//		//repeat() 
//		Observable<Integer> integerObservable  = Observable.just(1, 2, 4, 3, 6, 4, 1, 41, 54, 21);
//		integerObservable.repeat(2).subscribe(System.out::println);
//		
//		
//		// total scan(total , currentElement) and  total reduce(total , currentElement)
//		Observable<Integer> integerObservable2  = Observable.just(1, 2,3,4,5);
//		// total scan(total , currentElement)
//		//It returns the observable after each step.
//		integerObservable2.scan((total , currentElement)->total + currentElement).subscribe(System.out::println);
//		System.out.println("---------------------");
//		//total reduce(total , currentElement)
//		//It returns the maybe observable after all the step completed.
//		integerObservable2.reduce((total , currentElement) -> total+currentElement).subscribe(System.out::println);
//		
//		
//		
//		Observable<String> ob = Observable.just("a", "b", "c");
//		ob.toList().subscribe(System.out::println);
//	
			
		
		//all() ,any() , count() , 	contains()
		//Boolean all(predicate) ==> will returns true iff each emition is true for the predicate. and if it applyed in an EmptyObservable then it will return true also.
		//Boolean any(predicate) ==> will returns true if any of the emition is true for the predicate.
		//Integer count() ==> will return the number of emitions in the applyed observable have.
		//Boolean contains(String) ==> will returns true iff the Observable contains the String.
		
		
//	Collection	
//		//toList() ==>converts the Observable to a Single<List<T>> type.
//		//toShortedList(Comparator c) ==>converts to sortedList Observable.
//		//toMap(keyFunction) ==> convert to a map and assign the key as the keyFunction
//		//toMultiMap(keyFunction) ==> convert to a map with duplicate keys.
//		Observable<String> ob = Observable.just("aa", "bb", "cc" ,"abc");
//		ob.toList().subscribe(System.out::println);
//		ob.toSortedList().subscribe(System.out::println);
//		ob.toMap(String::length).subscribe(System.out::println);
//		ob.toMultimap(String::length).subscribe(System.out::println);
//		//				key			,		value		,	Type
//		ob.toMultimap(String::length ,i -> i.charAt(0) , HashMap::new).subscribe(System.out::println);
//		
//		//collect()
//		//creating a HashMap And adding some value
//		ob.collect(HashSet::new , HashSet::add).subscribe(System.out::println);
//		ob.collect(ArrayList::new, ArrayList::add).subscribe(System.out::println);
//		
	
		
//	Error	
//		//onErrorReturnItem
//		Observable<Integer> ob = Observable.just(1, 2,3,4,0,6,7,8);
//		ob.map(i -> 4/i).onErrorReturnItem(-1).subscribe(System.out::println);
//		System.out.println("----------------");
//		//onErrorResumeNext
//		ob.map(i -> 4/i).onErrorResumeNext(Observable.just(20,21)).subscribe(System.out::println);
//		
//		
//		
//		//retry()
//		ob.map(i -> 4/i).retry(2).subscribe(System.out::println);	
//		
		
//		//ActionOperators
//		Observable<Integer> ob = Observable.just(1, 2,3,4,0,6,7,8);
//		ob.doOnNext((e)->System.out.println("Next element is comming"))
//	       .doOnError(e->System.out.println("error ocured"))
//	       .doOnComplete(()->System.out.println("emition is completed"))
//	       .subscribe(System.out::println);
//		

//		//merge() and concat() //concat() is used when order is mattered.
//		Observable<String> ob1 = Observable.just("a1", "a2");
//		Observable<String> ob2 = Observable.just("b1", "b2");
//		Observable<String> ob3 = Observable.just("c1", "c2");
//		Observable<String> ob4 = Observable.just("d1", "d2");
//		Observable<String> ob5 = Observable.just("e1", "e2");
//		Observable<String> ob6 = Observable.just("f1", "f2");
//		
//		ob1.mergeWith(ob2).subscribe(System.out::println);
//		System.out.println("------------------");
//		ob1.merge(ob2,ob3,ob4,ob5).subscribe(System.out::println);//mearge upto 4 observable with current Observable.
//		System.out.println("------------------");
//		ob1.merge(Arrays.asList(ob2 ,ob3,ob4,ob5,ob6)).subscribe(System.out::println);//can add any no. of Observable.
//		System.out.println("------------------");
//		Observable.merge(Arrays.asList(ob2,ob3)).subscribe(System.out::println);//Accessing in static way.
//		System.out.println("------------------");
//		Observable.concat(ob2,ob3).subscribe(System.out::println);
//		
		
//		//flatMap()
//		//map() will return a single observable where as flatMap() will return multiple Observable ,i.e for each emition one observable.
//		Observable<String> ob = Observable.just("Hi", "Pr" , "Welcome" , "to" , "Reactive" ,"Java");
//		ob.flatMap(s->Observable.fromArray(s.split(""))).subscribe(System.out::println);
//		
//		
		
//		//Ambiguous
//		Observable<Long> ob1 = Observable.interval(1, TimeUnit.SECONDS);
//		Observable<Long> ob2= Observable.interval(300, TimeUnit.MILLISECONDS);
//		//ambArray() ==> will chose the that Observable Source which has less delay time.
//		Observable.ambArray(ob1,ob2).subscribe(System.out::println);
//		Sleep(5000);
//		
		
//		//zip()
//		//zip(function(source1,source2)) ==> will emit one -one from each Observable Source. IF one-one match not found it will skip those emitions.
//		Observable<String> ob1 = Observable.just("a1" ,"a2" ,"a3" ,"a4");
//		Observable<String> ob2 = Observable.just("b1" ,"b2" );
//		Observable.zip(ob1,ob2, (source1 , source2) -> source1+"--"+source2).subscribe(System.out::println);
//		
//		
//		
//		
//		//zip will preservers the ORDER also , if it get the first value form oneSource then it wait for the emition of first value from the otherSource.
//		//after gatting that value only it will continue to next emition.
//		Observable<Long> ob1 = Observable.interval(1, TimeUnit.SECONDS);
//		Observable<Long> ob2= Observable.interval(300, TimeUnit.MILLISECONDS);
//		Observable.zip(ob1,ob2 , (s1,s2)->s1+"--"+s2).subscribe(System.out::println);
//		Sleep(1000000);
//		
		
//		//combineLatest() ==>it will wait for the very first emition of both for pairing , after that any Source will never wait for any one ,
//		//which Source will get a emition first ,that source will update it's latest value and form a pair with the otherSource's old value.
//		//That's why it never wait for preservation of order and act faster than zip.
//		Observable<Long> ob1 = Observable.interval(10, TimeUnit.SECONDS);
//		Observable<Long> ob2= Observable.interval(300, TimeUnit.MILLISECONDS);
//		Observable.combineLatest(ob1,ob2, (s1,s2)-> s1+"--"+s2).subscribe(System.out::println);
//		Sleep(10000);
//		
		
	
		
//		//source1.withLatestFrom(source2 , combiner)
//		Observable<Long> ob1 = Observable.interval(300, TimeUnit.MILLISECONDS);
//		Observable<Long> ob2= Observable.interval(10, TimeUnit.SECONDS);
//		//here it will wait for the very first pair of both then it will only wait for ob1 , when ob1 get a emition , this method 
//		//will create the pair by taking the latest value from the ob2(Always waitin for ob1 ,never wait for ob2 again).
//		ob1.withLatestFrom(ob2, (s1,s2)-> s1+"--"+s2).subscribe(System.out::println);
//		Sleep(30000);																	
																						
		
		
//		//groupBy
//		Observable<String> color = Observable.just("blue", "Green" ,"White" ,"Yellow" ,"pink"  , "black" ,"parpul");
//		Observable<GroupedObservable<Character, String>> groups = color.groupBy(s -> s.charAt(0));
//		groups.flatMapSingle(g -> g.reduce((x,y) -> x.equals("") ? y :x+","+y ).map(s -> g.getKey() +":"+s).toSingle())
//				.subscribe(System.out::println);
//		
//		
		
		
//		
//		//blockingSubscribe //USED IN TESTING ONLY.
//		//it will block the other Thread till the emition is completed.
//		Observable<Long> ob1 = Observable.interval(1, TimeUnit.SECONDS).take(10);
//		ob1.blockingSubscribe(System.out::println , e->System.out.println(e), ()->System.out.println("Ob1 Completed."));
//		
//		Observable<Long> ob2 = Observable.interval(500, TimeUnit.MILLISECONDS).take(10);
//		ob2.blockingSubscribe(System.out::println , e->System.out.println(e), ()->System.out.println("Ob2 Completed."));
//		
		
//		//concurrency and parallelization
//		//computation Scheduler
//		//when we subscribe then the observer will run on RxComputationThreadPool  instead of main Thread. And we can use multiThreading features.  
//		Observable<String> color = Observable.just("blue", "Green" ,"White" ,"Yellow" ,"pink"  , "black" ,"parpul").subscribeOn(Schedulers.computation());
//		color.subscribe((e) -> System.out.println("Thread::"+Thread.currentThread().getName()+"::observer_1::"+e +"LocalTime:"+LocalDateTime.now()));//Thread::RxComputationThreadPool-1::observer_1::blueLocalTime:2019-09-22T17:02:06.582910300
//		color.subscribe((e) -> System.out.println("Thread::"+Thread.currentThread().getName()+"::observer_2::"+e +"LocalTime:"+LocalDateTime.now()));//Thread::RxComputationThreadPool-2::observer_2::blueLocalTime:2019-09-22T17:02:06.583907800
//		
//		//observeOn()
//		//if we want to change the execution of the observable to any other Thread in later point of time , then we can achieve that by using observeOn()
//		color.observeOn(Schedulers.io())
//				.subscribe((e) -> System.out.println("Thread::"+Thread.currentThread().getName()+"::observer_3::"+e +"LocalTime:"+LocalDateTime.now()));//Thread::RxCachedThreadScheduler-1::observer_3::blueLocalTime:2019-09-22T17:03:31.965995900
//		
//		//
//		//We can create our own ExecuterService  and run the observer on that.
//		ExecutorService service = Executors.newFixedThreadPool(10);
//		Scheduler myScheduler = Schedulers.from(service);
//		color.observeOn(myScheduler)
//			.subscribe((e) -> System.out.println("Thread::"+Thread.currentThread().getName()+"::observer_4::"+e +"LocalTime:"+LocalDateTime.now()));//Thread::pool-2-thread-1::observer_4::blueLocalTime:2019-09-22T17:12:21.100409500
//		
//		Sleep(10000);
//		
//		
		
		
		
//		Starting and Stopping schedulers
//
//		you can manually start and stop schedulers using two methods:
//
//		you can stop one scheduler by calling its method shutdown()
//
//		you can stop all schedulers at once using Schedulers.shutdown()
//
//		if you want to restart these schedulers again you can use start () method
//
//		in normal cases you should not do that manually until you really need to do that ( EX: server side applications)
//		
		
		
		
//		//Flowable
//		Flowable<Integer> flowable = Flowable.range(0, 5000000);
//		flowable.subscribeOn(Schedulers.computation())
//				.doOnNext(s-> System.out.println("Emition no. "+s + " is comming:"))
//				.subscribe(new Subscriber<Integer>() {
//
//					@Override
//					public void onSubscribe(Subscription s) {
//						// TODO Auto-generated method stub
//						s.request(Long.MAX_VALUE);
//					}
//
//					@Override
//					public void onNext(Integer t) {
//						// TODO Auto-generated method stub
//						Sleep(300);
//						System.out.println(t);
//					}
//
//					@Override
//					public void onError(Throwable t) {
//						// TODO Auto-generated method stub
//						
//					}
//
//					@Override
//					public void onComplete() {
//						// TODO Auto-generated method stub
//						
//					}
//				});
//		
//		
//		Sleep(10000);
//		
		
//		//BackpressureStrategy
//		Flowable<String> flowable = Flowable.create(source ->{
//														source.onNext("Black");	
//														source.onNext("white");}
//																, BackpressureStrategy.BUFFER);
//		
//		flowable.subscribe(System.out::println);
//		
		
//		
//		To convert a Flowable into an observable you can use toObservable method
//
//		The opposit conversion works also the same way, except that when you convert from an observable to a flowable you have to specify the Backpressure Strategy this way:
//
//
//
//		source.toFlowable(BackpressureStrategy.BUFFER);
//
//		Note: the buffer Backpressure Strategy will cache unhandled emissions in an unbounded queue which may cause a StackOverFlow Exception in case the queue is bigger than what the memory can take.
//
//		If you know that the backpressure operation is heavy, then it is better to use Flowable from the beginning, use toFlowable only if the backpressure is not heavy or if you really need to.
//		
//		
		
		
		//ObservableTrabsformer ==> used to reduce the duplicate code
			//Observable.just("asd","asdded" ,"adiue" ,"sdh" ,"sa").map(s -> s.length()).filter(l -> l<3).subscribe(System.out::println);
			//Observable.just("asdsdsd","aefweasdded" ,"ue" ,"dh" ,"swefa").map(s -> s.length()).filter(l -> l<3).subscribe(System.out::println);
			//we can replace these above to ObservableTransformer
		Observable.just("asd","asdded" ,"adiue" ,"sdh" ,"sa").compose(stringToNumber()).subscribe(System.out::println);//compose() will execute the duplicate logic and return it.
		Observable.just("asdsdsd","aefweasdded" ,"ue" ,"dh" ,"swefa").compose(stringToNumber()).subscribe(System.out::println);
	
		

		
	
		
	}
	
	//finding String length grater than 2.
	public static ObservableTransformer<String, Integer> stringToNumber(){
		
		//As it is a FUNCTIONAL Interface we also can use lambdas directly.
		// return myObservable -> myObservable..map(s -> s.length()).filter(l -> l<3);
		return new ObservableTransformer<String, Integer>() {

			@Override
			public ObservableSource<Integer> apply(Observable<String> myObservable) {
				// TODO Auto-generated method stub
				return myObservable.map(s -> s.length()).filter(l -> l>3);
			}
		};
		
		
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
