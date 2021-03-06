// This code is auto-generated by Segment Typewriter. Do not edit.
package com.segment.analytics;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RequiredArray extends PropertiesSerializable {
    private Properties properties;

    private RequiredArray(Properties properties) {
        this.properties = properties;
    }

    protected Properties toProperties() {
        return properties;
    }

    /**
     * Builder for {@link RequiredArray}
     */
    public static class Builder {
        private static String OPTIONAL_SUB_PROPERTY_KEY = "optional sub-property";
        private static String REQUIRED_SUB_PROPERTY_KEY = "required sub-property";

        private Properties properties;

        /**
         * Builder for {@link RequiredArray}
         */
        public Builder() {
            properties = new Properties();
        }

        /**
         * Optional sub-property
         * This property is optional and not required to generate a valid RequiredArray object
         */
        public Builder optionalSubProperty(final @NonNull String optionalSubProperty) {
            properties.putValue(OPTIONAL_SUB_PROPERTY_KEY, optionalSubProperty);
            return this;
        }

        /**
         * Required sub-property
         * This property is required to generate a valid RequiredArray object
         */
        public Builder requiredSubProperty(final @NonNull String requiredSubProperty) {
            properties.putValue(REQUIRED_SUB_PROPERTY_KEY, requiredSubProperty);
            return this;
        }

        /**
         * Build an instance of {@link RequiredArray}
         * Performs runtime validation on the following required properties:
         *  - requiredSubProperty
         */
        public RequiredArray build() {
            if (properties.get(REQUIRED_SUB_PROPERTY_KEY) == null) {
                throw new IllegalArgumentException("RequiredArray missing required property: requiredSubProperty");
            }

            return new RequiredArray(properties);
        }
    }
}
