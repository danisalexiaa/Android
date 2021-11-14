package com.example.temadam;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JSONReader {
    public void read(String urlpath, IResponse response) {
        try {
            URL url = new URL(urlpath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream input = connection.getInputStream();
            InputStreamReader inputReader = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(inputReader);

            StringBuilder result = new StringBuilder();
            String line = "";
//            String a = "a" + "d";
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            Log.v("result", result.toString());
            reader.close();
            inputReader.close();
            input.close();
            List<Tweets> list = parsare(result.toString());
            response.onSuccess(list);


        } catch (MalformedURLException e) {
            e.printStackTrace();
            response.onError(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            response.onError(e.getMessage());
        }

    }

    private List<Tweets> parsare(String jsonString) {
        List<Tweets> lst = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray array = jsonObject.getJSONArray("Tweets");
            for (int i = 0; i < array.length(); i++) {
                JSONObject currentObject = array.getJSONObject(i);
//                int imagine = currentObject.getInt("Imagine");
                String nume = currentObject.getString("nume");
                String user = currentObject.getString("user");
                String mail = currentObject.getString("mail");
                String text = currentObject.getString("text");
                Tweets t1 = new Tweets(R.drawable.profilepic, nume, user, mail, text);
                lst.add(t1);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lst;
    }
}
