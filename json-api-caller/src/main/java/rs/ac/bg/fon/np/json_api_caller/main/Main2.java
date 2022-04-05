package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.bank.Bank;

public class Main2 {

	public static void main(String[] args) {
		Bank[] bankArray = {
				new Bank("Banka1", 123456, "Serbia", "Visa", "Debit", "url1"),
				new Bank("Banka2", 111111, "USA", "Visa", "Credit", "url2"),
				new Bank("Banka3", 122223, "Canada", "Mastercard", "Debit", "url3"),
				new Bank("Banka4", 133344, "France", "MaestoCard", "Credit", "url4")
		};
		
		try(PrintWriter pw = new PrintWriter(new FileWriter("niz_objekata.json"))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			pw.println(gson.toJson(bankArray));
			System.out.println(gson.toJson(bankArray));
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
