
void main(String[] args) {
	if (args.length == 0) {
		System.out.println("Hello Dead Duck!");
	} else {
		String joinedStr = String.join(" ", args);
		System.out.printf("Hello %s!%n", joinedStr);
	}

	//System.out.printf("I'm now " + this.getClass().getName() + " " + this.getClass().getModule());
}

// java --enable-preview --source 22 NewJava22Hello.java
