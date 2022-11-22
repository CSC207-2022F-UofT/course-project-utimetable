package database;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class Database {
    public static void readDataBase(){
        // reads the json file in database and returns it
        JSONParser parser = new JSONParser();

        try{
            JSONArray a = (JSONArray) parser.parse(new FileReader("UsersDataBase.json"));

            for (Object o : a) {
                JSONObject user = (JSONObject) o;
                System.out.println(user.get("username"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void writeDataBase() {
        // takes in a json object and puts it in the json file in database
    }
}