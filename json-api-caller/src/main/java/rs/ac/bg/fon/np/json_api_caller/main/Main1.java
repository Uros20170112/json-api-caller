package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.np.json_api_caller.bank.Bank;

public class Main1 {
	
	public static final String ACCESS_KEY = "pLnQdZZAZkjwsrwi8pRmqM5R3gal8IHb";
	public static final String bin_code = "402965";

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://api.apilayer.com/bincheck/" + bin_code + 
					"?apikey=" + ACCESS_KEY);
			
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonObject jo = gson.fromJson(in, JsonObject.class);
			
			Bank b = new Bank();
			
			b.setBank_name(jo.get("bank_name").getAsString());
			b.setBin(jo.get("bin").getAsInt());
			b.setCountry(jo.get("country").getAsString());
			b.setScheme(jo.get("scheme").getAsString());
			b.setType(jo.get("type").getAsString());
			b.setUrl(jo.get("url").getAsString());
			
			
			
			in.close();
			System.out.println(b.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		


	}

}
