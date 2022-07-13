package simple_example;

import java.util.Optional;

class MySingleton {
	static private MySingleton instance;

	private MySingleton() {
	}

	static MySingleton getInstance() {
		return Optional.ofNullable(instance).orElseGet(() -> {
			instance = new MySingleton();
			return instance;
		});
	}
}
