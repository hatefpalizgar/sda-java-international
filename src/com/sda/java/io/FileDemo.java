package com.sda.java.io;

import com.sda.java.collections.maps.Person;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        File myFile = new File("/Users/hatef.palizgar/Desktop/java-international-remote/Java Advanced/Java Advanced/src/com/sda/java/io/input.txt");


        Person person = new Person("Hatef", "lName", 10);

//        readFromFile(myFile);
//        writeToFile(myFile);

        writeObjectToFile(person);

        File objFile = new File("/Users/hatef.palizgar/Desktop/java-international-remote/Java Advanced/Java Advanced/src/com/sda/java/io/person");

        readObjectFromFile(objFile);

    }

    private static void readObjectFromFile(File objFile) {
        File file;
        try {
            FileInputStream in = new FileInputStream(objFile);
            ObjectInputStream stream = new ObjectInputStream(in);
            Object receivedObject = stream.readObject();
            System.out.println(((Person) receivedObject).getFirstName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeObjectToFile(Person person) {
        try {
            FileOutputStream out = new FileOutputStream(new File("/Users/hatef.palizgar/Desktop/java-international-remote/Java Advanced/Java Advanced/src/com/sda/java/io/person"));
            ObjectOutputStream stream = new ObjectOutputStream(out);
            stream.writeObject(person);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void readFromFile(File myFile) {
     /*   try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
            String line;
            while ( (line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        // try-with-resources
        // takes care of closing all resources automatically
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(File myFile) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile, true))) {

            // overwrites the current content
//            bufferedWriter.write("new string");
            bufferedWriter.append("\nnew string");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

