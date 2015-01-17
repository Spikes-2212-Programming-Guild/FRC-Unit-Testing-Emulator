/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.relay;

/**
 *
 * @author Developer
 */
public class Relay {

    private Value value;

    public Relay(int port) {
    }

    public void set(Value value) {
        this.value = value;
    }

    public static class Value {

        private int v;

        public Value(int v) {
            this.v = v;
        }

        public int getV() {
            return v;
        }

        public static Value kOn = new Value(2);
        public static Value kOff = new Value(0);
        public static Value kForward = new Value(1);
        public static Value kReverse = new Value(-1);
    }

    public Value get() {
        return value;
    }

}
