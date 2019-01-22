package com.pe.l1.designPatterns.singleton;

public class SingletonExamples {
	public static void main(String[] args) {
	}
}
// A non thread safe singleton
class NaiveSingleton {
	private static NaiveSingleton instance;

	private NaiveSingleton() {
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
			instance = new LazySingleton();
		}
		return instance;
	}
}