package com.sagarandcompany.BeanLifeCycle.PostConstructAndPreDestroyAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserService {
    private String name;
    private String email;
    private Integer age;

    @PostConstruct
    public void postConstruct() {
        System.out.println("calling postConstruct method after setting all values.........." + this.toString());
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("calling this destroy method ");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("calling name setter");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("calling email setter");

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("calling age setter");

    }

    @Override
    public String toString() {
        return "EmpService{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
