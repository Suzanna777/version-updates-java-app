package org.bank.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(" Suzanna", " Mizina", 37));
        users.add(new User(" Ruslan", " Mizin", 19));
        users.add(new User(" Alina", " Mizina", 14));
        users.add(new User(" Amina", " Sadyk", 55));
        // print all elements in the list
        find(users,user -> true);

        System.out.println("**************");
        // print all people the last name starts with M
        find(users,user -> user.getLastName().startsWith("M"));
    }

    private static void find(List<User> users, Predicate<User> p){
        for(User eachUser: users){
            if(p.test(eachUser)){
                System.out.println(eachUser.toString());
            }
        }
    }
}
