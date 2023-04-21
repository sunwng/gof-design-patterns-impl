package creational.builder;

import java.util.*;

public class ComplexClass {
    String name;
    int number;
    String address;
    String account;
    List<String> list;
    Map<Integer, String> map;

    ComplexClass(Builder builder) {
        this.name = builder.name;
        this.number = builder.number;
        this.address = builder.address;
        this.account = builder.account;
        this.list = builder.list;
        this.map = builder.map;
    }

    public static class Builder {
        String name;
        int number;
        String address;
        String account;
        List<String> list;
        Map<Integer, String> map;

        public Builder(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public Builder addAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder addAccount(String account) {
            this.account = account;
            return this;
        }

        public Builder addList(List<String> list) {
            this.list = list;
            return this;
        }

        public Builder addMap(Map<Integer, String> map) {
            this.map = map;
            return this;
        }

        public ComplexClass build() {
            return new ComplexClass(this);
        }

    }

}
