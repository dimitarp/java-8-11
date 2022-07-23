import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Java11ApiExampleTest {
    /** Test runs successfully on JDK 11 but fails on JDK 8. */
    @Test
    void test() {
        Assertions.assertNotNull(Java11ApiExample.isEmpty(Optional.of("test")));
    }
}
