package com.zalando.lite.annotations;

/**
 * Marks a product as "featured" in the ZalandoLite system.
 * <p>
 * This annotation can be applied to classes or fields to indicate that
 * a product should receive special treatment, such as being shown at
 * the top of listings or highlighted in promotions.
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * @Featured
 * public class Product { ... }
 * }</pre>
 *
 * <p>This annotation does not contain any parameters (marker annotation).
 * It is intended to be used together with Java Reflection to identify
 * specially marked entities at runtime.
 *
 * @author Java Mentor
 */
public @interface Featured {
    // This is a marker annotation — no methods defined.
    // Marker annotations are used simply to "mark" elements
    // for special processing at runtime (like @Override).
}
