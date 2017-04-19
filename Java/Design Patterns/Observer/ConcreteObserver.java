public class ConcreteObserver extends Observer {

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //something to be done when the subject changes
    }
}