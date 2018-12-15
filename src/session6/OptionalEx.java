package session6;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optionalStr = Optional.ofNullable(str);
        if (optionalStr.isPresent()) {
            System.out.println(optionalStr.get());
        }
        optionalStr.ifPresent((s) -> {
            // TODO
        });
    }
}
