package com.masai.Evaluation_4.Problem_2;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee("101","Anu",
                new Address("Chhattisgarh","Raipur","492099"),
                "anu@gmail.com","112233");

        ObjectOutputStream emObj = new ObjectOutputStream(new FileOutputStream("emp.txt"));
        emObj.writeObject(emp);

        ObjectInputStream readEmObject = new ObjectInputStream(new FileInputStream("emp.txt"));
        Employee empRead = (Employee) readEmObject.readObject();

        System.out.println(empRead);
    }

}
