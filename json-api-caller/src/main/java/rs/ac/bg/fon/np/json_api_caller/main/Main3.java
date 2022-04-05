package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.bank.Bank;

public class Main3 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("niz_objekata.json");
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			List<Bank> bankList = Arrays.asList(gson.fromJson(fr, Bank[].class));
			
			for(Bank b : bankList) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
