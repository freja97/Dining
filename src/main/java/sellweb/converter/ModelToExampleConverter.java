package sellweb.converter;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;

public class ModelToExampleConverter<T> {
    public Example<T> convert(T model, String name) {
        ExampleMatcher matcher = ExampleMatcher.matching()
            .withMatcher(name, GenericPropertyMatchers.exact());
        return Example.of(model, matcher);
    }
}
