package org.bank.task;

import lombok.*;

@Data // Provide all methods()
@AllArgsConstructor
//@NoArgsConstructor @Getter @Setter @ToString

public class User {
    private String firstName;
    private String lastName;
    private int age;

}
