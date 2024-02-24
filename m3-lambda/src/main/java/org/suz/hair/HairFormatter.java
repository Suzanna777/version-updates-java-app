package org.suz.hair;

import org.suz.hair.Hair;

@FunctionalInterface
public interface HairFormatter {
    String accept(Hair hair);
}
