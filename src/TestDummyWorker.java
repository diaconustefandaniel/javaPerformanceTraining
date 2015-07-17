public class TestDummyWorker {
	public static void main(String[] args) throws InterruptedException {
		DummyWorker dw1 = new DummyWorker("AAA");
		DummyWorker dw2 = new DummyWorker("BBB");
		DummyWorker dw3 = new DummyWorker("CCC");
		dw1.start();
		dw2.start();
		dw3.start();
		Thread.sleep(1000);
		
		DummyWorker.setShouldIContinue(false);
		
		Thread.currentThread().join();
	}

}
