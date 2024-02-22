package org.bank.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        List<Person> member = new ArrayList<Person>();

        member.add(new Person("Suzanna", 37, Gender.FEMALE));
        member.add(new Person("Amina", 55, Gender.FEMALE));
        member.add(new Person("Ruslan", 19, Gender.MALE));
        // this way
        CheckMember checkMember = p -> p.getGender() == Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25;
        personFormatter(member, checkMember);

        System.out.println("******************");
        // this way
        personFormatter(member, p -> p.getGender() == Gender.FEMALE && p.getAge() >= 37 && p.getAge() <= 55);
    }

    private static void personFormatter(List<Person> member, CheckMember checkMember) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : member) {
            if (checkMember.check(person)) { // boolean
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
