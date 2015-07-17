public class TestDummyWorker2 {
 public static void main(String[] args) throws InterruptedException {
//  DummyWorker dw1 = new DummyWorker("AAA");
//  DummyWorker dw2 = new DummyWorker("BBB");
//  DummyWorker dw3 = new DummyWorker("CCC");
//  dw1.start();
//  dw2.start();
//  dw3.start();
  
  for(int i=0; i<100; i++)
  {
   DummyWorker2 dw = new DummyWorker2("AAA"+i);
   dw.start();
  }
  Thread.sleep(10000);
  
  DummyWorker2.setShouldIContinue(false);
  
  Thread.currentThread().join();
 }

}