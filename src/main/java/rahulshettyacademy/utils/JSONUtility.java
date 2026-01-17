package rahulshettyacademy.utils;

import org.apache.commons.io.FileUtils;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class JSONUtility {

    public static  List<HashMap<String,Object>>  convertJsonFileToHashMap(String fileName) throws IOException {

      String jsonString =   FileUtils.readFileToString(new File(System.getProperty("user.dir")+"/src/test/java/rahulshettyacademy/test_data/"+fileName));

      ObjectMapper objectMapper = new ObjectMapper();
      List<HashMap<String,Object>> jsonToHashMapData =   objectMapper.readValue(jsonString, new TypeReference<List<HashMap<String,Object>>>() {
      });


     return jsonToHashMapData;

    }

}
