class Foo {
    private CountDownLatch f;
    private CountDownLatch s;
    public Foo() {
        f = new CountDownLatch(1);
        s = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        f.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        f.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        s.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        s.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}