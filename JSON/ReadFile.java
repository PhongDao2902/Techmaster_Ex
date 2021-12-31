package Exercises.JSON;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadFile {
    public void getData(){
    JSONParser parser = new JSONParser();
    try(FileReader reader = new FileReader("MOCK_DATA.json")){
        Object obj = parser.parse(reader);
        JSONArray customerList = (JSONArray) obj;
        System.out.println(customerList);
        customerList.forEach( cus -> parseCustomerObject( (JSONObject) cus ) );
        } catch (IOException e) {
             e.printStackTrace();
        } catch (ParseException e) {
             e.printStackTrace();
        }
    }

    private static void parseCustomerObject(JSONObject jsonObject){
        long id = (long) jsonObject.get("id");
        String first_name = (String) jsonObject.get("first_name");
        String last_name = (String) jsonObject.get("last_name");
        String email = (String) jsonObject.get("email");
        String mobile = (String) jsonObject.get("mobile");
        String address = (String) jsonObject.get("address");
        System.out.println(id + " - " +first_name+" - " + last_name + " - " + email + " - " + mobile + " - " + address);
    }
}
    

