import java.io.FileNotFoundException;
import java.util.Optional;

class ErrorHandling {
    
    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws ClassNotFoundException {
        throw new ClassNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        // Delete this statement and write your own implementation.
        throw new NullPointerException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        // Delete this statement and write your own implementation.
        throw new NullPointerException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {

        Integer val = null;
        try {
            val = Integer.parseInt(integer);
        } catch (NumberFormatException e) {
            return Optional.ofNullable(val);
        }
        return Optional.of(val);
    }
        
}
