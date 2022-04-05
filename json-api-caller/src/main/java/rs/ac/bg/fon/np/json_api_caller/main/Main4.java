package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.np.json_api_caller.bank.Bank;

public class Main4 {

	public static void main(String[] args) {
		Bank b = new Bank("Bank1", 111222, "Serbia", "Visa", "Debit", "url");
		
		JsonObject jo = new JsonObject();
		
		jo.addProperty("bank_name", b.getBank_name());
		jo.addProperty("bin", b.getBin());
		jo.addProperty("country", b.getCountry());
		jo.addProperty("scheme", b.getScheme());
		jo.addProperty("type", b.getType());
		jo.addProperty("url", b.getUrl());
		
		try(FileWriter fr = new FileWriter("rucni_upis.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			fr.write(gson.toJson(jo));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
