public class DummyWorker2 extends Thread {
 static volatile boolean shouldIContinue = true;

 String message;

 public DummyWorker2(String message) {
  super();
  this.message = message;
 }

 @Override
 public void run() {
  while (shouldIContinue) {
   System.out.println(message);
//   try {
//    //Thread.sleep(300);
//   } catch (InterruptedException e) {
//    // TODO Auto-generated catch block
//    e.printStackTrace();
//   }
  }
  System.out.println("Finish " + message);
 }

 public static void setShouldIContinue(boolean shouldIContinue) {
  DummyWorker2.shouldIContinue = shouldIContinue;
  System.out.println("reset");
 }

}