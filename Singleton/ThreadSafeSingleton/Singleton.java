// Description: Singleton class with double checked locking.
// This implementation is thread safe and provides lazy initialization.

public class Singleton {
		// Private constructor prevents instantiation from other classes
		private static volatile Singleton instance = null;
		private Singleton() {
				// Exists only to defeat instantiation.
				if(instance != null) {
						throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
				}
		}
		public static Singleton getInstance() {
				if(instance == null) {
						synchronized(Singleton.class) {
								if(instance == null) {
										instance = new Singleton();
								}
						}
				}
				return instance;
		}
}
