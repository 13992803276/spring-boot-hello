package com.thoughtworks.springboothello.domain.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@ToString
@AllArgsConstructor
@Slf4j
public class User {
    private String name;
    private int age;

}
