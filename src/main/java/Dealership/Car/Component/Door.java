package Dealership.Car.Component;

public class Door extends Component {

   boolean closed;

    public Door() {
        this.closed = true;
    }

    public boolean getIsDoorClosed() {
        return this.closed;
    }

    public void open() {
        if (this.closed) {
            this.closed = false;
        }
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
        }
    }

}


