package com.pe.l1.designPatterns.singleton;

public class SingletonExamples {
	public static void main(String[] args) {
		
		NaiveSingleton.getInstance();
		EagerSingleton.getInstance();
		LazySingleton.getInstance();
	}
}
// A non thread safe singleton
class NaiveSingleton {
	private static NaiveSingleton instance;
	
	//IDIOM:Item-0480: Add private constructor to utility classes
	private NaiveSingleton() {
		System.out.println("Example1 to demonstrate how singleton can be accessed");
		System.out.println("---Inside NaiveSingleton Constructor---\n");
	}
	public static NaiveSingleton getInstance() {
		if (instance == null) {
			instance = new NaiveSingleton();
		}
		return instance;
	}
}

// thread safe non-lazy singleton
class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		
		System.out.println("Example2 to demonstrate Singleon using static initialization in Java");
		System.out.println("---Inside EagerSingleton Constructor---\n");
		
	}
	public static EagerSingleton getInstance() {
		return instance;
	}
}

// thread safe lazy singleton, only created when needed
class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			System.out.println("Example3 to demonstrate thread safe lazy singleton using synchronized");
			System.out.println("---Inside LazySingleton Constructor---\n");
			instance = new LazySingleton();
		}
		return instance;
	}
}