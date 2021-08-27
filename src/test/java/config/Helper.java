package config;

import org.json.simple.JSONObject;

public class Helper {

    public static String createUser(String name, String job) {

        JSONObject requestParams = new JSONObject();
        requestParams.put("name", name); // Cast
        requestParams.put("job", job);

        String jsonBody = requestParams.toJSONString();
        return jsonBody;

    }
}
