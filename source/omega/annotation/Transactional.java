package omega.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Transactional {
	Class<? extends Exception>[] rollbackOn() default RuntimeException.class;

	Class<? extends Exception>[] ignore() default {};

	String type() default "";

	TransactionIsolation isolation() default TransactionIsolation.DEFAULT;
}
