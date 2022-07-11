package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class),
        basePackages = "hello.core" // 지정하지 않으면 위 class의 위치가 최상단 폴더가 된다.
)
public class AutoAppConfig {
}
