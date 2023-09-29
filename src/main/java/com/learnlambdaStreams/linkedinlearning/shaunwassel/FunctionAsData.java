package com.learnlambdaStreams.linkedinlearning.shaunwassel;

public class FunctionAsData {
    protected static class Person{

        private  String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class  DataLoader{

        public final NoArgsFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment){
            this.loadPerson = isDevelopment ? this::loadFakePerson : this::loadRealPerson;
        }


        private Person loadRealPerson(){
            System.out.println("Loading a person ...");
            return new Person("Real Shamak",52);

        }

        private Person loadFakePerson(){
            System.out.println("Loading a fake person ...");
            return new Person("Fake Shamak",25);
        }
    }

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = false;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.applyNoArgs());

    }
}
