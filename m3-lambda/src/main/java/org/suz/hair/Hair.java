package org.suz.hair;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.suz.hair.Color;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Hair {
    private int link;
    private Color color;

}
