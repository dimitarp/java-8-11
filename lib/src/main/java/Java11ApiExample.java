import java.util.Optional;

class Java11ApiExample {
    /** {@link Optional#isEmpty()} is available since JDK 11. */
    static String isEmpty(Optional<?> opt) {
        return "Optional is " + (opt.isEmpty() ? "empty" : "present");
    }
}
