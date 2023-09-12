package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
    public static void main(String[] args) {

        User Sachin = new User("Sachin");
        User Sehwag = new User("Virendra");
        User Dravid = new User("Rahul");
        User Dhoni = new User("mahindra");
        User Singh = new User("Yuraj");

        List<User> users = List.of(Sachin,Sehwag,Singh,Dhoni,Dravid);
        List<String> username = new ArrayList<>();
        Function<User, String> toName = user -> user.getUsername();
        for(User user : users){
            username.add(toName.apply(user));
        }

        users.forEach(u-> System.out.println(u));
        username.forEach((String user)-> System.out.println(user)); // example of consumer
    }
}
