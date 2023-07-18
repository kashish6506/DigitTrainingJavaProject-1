package onlineShopping;

import java.util.Scanner;
class Products
{
	void ProductsM()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("<-------------Welcome to Main Menu------------->\n"
				+ "Select one of these Category to buy\n"
				+"\n"
				+ "1.(Electronics)  --->\n"
				+"\n"
				+ "2.(Fashion)      --->\n"
				+"\n"
				+ "3.(Appliances)   --->\n"
				+"\n"
				+ "4.(Furniture)    --->\n"
				+ "\n"
				+ "5.(Grocery)    --->\n"
				);
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			Electronics ElectronicsObj = new Electronics();
			ElectronicsObj.ElectronicsMethod();       // calling method
			break;
		case 2:
			Fashion FashionObj = new Fashion();
			FashionObj.FashionMethod();               // calling method
			break;
		case 3:
			Appliances AppliancesObj = new Appliances();
			AppliancesObj.AppliancesMethod();         // calling method
			break;
		case 4 :
			Furniture FurnitureObj = new Furniture();
			FurnitureObj.FurnitureM();              // calling method
			break;
		default:
			Grocery GroceryObj = new Grocery();
			GroceryObj.GroceryM();         // calling method
			break;

		}
	}

}
class Electronics extends Products
{
	void ElectronicsMethod() {
		Scanner sc = new Scanner(System.in);
		int sc1;      
		Laptop LaptopObj = new Laptop();
		Smart_watches Smart_watchesObj = new Smart_watches();
		Headphones Head_phonesObj = new Headphones();
		Speakers SpeakersObj = new Speakers();  
		System.out.println("Welcome to Electronics portal\n"
				+ "Select one of these products to buy\n"
				+"\n"
				+ "1. Laptops\n"
				+"\n"
				+ " Smart Watches\n"
				+"\n"
				+ "3. Headphones\n"
				+"\n"
				+ "4. Speakers \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			LaptopObj.LaptopM();  
			break;
		case 2:
			Smart_watchesObj.Smart_watchesM(); 
			break;
		case 3:
			Head_phonesObj.Head_phonesM(); 
			break;
		case 4:
			SpeakersObj.SpeakersM();
			break;
		}

	}
}
class Laptop extends Electronics
{
	void LaptopM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Dell DellObj = new Dell();
		Hp hpObj = new Hp();
		Lenevo lenevoObj = new Lenevo();
		Asus asusObj = new Asus();
		Acer acerObj =  new Acer();
		System.out.println("Welcome to my Laptop portal\n"
				+ "Select one of the Brands products to buy\n"
				+ "1.Dell\n"
				+ "2.HP"
				+ "3.Lenevo"
				+ "4.ASUS"
				+ "5.Acer");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			DellObj.DellM(); // calling DellM by sc1
			break;
		case 2:
			hpObj.HpM(); // calling HpM by sc1
			break;
		case 3:
			lenevoObj.LenevoM(); // calling LenevoM by sc1
			break;
		case 4:
			asusObj.AsusM(); // calling AsusM by sc1
			break;
		default:
			acerObj.AcerM(); // calling AcerM by sc1
			break;
		}
	}
}
class Dell extends Laptop {
	void DellM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Dell XPS 15   \n"
				+"Here specifications of Dell XPS 15\n"
				+"\n"
				+"LAUNCH Announced    ---->2022, june 22\n"
				+"\n"
				+"Processor           ---->12th Gen Intel\u00AE Core\u2122 i5-1230U (12 MB cache, 10 cores)\n"
				+"\n"
				+"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
				+"\n"
				+"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
				+"\n"
				+"Camera              ---->12 MP, f/1.8, 26mm (wide)\n"
				+"\n"//
				+"Memory              ---->16 GB, LPDDR4x, 4267 MHz, integrated\n"
				+"\n"
				+"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
				+"\n"
				+"\n"
				+"Price               ---->  1,39,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Dell XPS 15' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0); // exit from program
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			LaptopM();
		}

	}
}
class Hp extends Laptop {
	void HpM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    HP 14   \n"
				+"Here specifications of HP 14 \n"
				+"\n"
				+"LAUNCH Announced    ---->2022, june 22\n"
				+"\n"
				+"Processor           ---->12th Gen Intel\u00AE Core\u2122 i5-1230U (12 MB cache, 10 cores)\n"
				+"\n"
				+"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
				+"\n"
				+"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
				+"\n"
				+"Camera              ---->12 MP, f/1.8, 26mm (wide)\n"
				+"\n"//
				+"Memory              ---->16 GB, LPDDR4x, 4267 MHz, integrated\n"
				+"\n"
				+"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
				+"\n"
				+"\n"
				+"Price               ---->  1,39,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'HP 14 ' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0); // exit from program
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			LaptopM();
		}

	}
}
class Lenevo extends Laptop {
	void LenevoM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("   Lenevo IdeapD Slim 3   \n"
				+"Here specifications of Lenevo IdeapD Slim 3\n"
				+"\n"
				+"LAUNCH Announced    ---->2022, june 22\n"
				+"\n"
				+"Processor           ---->12th Gen Intel\u00AE Core\u2122 i5-1230U (12 MB cache, 10 cores)\n"
				+"\n"
				+"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
				+"\n"
				+"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
				+"\n"
				+"Camera              ---->12 MP, f/1.8, 26mm (wide)\n"
				+"\n"//
				+"Memory              ---->16 GB, LPDDR4x, 4267 MHz, integrated\n"
				+"\n"
				+"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
				+"\n"
				+"\n"
				+"Price               ---->  1,39,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Lenevo IdeapD Slim 3' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0); // exit from program
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			LaptopM();
		}

	}
}
class Asus extends Laptop {
	void AsusM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Asus Vivobook S15   \n"
				+"Here specifications of Asus Vivobook S15\n"
				+"\n"
				+"LAUNCH Announced    ---->2022, june 22\n"
				+"\n"
				+"Processor           ---->12th Gen Intel\u00AE Core\u2122 i5-1230U (12 MB cache, 10 cores)\n"
				+"\n"
				+"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
				+"\n"
				+"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
				+"\n"
				+"Camera              ---->12 MP, f/1.8, 26mm (wide)\n"
				+"\n"//
				+"Memory              ---->16 GB, LPDDR4x, 4267 MHz, integrated\n"
				+"\n"
				+"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
				+"\n"
				+"\n"
				+"Price               ---->  1,39,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Asus Vivobook S15' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0); // exit from program
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			LaptopM();
		}

	}
}
class Acer extends Laptop {
	void AcerM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Acer One 14   \n"
				+"Here specifications of Acer One 14\n"
				+"\n"
				+"LAUNCH Announced    ---->2022, june 22\n"
				+"\n"
				+"Processor           ---->12th Gen Intel\u00AE Core\u2122 i5-1230U (12 MB cache, 10 cores)\n"
				+"\n"
				+"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
				+"\n"
				+"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
				+"\n"
				+"Camera              ---->12 MP, f/1.8, 26mm (wide)\n"
				+"\n"//
				+"Memory              ---->16 GB, LPDDR4x, 4267 MHz, integrated\n"
				+"\n"
				+"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
				+"\n"
				+"\n"
				+"Price               ---->  1,39,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Acer One 14' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0); // exit from program
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			LaptopM();
		}

	}
}

class Smart_watches extends Electronics
{
	void Smart_watchesM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Noise s1 = new Noise();
		Boat s2 = new Boat();
		Firebolt s3 = new Firebolt();
		Hammer s4 = new Hammer();
		BeatXP s5 =new BeatXP();


		System.out.println("Welcome to my Smart watches portal\n"
				+ "Select one of the Brands products to buy\n"
				+ "1.Noise\n"
				+ "2.Boat"
				+ "3.Firebolt"
				+ "4.Hammer"
				+ "5.BeatXP");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.NoiseM(); // calling NoiseM by sc1
			break;
		case 2:
			s2.BoatM(); // calling BoatM by sc1
			break;
		case 3:
			s3.FireboltM(); // calling FireboltM by sc1
			break;
		case 4:
			s4.HammerM(); // calling HammerM by sc1
			break;
		default:
			s5.BeatXPM();// calling BeatXPM by sc1
			break;
		}
	}
}
class Noise extends Smart_watches {
	void NoiseM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Noise Fit 4   \n"
				+"Here specifications of HP Envy 360\n"
				+"\n"
				+"LAUNCH Announced           ---->2019, April 03\n"
				+"\n"
				+"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
				+"\n"
				+"Battery Life               ---->7 days\n"
				+"\n"
				+"Compatible OS              ---->Android & iOS\n"
				+"\n"
				+"Display Resolution         ---->240 x 285 pixel\n" //
				+"\n"
				+"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
				+"\n"
				+"Microphone                 ---->Yes\n"
				+"\n"
				+"\n"
				+"Price                       ---->  2,499.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Noise Fit 4' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Smart_watchesM();
		}


	}
}
class Boat extends Smart_watches {
	void BoatM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Boat Wave   \n"
				+"Here specifications of Boat Wave\n"
				+"\n"
				+"LAUNCH Announced           ---->2022, April 13\n"
				+"\n"
				+"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
				+"\n"
				+"Battery Life               ---->10 days\n"
				+"\n"
				+"Compatible OS              ---->Android & iOS\n"
				+"\n"
				+"Display Resolution         ---->240 x 285 pixel\n" //
				+"\n"
				+"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
				+"\n"
				+"Microphone                 ---->Yes\n"
				+"\n"
				+""
				+"Price               ---->  3,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Boat Wave is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Smart_watchesM();
		}

	}
}
class Firebolt extends Smart_watches {
	void FireboltM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Firebolt Artillery   \n"
				+"Here specifications of Firebolt Artillery\n"
				+"\n"
				+"LAUNCH Announced           ---->2022, April 13\n"
				+"\n"
				+"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
				+"\n"
				+"Battery Life               ---->10 days\n"
				+"\n"
				+"Compatible OS              ---->Android & iOS\n"
				+"\n"
				+"Display Resolution         ---->240 x 285 pixel\n" //
				+"\n"
				+"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
				+"\n"
				+"Microphone                 ---->Yes\n"
				+"\n"
				+""
				+"Price               ---->  3,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Firebolt Artillery is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Smart_watchesM();
		}

	}
}
class Hammer extends Smart_watches {
	void HammerM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Hammer Ace 3.0  \n"
				+"Here specifications of Hammer Ace 3.0\n"
				+"\n"
				+"LAUNCH Announced           ---->2022, April 13\n"
				+"\n"
				+"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
				+"\n"
				+"Battery Life               ---->10 days\n"
				+"\n"
				+"Compatible OS              ---->Android & iOS\n"
				+"\n"
				+"Display Resolution         ---->240 x 285 pixel\n" //
				+"\n"
				+"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
				+"\n"
				+"Microphone                 ---->Yes\n"
				+"\n"
				+""
				+"Price               ---->  3,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Hammer Ace 3.0 is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Smart_watchesM();
		}


	}
}
class BeatXP extends Smart_watches {
	void BeatXPM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    BeatXP Vega Neo   \n"
				+"Here specifications of BeatXP Vega Neo\n"
				+"\n"
				+"LAUNCH Announced           ---->2022, April 13\n"
				+"\n"
				+"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
				+"\n"
				+"Battery Life               ---->10 days\n"
				+"\n"
				+"Compatible OS              ---->Android & iOS\n"
				+"\n"
				+"Display Resolution         ---->240 x 285 pixel\n" //
				+"\n"
				+"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
				+"\n"
				+"Microphone                 ---->Yes\n"
				+"\n"
				+""
				+"Price               ---->  3,999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order BeatXP Vega Neo is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Smart_watchesM();
		}


	}
}
class Headphones extends Electronics
{
	void Head_phonesM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Realme RealmeObj = new Realme();
		JBL JBLObj = new JBL();
		Sony SonyObj = new Sony();
		Zebronics ZebronicsObj = new Zebronics();
		Sennheiser SennheiserOnj = new Sennheiser();
		System.out.println("Welcome to my Laptop portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Realme\n"
				+ "2.JBL"
				+ "3.Sony"
				+ "4.Zebronics"
				+ "5.Sennheiser");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			RealmeObj.RealmeM(); // calling RealmeM by sc1
			break;
		case 2:
			JBLObj.JBLM(); // calling NordM by sc1
			break;
		case 3:
			SonyObj.SonyM(); // calling SonyM by sc1
			break;
		case 4:
			ZebronicsObj.ZebronicsM(); // calling ZebronicsM by sc1
			break;
		default:
			SennheiserOnj.SennheiserM();  // calling SennheiserM by sc1
			break;
		}
	}
}
class Realme extends Headphones {
	void RealmeM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Realme Wireless 3   \n"
				+"Here specifications of Realme Wireless 3\n"
				+"\n"
				+"Compatible Devices      ----> Cellphones, Tablets, Laptops\n"
				+"\n"
				+"Control Type            ----> Call Control\n"
				+"\n"
				+"Item Weight             ----> 30 Grams\n"
				+"\n"
				+"Style                   ----> Buds Wireless 3\n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" //
				+"\n"
				+"Audio Driver Type       ----> Dynamic Driver\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 42*10.5*2.2 cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 1798.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Realme Wireless 3' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Head_phonesM();
		}


	}
}
class JBL extends Headphones {
	void JBLM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    JBL Tune 760NC   \n"
				+"Here specifications of JBL Tune 760NC\n"
				+"\n"
				+"Compatible Devices      ----> Cellphones, Tablets, Laptops\n"
				+"\n"
				+"Control Type            ----> Call Control\n"
				+"\n"
				+"Item Weight             ----> 30 Grams\n"
				+"\n"
				+"Style                   ----> Wireless 3\n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Driver Type       ----> Dynamic Driver\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 42*10.5*2.2 cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 4998.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'JBL Tune 760NC' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Head_phonesM();
		}


	}
}
class Sony extends Headphones {
	void SonyM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Sony WH-1000XM5   \n"
				+"Here specifications of Sony WH-1000XM5\n"
				+"\n"
				+"Compatible Devices      ----> Cellphones, Tablets, Laptops\n"
				+"\n"
				+"Control Type            ----> Call Control\n"
				+"\n"
				+"Item Weight             ----> 30 Grams\n"
				+"\n"
				+"Style                   ----> Wireless 3\n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Driver Type       ----> Dynamic Driver\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 42*10.5*2.2 cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 29990.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Sony WH-1000XM5' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Head_phonesM();
		}


	}
}
class Zebronics extends Headphones {
	void ZebronicsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Zebronics Zeb-Duke   \n"
				+"Here specifications of Zebronics Zeb-Duke\n"
				+"\n"
				+"Compatible Devices      ----> Cellphones, Tablets, Laptops\n"
				+"\n"
				+"Control Type            ----> Call Control\n"
				+"\n"
				+"Item Weight             ----> 30 Grams\n"
				+"\n"
				+"Style                   ----> Wireless 3\n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Driver Type       ----> Dynamic Driver\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 42*10.5*2.2 cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 29990.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Zebronics Zeb-Duke' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Head_phonesM();
		}


	}
}
class Sennheiser extends Headphones {
	void SennheiserM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Sennheiser HD 458 ANC  \n"
				+"Here specifications of Sennheiser HD 458 ANC\n"
				+"\n"
				+"Compatible Devices      ----> Cellphones, Tablets, Laptops\n"
				+"\n"
				+"Control Type            ----> Call Control\n"
				+"\n"
				+"Item Weight             ----> 30 Grams\n"
				+"\n"
				+"Style                   ----> Wireless 3\n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Driver Type       ----> Dynamic Driver\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 42*10.5*2.2 cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 29990.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Sennheiser HD 458 ANC' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Head_phonesM();
		}


	}
}
class Speakers extends Electronics
{
	void SpeakersM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Bose BoseObj = new Bose();
		Sonos SonosObj = new Sonos();
		Philips PhilipsObj = new Philips();
		Blaupunkt BlaupunktObj = new Blaupunkt();
		Modernista ModernistaObj =  new Modernista();
		System.out.println("Welcome to my Laptop portal\n"
				+ "Select one of the Brands products to buy\n"
				+ "1.Bose\n"
				+ "2.Sonos"
				+ "3.Philips"
				+ "4.Blaupunkt"
				+ "5.Modernista");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			BoseObj.BoseM(); 
			break;
		case 2:
			SonosObj.SonosM(); 
			break;
		case 3:
			PhilipsObj.PhilipsM(); 			
			break;
		case 4:
			BlaupunktObj.BlaupunktM(); 
			break;
		default:
			ModernistaObj.ModernistaM(); 
			break;
		}
	}
}
class Bose extends Speakers {
	void BoseM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("   Bose Smart Soundbar 900   \n"
				+"Here specifications of Bose Smart Soundbar 900 ANC\n"
				+"\n"
				+"Sorround Sound Channel Configuration      ----> 5.1 \n"
				+"\n"
				+"Control Type            ----> Remote Control\n"
				+"\n"
				+"Item Weight             ----> 5750 Grams\n"
				+"\n"
				+" Battery Life           ----> 30 Days\n"
				+"\n"
				+" Include Components     ----> AA Battery(4), Power cord*, HDMI cable,Optical cable\n"
				+"\n"
				+"Is Waterproof           ----> True\n"
				+"\n"
				+" Supported Internet Services  ----> Spotify \n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Output Mode       ----> Surround\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 5.8D*104.5W*5.8H cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 89999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Bose Smart Soundbar 900' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			SpeakersM();
		}


	}
}
class Sonos extends Speakers {
	void SonosM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("   Sonos Beam 2   \n"
				+"Here specifications of Sonos Beam 2 ANC\n"
				+"\n"
				+"Sorround Sound Channel Configuration      ----> 5.1 \n"
				+"\n"
				+"Control Type            ----> Remote Control\n"
				+"\n"
				+"Item Weight             ----> 5750 Grams\n"
				+"\n"
				+" Battery Life           ----> 30 Days\n"
				+"\n"
				+" Include Components     ----> AA Battery(4), Power cord*, HDMI cable,Optical cable\n"
				+"\n"
				+"Is Waterproof           ----> True\n"
				+"\n"
				+" Supported Internet Services  ----> Spotify \n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Output Mode       ----> Surround\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 5.8D*104.5W*5.8H cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 89999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Sonos Beam 2' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			SpeakersM();
		}


	}
}
class Philips extends Speakers {
	void PhilipsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("   Philips Audio HTL8162  \n"
				+"Here specifications of Philips Audio HTL8162 \n"
				+"\n"
				+"Sorround Sound Channel Configuration      ----> 5.1 \n"
				+"\n"
				+"Control Type            ----> Remote Control\n"
				+"\n"
				+"Item Weight             ----> 5750 Grams\n"
				+"\n"
				+" Battery Life           ----> 30 Days\n"
				+"\n"
				+" Include Components     ----> AA Battery(4), Power cord*, HDMI cable,Optical cable\n"
				+"\n"
				+"Is Waterproof           ----> True\n"
				+"\n"
				+" Supported Internet Services  ----> Spotify \n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Output Mode       ----> Surround\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 5.8D*104.5W*5.8H cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 89999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Philips Audio HTL8162' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			SpeakersM();
		}


	}
}

class Blaupunkt extends Speakers {
	void BlaupunktM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("   Blaupunkt SBA20  \n"
				+"Here specifications of Blaupunkt SBA20\n"
				+"\n"
				+"Sorround Sound Channel Configuration      ----> 5.1 \n"
				+"\n"
				+"Control Type            ----> Remote Control\n"
				+"\n"
				+"Item Weight             ----> 5750 Grams\n"
				+"\n"
				+" Battery Life           ----> 30 Days\n"
				+"\n"
				+" Include Components     ----> AA Battery(4), Power cord*, HDMI cable,Optical cable\n"
				+"\n"
				+"Is Waterproof           ----> True\n"
				+"\n"
				+" Supported Internet Services  ----> Spotify \n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Output Mode       ----> Surround\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 5.8D*104.5W*5.8H cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 89999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Blaupunkt SBA20' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			SpeakersM();
		}


	}
}
class Modernista extends Speakers {
	void ModernistaM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("   Modernista GoSurround 900   \n"
				+"Here specifications of Modernista GoSurround 900 ANC\n"
				+"\n"
				+"Sorround Sound Channel Configuration      ----> 5.1 \n"
				+"\n"
				+"Control Type            ----> Remote Control\n"
				+"\n"
				+"Item Weight             ----> 5750 Grams\n"
				+"\n"
				+" Battery Life           ----> 30 Days\n"
				+"\n"
				+" Include Components     ----> AA Battery(4), Power cord*, HDMI cable,Optical cable\n"
				+"\n"
				+"Is Waterproof           ----> True\n"
				+"\n"
				+" Supported Internet Services  ----> Spotify \n"
				+"\n"
				+"Net Quantity            ----> 1 Count\n" 
				+"\n"
				+"Audio Output Mode       ----> Surround\n"
				+"\n"
				+"Bluetooth Range         ----> 13.6 Millimetres\n"
				+"\n"
				+" Product Dimensions\n   ----> 5.8D*104.5W*5.8H cm;"      
				+"\n"
				+" Item model number	  ----> RMA2119\n"
				+"\n"
				+"Price                   ----> 89999.00 only/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order 'Modernista GoSurround 900' is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			SpeakersM();
		}


	}
}
class Fashion extends Products
{
    void FashionMethod() {
        Scanner sc = new Scanner(System.in);
        int sc1;
        Shirt ShirtObj = new Shirt();         //creating object
        Jeans JeansObj = new Jeans();
        Saree SareeObj = new Saree();
        // Frock FrockObj = new Frock();  
        System.out.println("Welcome to Electronics portal\n"
                + "Select one of these products to buy\n"
                +"\n"
                + "1.Shirt\n"
                + "2.Jeans\n"
                + "3.Saari\n");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                ShirtObj.ShirtM(); // calling AppleM by s1
                break;
                case 2:
                JeansObj.JeansM(); // calling AppleM by s1
                break;
                // case 3:
                // s1.SaariM(); // calling AppleM by s1
                // break;
            default:
            	SareeObj.SareeM();
                break;
        }

    }
}
class Shirt extends Fashion
{
  void ShirtM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Raymond s1 = new Raymond();
        Puma s2 = new Puma();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Fashion portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Raymond\n"
                + "2.Puma");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.RaymondM(); // calling AppleM by s1
                break;
            default:
                s2.PumaM();
                break;
        }
  }
} 
class Raymond extends Shirt {
    void RaymondM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Raymond Men Regular'   \n"
                                +"Here specifications of 'Raymond Men Regular'\n"
                                +"\n"
                                +"\n"
                                +"Fit: Regular Fit\n"
                                +"\n"
                                +"Color: Light Pink \n"
                                +"\n"
                                +"Fabric: 100% COTTON \n"
                                +"\n"
                                +"Neck: Regular Collar\n"
                                +"\n"
                                +"Sleeve: Full Sleeve\n" //
                                +"\n"
                                +"Machine Wash\n"
                                +"\n"
                                +"SKU: #RPSZ07978-R286F038\n"
                                +"\n"
                                +""
                                +"Price                            ---->  2,579.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Raymond Men Regular' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                 FashionMethod();
                               }
                 //creating object

    }
}  
class Puma extends Shirt {
    void PumaM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'PUMA Men Regular'   \n"
                                +"Here specifications of 'PUMA Men Regular'\n"
                                +"\n"
                                +"Fit: Regular Fit\n"
                                +"\n"
                                +"Color: Light Blue \n"
                                +"\n"
                                +"Fabric: 100% COTTON \n"
                                +"\n"
                                +"Neck: Regular Collar\n"
                                +"\n"
                                +"Sleeve: Full Sleeve\n" //
                                +"\n"
                                +"Machine Wash\n"
                                +"\n"
                                +"SKU: #RPSZ07978-R286F038\n"
                                +"\n"
                                +""
                                +"Price                            ---->  1,567.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'PUMA Men Regular' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                 //creating object

    }
}   
class Jeans extends Fashion
{
  void JeansM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Lee s1 = new Lee();
        Pepe s2 = new Pepe();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Fashion portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Lee Cooper\n"
                + "2.Pepe Jeams");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.LeeM(); // calling AppleM by s1
                break;
            default:
                s2.PepeM();
                break;
        }
  }
}  
class Lee extends Jeans {
    void LeeM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Lee Cooper'   \n"
                                +"Here specifications of 'PUMA Men Regular'\n"
                                +"\n"
                                +"\n"
                                +"Care Instructions: Hand Wash Only\n"
                                +"\n"
                                +"Fit Type: Straight\n"
                                +"\n"
                                +"Color name: Beige\n"
                                +"\n"
                                + "Material: Cotton\n"
                                +"\n"
                                +"Pattern: Plain\n"
                                +"\n"
                                +"Hand Wash");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Lee Coper is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                 //creating object

    }
} 
class Pepe extends Jeans {
    void PepeM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Pepe Jeans'   \n"
                                +"Here specifications of 'PUMA Men Regular'\n"
                                +"\n"
                                +"\n"
                                +"Care Instructions: Hand Wash Only\n"
                                +"\n"
                                +"Fit Type: Straight\n"
                                +"\n"
                                +"Color name: Beige\n"
                                +"\n"
                                + "Material:  100% Cotton\n"
                                +"\n"
                                +"Pattern: Plain\n"
                                +"\n"
                                +"Hand Wash");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Pepe' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                                                  //Jeans done 

    }
} 
class Saree extends Fashion
{
  void SareeM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Saree1 s1 = new Saree1();
        Saree2 s2 = new Saree2();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Fashion portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.SWORN Saree\n"
                + "2.Banarasi Soft Silk");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.Saree1M(); // calling AppleM by s1
                break;
            default:
                s2.Saree2M();
                break;
        }
  }
}  
class Saree1 extends Saree {
    void Saree1M()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'SWORN Saari'   \n"
                                +"Here specifications of 'SWORN Saari'\n"
                                +"\n"
                                +"\n"
                                +"Saree Color: Pink | Saree Material: Banarasi Silk | Saree Length: 6.3 meter\n"
                                +"\n"
                                +"Blouse details - Blouse Color: Brown | Blouse Material: Banarasi Silk | Blouse Length: 0.8 metert\n"
                                +"\n"
                                +"Border & Pallu details- Border Color: Multicolor | Border Work Type: Floral | Pallu Color: Brown |Pallu\n"
                                +"\n"
                                + "Wash Care: First Wash Dry Clean Recommended; After That Cold Hand Wash Can Be Done\n"
                                +"\n"
                                +"Weave Type: Ethnic Motifs | Include Components: Saree With Unstitched Blouse Piece\n"
                                +"\n"
                                +"Hand Wash");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order SWORN Saari is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                                                  //Jeans done 

    }
}
class Saree2 extends Saree {
    void Saree2M()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Banarasi Soft Silk'   \n"
                                +"Here specifications of 'Banarasi Soft Silk'\n"
                                +"\n"
                                +"Saree Color: Pink | Saree Material: Banarasi Silk | Saree Length: 6.3 meter\n"
                                +"\n"
                                +"Blouse details - Blouse Color: Brown | Blouse Material: Banarasi Silk | Blouse Length: 0.8 metert\n"
                                +"\n"
                                +"Border & Pallu details- Border Color: Multicolor | Border Work Type: Floral | Pallu Color: Brown |Pallu\n"
                                +"\n"
                                + "Wash Care: First Wash Dry Clean Recommended; After That Cold Hand Wash Can Be Done\n"
                                +"\n"
                                +"Weave Type: Ethnic Motifs | Include Components: Saree With Unstitched Blouse Piece\n"
                                +"\n"
                                +"Style : The Texture And Weight Of The Saree Brings Image Prints One Step Closer To The Originals And Invites Attention\n"
                                +"\n"
                                +"Price : 10.999/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Banarasi Soft Silk' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                                                  //Jeans done 

    }
}  
class Appliances extends Products
{
	void AppliancesMethod() {
		Scanner sc = new Scanner(System.in);
		int sc1;
		Televisions TelevisionsObj = new Televisions();         //creating object
		Washing_Machines Washing_MachinesObj = new Washing_Machines();
		Refrigerators RefrigeratorsObj = new Refrigerators();
		AC ACObj = new AC();  
		System.out.println("Welcome to Appliances portal\n"
				+ "Select one of these products to buy\n"
				+"\n"
				+ "1.Televisions\n"
				+ "2.Washing Machines\n"
				+ "3.Refrigerators\n"
				+ "4.Air Conditioners\n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			TelevisionsObj.TelevisionsM(); 
			break;
		case 2:
			Washing_MachinesObj.Washing_MachinesM(); 
			break;
		case 3:
			RefrigeratorsObj.RefrigeratorsM(); 
			break;
		default:
			ACObj.ACM();
			break;
		}

	}
}
class Televisions extends Appliances
{
	void TelevisionsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Redmi s1 = new Redmi();
		LG s2 = new LG();
		Sonyy s3 = new Sonyy();
		Samsung s4 = new Samsung();
		Acerr s5 = new Acerr();
		// Samsung s2 = new Samsung(); // creating object
		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Redmi\n"
				+ "2.LG"
				+ "3.Sony"
				+ "4.Samsung"
				+ "5.Acer");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.RedmiM();
			break;
		case 2:
			s2.LGM();
			break;
		case 3:
			s3.SonyyM();
			break;
		case 4:
			s4.SamsungM();
			break;
		default:
			s5.AcerrM();
			break;
		}
	}
}  
class Redmi extends Televisions {
	void RedmiM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("    'Redmi Ready Smart LED Fire Tv'   \n"
				+"Here specifications of 'Redmi Ready Smart LED Fire Tv'\n"
				+"\n"
				+"\n"
				+"Resolution: 4K Ultra HD (3840x2160) Resolution\n"
				+"\n"
				+"Refresh Rate :60 Hertz | 178 Degree wide viewing angle\n"
				+"\n"
				+"Connectivity: Dual-band Wi-Fi | Bluetooth 5.0 | 3 HDMI ports to connect latest gaming consoles, set top box, Blu-ray Players\n"
				+"\n"
				+"Sound: 30 Watts Output | Dolby Audio \n"
				+"\n"
				+"Smart TV Features :Android TV 10, PatchWall 4 with IMDb integration | Quad core processor, Built-in Wi-Fi, Chromecast built-in, Ok Google, Auto Low Latency Mode\n"
				+"\n"
				+"Display: 4K LED Panel | Dolby Vision | HDR10 | HLG | Reality Flow | Vivid Picture Engine | MEMC\n"
				+"\n"
				+"Warranty Information: 1 year comprehensive warranty on product and 1 year additional on Panel provided by the brand from the date of purchase\n"
				+"\n"
				+"Price : 21999/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Redmi Ready Smart LED Fire Tv is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			TelevisionsM();
		}


	}
}
class LG extends Televisions {
	void LGM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" LG Ready Smart LED   \n"
				+"Here specifications of 'LG Ready Smart LED'\n"
				+"\n"
				+"\n"
				+"Resolution: 4K Ultra HD (3840x2160) Resolution\n"
				+"\n"
				+"Refresh Rate :60 Hertz | 178 Degree wide viewing angle\n"
				+"\n"
				+"Connectivity: Dual-band Wi-Fi | Bluetooth 5.0 | 3 HDMI ports to connect latest gaming consoles, set top box, Blu-ray Players\n"
				+"\n"
				+"Sound: 30 Watts Output | Dolby Audio \n"
				+"\n"
				+"Smart TV Features :Android TV 10, PatchWall 4 with IMDb integration | Quad core processor, Built-in Wi-Fi, Chromecast built-in, Ok Google, Auto Low Latency Mode\n"
				+"\n"
				+"Display: 4K LED Panel | Dolby Vision | HDR10 | HLG | Reality Flow | Vivid Picture Engine | MEMC\n"
				+"\n"
				+"Warranty Information: 1 year comprehensive warranty on product and 1 year additional on Panel provided by the brand from the date of purchase\n"
				+"\n"
				+"Price : 21999/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order LG Ready Smart LED is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			TelevisionsM();
		}


	}
}
class Sonyy extends Televisions {
	void SonyyM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Sony Bravia Ultra HD LED  \n"
				+"Here specifications of 'Sony Bravia Ultra HD LED'\n"
				+"\n"
				+"\n"
				+"Resolution: 4K Ultra HD (3840x2160) Resolution\n"
				+"\n"
				+"Refresh Rate :60 Hertz | 178 Degree wide viewing angle\n"
				+"\n"
				+"Connectivity: Dual-band Wi-Fi | Bluetooth 5.0 | 3 HDMI ports to connect latest gaming consoles, set top box, Blu-ray Players\n"
				+"\n"
				+"Sound: 30 Watts Output | Dolby Audio \n"
				+"\n"
				+"Smart TV Features :Android TV 10, PatchWall 4 with IMDb integration | Quad core processor, Built-in Wi-Fi, Chromecast built-in, Ok Google, Auto Low Latency Mode\n"
				+"\n"
				+"Display: 4K LED Panel | Dolby Vision | HDR10 | HLG | Reality Flow | Vivid Picture Engine | MEMC\n"
				+"\n"
				+"Warranty Information: 1 year comprehensive warranty on product and 1 year additional on Panel provided by the brand from the date of purchase\n"
				+"\n"
				+"Price : 21999/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Sony Bravia Ultra HD LED is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			TelevisionsM();
		}


	}
}
class Samsung extends Televisions {
	void SamsungM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Samsung Wondertainment Series HD Ready LED Smart Tv \n"
				+"Here specifications of 'Samsung Wondertainment Series HD Ready LED Smart Tv'\n"
				+"\n"
				+"\n"
				+"Resolution: 4K Ultra HD (3840x2160) Resolution\n"
				+"\n"
				+"Refresh Rate :60 Hertz | 178 Degree wide viewing angle\n"
				+"\n"
				+"Connectivity: Dual-band Wi-Fi | Bluetooth 5.0 | 3 HDMI ports to connect latest gaming consoles, set top box, Blu-ray Players\n"
				+"\n"
				+"Sound: 30 Watts Output | Dolby Audio \n"
				+"\n"
				+"Smart TV Features :Android TV 10, PatchWall 4 with IMDb integration | Quad core processor, Built-in Wi-Fi, Chromecast built-in, Ok Google, Auto Low Latency Mode\n"
				+"\n"
				+"Display: 4K LED Panel | Dolby Vision | HDR10 | HLG | Reality Flow | Vivid Picture Engine | MEMC\n"
				+"\n"
				+"Warranty Information: 1 year comprehensive warranty on product and 1 year additional on Panel provided by the brand from the date of purchase\n"
				+"\n"
				+"Price : 21999/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Samsung Wondertainment Series HD Ready LED Smart Tv is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			TelevisionsM();
		}


	}
}
class Acerr extends Televisions {
	void AcerrM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Acer Series HD Ready LED Android Tv \n"
				+"Here specifications of 'Acer Series HD Ready LED Android Tv'\n"
				+"\n"
				+"\n"
				+"Resolution: 4K Ultra HD (3840x2160) Resolution\n"
				+"\n"
				+"Refresh Rate :60 Hertz | 178 Degree wide viewing angle\n"
				+"\n"
				+"Connectivity: Dual-band Wi-Fi | Bluetooth 5.0 | 3 HDMI ports to connect latest gaming consoles, set top box, Blu-ray Players\n"
				+"\n"
				+"Sound: 30 Watts Output | Dolby Audio \n"
				+"\n"
				+"Smart TV Features :Android TV 10, PatchWall 4 with IMDb integration | Quad core processor, Built-in Wi-Fi, Chromecast built-in, Ok Google, Auto Low Latency Mode\n"
				+"\n"
				+"Display: 4K LED Panel | Dolby Vision | HDR10 | HLG | Reality Flow | Vivid Picture Engine | MEMC\n"
				+"\n"
				+"Warranty Information: 1 year comprehensive warranty on product and 1 year additional on Panel provided by the brand from the date of purchase\n"
				+"\n"
				+"Price : 21999/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Acer Series HD Ready LED Android Tv is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			TelevisionsM();
		}


	}
}
class Washing_Machines extends Appliances
{
	void Washing_MachinesM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Whirlpool s1 = new Whirlpool();
		LGG s2 = new LGG();
		Panasonic s3 = new Panasonic();
		Samsungg s4 = new Samsungg();
		Haier s5 = new Haier();
		// Samsung s2 = new Samsung(); // creating object
		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Whirlpool\n"
				+ "2.LGG"
				+ "3.Panasonic"
				+ "4.Samsungg"
				+ "5.Haier");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.WhirlpoolM();
			break;
		case 2:
			s2.LGGM();
			break;
		case 3:
			s3.PanasonicM();
			break;
		case 4:
			s4.SamsunggM();
			break;
		default:
			s5.HaierM();
			break;
		}
	}
} 
class Whirlpool extends Washing_Machines {
	void WhirlpoolM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Whirlpool In-Built Heater Fully Automatic Top Load WM \n"
				+"Here specifications of 'Whirlpool In-Built Heater Fully Automatic Top Load WM'\n"
				+"\n"
				+"\n"
				+"Fully-automatic top load washing machine : Affordable with best wash quality and easy to use with In-Built Heater\n"
				+"\n"
				+"Capacity 7.5 kg :Suitable for 3 – 4 members per wash\n"
				+"\n"
				+"Energy Rating : 5 Star - Best in class efficiency, Annual energy consumption of 1300 Kilowatt Hours Per Year\n"
				+"\n"
				+"Motor : 740 RPM ; Higher spin speed helps in faster drying \n"
				+"\n"
				+"Wash Programs : 12 Wash Programs – Daily | Heavy | Delicate | Whites | Stainwash | Anti-Bac | Woollens | Bedsheet | Eco Wash | Rinse + Dry | Dry Only | Wash Only\n"
				+"\n"
				+"Key Performance Features : 3 Hot Water Modes | ZPF Technology | In-Built Heater | Removes 50 Tough stains | 6th sense Technology\n"
				+"\n"
				+"Additional Features : Dleay Wash | Dynamix | Sipro Wash | Auto Tub Clean | Express Wash | Removes 48 Hour Old Stains\n"
				+"\n"
				+"Price : 17999/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Whirlpool In-Built Heater Fully Automatic Top Load WM is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Washing_MachinesM();
		}


	}
}
class LGG extends Washing_Machines {
	void LGGM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" LG Star Inverter TurboDrum Fully Automatic Top Loading Washing Machine \n"
				+"Here specifications of 'LG Star Inverter TurboDrum Fully Automatic Top Loading Washing Machine'\n"
				+"\n"
				+"\n"
				+"Fully-automatic top load washing machine : Affordable with best wash quality and easy to use with In-Built Heater\n"
				+"\n"
				+"Capacity 7.5 kg :Suitable for 3 – 4 members per wash\n"
				+"\n"
				+"Energy Rating : 5 Star - Best in class efficiency, Annual energy consumption of 1300 Kilowatt Hours Per Year\n"
				+"\n"
				+"Motor : 740 RPM ; Higher spin speed helps in faster drying \n"
				+"\n"
				+"Wash Programs : 12 Wash Programs – Daily | Heavy | Delicate | Whites | Stainwash | Anti-Bac | Woollens | Bedsheet | Eco Wash | Rinse + Dry | Dry Only | Wash Only\n"
				+"\n"
				+"Key Performance Features : 3 Hot Water Modes | ZPF Technology | In-Built Heater | Removes 50 Tough stains | 6th sense Technology\n"
				+"\n"
				+"Additional Features : Dleay Wash | Dynamix | Sipro Wash | Auto Tub Clean | Express Wash | Removes 48 Hour Old Stains\n"
				+"\n"
				+"Price : 19490/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order LG Star Inverter TurboDrum Fully Automatic Top Loading Washing Machine is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Washing_MachinesM();
		}


	}
}
class Panasonic extends Washing_Machines {
	void PanasonicM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Panasonic Star Inverter Fully Automatic Top Loading Washing Machine \n"
				+"Here specifications of 'Panasonic Star Inverter Fully Automatic Top Loading Washing Machine'\n"
				+"\n"
				+"\n"
				+"Fully-automatic top load washing machine : Affordable with best wash quality and easy to use with In-Built Heater\n"
				+"\n"
				+"Capacity 7.5 kg :Suitable for 3 – 4 members per wash\n"
				+"\n"
				+"Energy Rating : 5 Star - Best in class efficiency, Annual energy consumption of 1300 Kilowatt Hours Per Year\n"
				+"\n"
				+"Motor : 740 RPM ; Higher spin speed helps in faster drying \n"
				+"\n"
				+"Wash Programs : 12 Wash Programs – Daily | Heavy | Delicate | Whites | Stainwash | Anti-Bac | Woollens | Bedsheet | Eco Wash | Rinse + Dry | Dry Only | Wash Only\n"
				+"\n"
				+"Key Performance Features : 3 Hot Water Modes | ZPF Technology | In-Built Heater | Removes 50 Tough stains | 6th sense Technology\n"
				+"\n"
				+"Additional Features : Dleay Wash | Dynamix | Sipro Wash | Auto Tub Clean | Express Wash | Removes 48 Hour Old Stains\n"
				+"\n"
				+"Price : 19490/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Panasonic Star Inverter Fully Automatic Top Loading Washing Machine is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Washing_MachinesM();
		}


	}
}
class Samsungg extends Washing_Machines {
	void SamsunggM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("  Samsung Star AI Control & Wi-Fi, Fully-Automatic Front Loading Washing Machine \n"
				+"Here specifications of ' Samsung Star AI Control & Wi-Fi, Fully-Automatic Front Loading Washing Machine'\n"
				+"\n"
				+"\n"
				+"Fully-automatic top load washing machine : Affordable with best wash quality and easy to use with In-Built Heater\n"
				+"\n"
				+"Capacity 7.5 kg :Suitable for 3 – 4 members per wash\n"
				+"\n"
				+"Energy Rating : 5 Star - Best in class efficiency, Annual energy consumption of 1300 Kilowatt Hours Per Year\n"
				+"\n"
				+"Motor : 740 RPM ; Higher spin speed helps in faster drying \n"
				+"\n"
				+"Wash Programs : 12 Wash Programs – Daily | Heavy | Delicate | Whites | Stainwash | Anti-Bac | Woollens | Bedsheet | Eco Wash | Rinse + Dry | Dry Only | Wash Only\n"
				+"\n"
				+"Key Performance Features : 3 Hot Water Modes | ZPF Technology | In-Built Heater | Removes 50 Tough stains | 6th sense Technology\n"
				+"\n"
				+"Additional Features : Dleay Wash | Dynamix | Sipro Wash | Auto Tub Clean | Express Wash | Removes 48 Hour Old Stains\n"
				+"\n"
				+"Price : 19490/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Samsung Star AI Control & Wi-Fi, Fully-Automatic Front Loading Washing Machine is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Washing_MachinesM();
		}


	}
}
class Haier extends Washing_Machines {
	void HaierM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("  Haier Star Oceanus Wave Drum Fully Automatic Top load Washing Machine \n"
				+"Here specifications of ' Haier Star Oceanus Wave Drum Fully Automatic Top load Washing Machine'\n"
				+"\n"
				+"\n"
				+"Fully-automatic top load washing machine : Affordable with best wash quality and easy to use with In-Built Heater\n"
				+"\n"
				+"Capacity 7.5 kg :Suitable for 3 – 4 members per wash\n"
				+"\n"
				+"Energy Rating : 5 Star - Best in class efficiency, Annual energy consumption of 1300 Kilowatt Hours Per Year\n"
				+"\n"
				+"Motor : 740 RPM ; Higher spin speed helps in faster drying \n"
				+"\n"
				+"Wash Programs : 12 Wash Programs – Daily | Heavy | Delicate | Whites | Stainwash | Anti-Bac | Woollens | Bedsheet | Eco Wash | Rinse + Dry | Dry Only | Wash Only\n"
				+"\n"
				+"Key Performance Features : 3 Hot Water Modes | ZPF Technology | In-Built Heater | Removes 50 Tough stains | 6th sense Technology\n"
				+"\n"
				+"Additional Features : Dleay Wash | Dynamix | Sipro Wash | Auto Tub Clean | Express Wash | Removes 48 Hour Old Stains\n"
				+"\n"
				+"Price : 19490/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Samsung Star AI Control & Wi-Fi, Fully-Automatic Front Loading Washing Machine is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Washing_MachinesM();
		}


	}
}
class Refrigerators extends Appliances
{
	void RefrigeratorsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		LGGG s1 = new LGGG();
		Samsunggg s2 = new Samsunggg();
		Haierr s3 = new Haierr();
		Whirlpooll s4 = new Whirlpooll();
		Godrej s5 = new Godrej();

		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.LG\n"
				+"\n"
				+ "2.Samsung\n"
				+"\n"
				+ "3.Haier \n"
				+"\n"
				+ "4.Samsung \n"
				+"\n"
				+ "5.Acer \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.LGGGM();
			break;
		case 2:
			s2.SamsungggM();
			break;
		case 3:
			s3.HaierrM();
			break;
		case 4:
			s4.WhirlpoollM();
			break;
		default:
			s5.GodrejM();
			break;
		}
	}
} 
class LGGG extends Refrigerators {
	void LGGGM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("  LG 224 L 4 Star Inverter Direct-Cool Single Door Refrigerator \n"
				+"Here specifications of ' LG 224 L 4 Star Inverter Direct-Cool Single Door Refrigerator'\n"
				+"\n"
				+"\n"
				+"Frost Free Refrigerator: Auto defrost function to prevent ice build-up\r\n"
				+ "\n"
				+"\n"
				+"Capacity 240 Litres: Suitable for families with 2 to 3 members or bachelors | Freezer Capacity: 57 Ltr , Fresh Food Capacity: 183 Ltr\n"
				+"\n"
				+"Energy Rating :  2 Stars - Energy Efficiency\n"
				+"\n"
				+"Manufacturer Warranty: 1 year on product, 10 years on compressor. \n"
				+"\n"
				+"Storage or Interior description : 183 Ltr | Freezer capacity : 57 Ltr |drawers : 1, shelves : 3|\n"
				+"\n"
				+"Special Features: 5-in-1 Convertible Mode, Vegetable Box, Toughened Glass Shelves, Connect Home Inverter, Anti-bacterial Gasket\n"
				+"\n"
				+"Item Dimensions: 61.5x54.8x156(LxWxH) | Weight : 53Kg\n"
				+"\n"
				+"Price : 20990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order LG 224 L 4 Star Inverter Direct-Cool Single Door Refrigerator is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			RefrigeratorsM();
		}


	}
}
class Samsunggg extends Refrigerators {
	void SamsungggM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("  Samsung Frost Free Convertible 5In1, Digital Inverter Refrigerator\n"
				+"Here specifications of ' Samsung Frost Free Convertible 5In1, Digital Inverter Refrigerator'\n"
				+"\n"
				+"\n"
				+"Frost Free Refrigerator: Auto defrost function to prevent ice build-up\r\n"
				+ "\n"
				+"\n"
				+"Capacity 240 Litres: Suitable for families with 2 to 3 members or bachelors | Freezer Capacity: 57 Ltr , Fresh Food Capacity: 183 Ltr\n"
				+"\n"
				+"Energy Rating :  2 Stars - Energy Efficiency\n"
				+"\n"
				+"Manufacturer Warranty: 1 year on product, 10 years on compressor. \n"
				+"\n"
				+"Storage or Interior description : 183 Ltr | Freezer capacity : 57 Ltr |drawers : 1, shelves : 3|\n"
				+"\n"
				+"Special Features: 5-in-1 Convertible Mode, Vegetable Box, Toughened Glass Shelves, Connect Home Inverter, Anti-bacterial Gasket\n"
				+"\n"
				+"Item Dimensions: 61.5x54.8x156(LxWxH) | Weight : 53Kg\n"
				+"\n"
				+"Price : 20990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Samsung Frost Free Convertible 5In1, Digital Inverter  Refrigerator is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			RefrigeratorsM();
		}


	}
}

class Haierr extends Refrigerators {
	void HaierrM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("  Haier 240L 2 Star Frost Free Double Door Top Mount Refrigerator \n"
				+"Here specifications of ' Haier 240L 2 Star Frost Free Double Door Top Mount Refrigerator'\n"
				+"\n"
				+"\n"
				+"Frost Free Refrigerator: Auto defrost function to prevent ice build-up\r\n"
				+ "\n"
				+"\n"
				+"Capacity 240 Litres: Suitable for families with 2 to 3 members or bachelors | Freezer Capacity: 57 Ltr , Fresh Food Capacity: 183 Ltr\n"
				+"\n"
				+"Energy Rating :  2 Stars - Energy Efficiency\n"
				+"\n"
				+"Manufacturer Warranty: 1 year on product, 10 years on compressor. \n"
				+"\n"
				+"Storage or Interior description : 183 Ltr | Freezer capacity : 57 Ltr |drawers : 1, shelves : 3|\n"
				+"\n"
				+"Special Features: 5-in-1 Convertible Mode, Vegetable Box, Toughened Glass Shelves, Connect Home Inverter, Anti-bacterial Gasket\n"
				+"\n"
				+"Item Dimensions: 61.5x54.8x156(LxWxH) | Weight : 53Kg\n"
				+"\n"
				+"Price : 20990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Haier 240L 2 Star Frost Free Double Door Top Mount Refrigerator is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			RefrigeratorsM();
		}


	}
}
class Whirlpooll extends Refrigerators {
	void WhirlpoollM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("  Whirlpool 184 L 2 Star Direct-Cool Single Door Refrigerator\n"
				+"Here specifications of ' Whirlpool 184 L 2 Star Direct-Cool Single Door Refrigerator'\n"
				+"\n"
				+"\n"
				+"Frost Free Refrigerator: Auto defrost function to prevent ice build-up\r\n"
				+ "\n"
				+"\n"
				+"Capacity 240 Litres: Suitable for families with 2 to 3 members or bachelors | Freezer Capacity: 57 Ltr , Fresh Food Capacity: 183 Ltr\n"
				+"\n"
				+"Energy Rating :  2 Stars - Energy Efficiency\n"
				+"\n"
				+"Manufacturer Warranty: 1 year on product, 10 years on compressor. \n"
				+"\n"
				+"Storage or Interior description : 183 Ltr | Freezer capacity : 57 Ltr |drawers : 1, shelves : 3|\n"
				+"\n"
				+"Special Features: 5-in-1 Convertible Mode, Vegetable Box, Toughened Glass Shelves, Connect Home Inverter, Anti-bacterial Gasket\n"
				+"\n"
				+"Item Dimensions: 61.5x54.8x156(LxWxH) | Weight : 53Kg\n"
				+"\n"
				+"Price : 20990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Whirlpool 184 L 2 Star Direct-Cool Single Door Refrigerator is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			RefrigeratorsM();
		}


	}
}
class Godrej extends Refrigerators {
	void GodrejM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Godrej 202 L 5 Star Advanced Inverter, Jumbo Vegetable Tray Direct Cool Single Door Refrigerator\n"
				+"Here specifications of ' Godrej 5 Star Advanced Inverter, Jumbo Vegetable Tray Direct Cool Single Door Refrigerator'\n"
				+"\n"
				+"\n"
				+"Frost Free Refrigerator: Auto defrost function to prevent ice build-up\r\n"
				+ "\n"
				+"\n"
				+"Capacity 240 Litres: Suitable for families with 2 to 3 members or bachelors | Freezer Capacity: 57 Ltr , Fresh Food Capacity: 183 Ltr\n"
				+"\n"
				+"Energy Rating :  2 Stars - Energy Efficiency\n"
				+"\n"
				+"Manufacturer Warranty: 1 year on product, 10 years on compressor. \n"
				+"\n"
				+"Storage or Interior description : 183 Ltr | Freezer capacity : 57 Ltr |drawers : 1, shelves : 3|\n"
				+"\n"
				+"Special Features: 5-in-1 Convertible Mode, Vegetable Box, Toughened Glass Shelves, Connect Home Inverter, Anti-bacterial Gasket\n"
				+"\n"
				+"Item Dimensions: 61.5x54.8x156(LxWxH) | Weight : 53Kg\n"
				+"\n"
				+"Price : 20990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Godrej 5 Star Advanced Inverter, Jumbo Vegetable Tray Direct Cool Single Door Refrigerator is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			RefrigeratorsM();
		}


	}
}
class AC extends Appliances
{
	void ACM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Voltas s1 = new Voltas();
		Lloyd s2 = new Lloyd();
		Panasonicc s3 = new Panasonicc();
		Carrier s4 = new Carrier();
		Hitachi s5 = new Hitachi();

		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Voltas\n"
				+"\n"
				+ "2.Lloyd\n"
				+"\n"
				+ "3.Panasonic \n"
				+"\n"
				+ "4.Carrier \n"
				+"\n"
				+ "5.Hitachi \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.VoltasM();
			break;
		case 2:
			s2.LloydM();
			break;
		case 3:
			s3.PanasoniccM();
			break;
		case 4:
			s4.CarrierM();
			break;
		default:
			s5.HitachiM();
			break;
		}
	}
} 
class Voltas extends AC {
	void VoltasM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Voltas 1.4 Ton 3 Star Inverter Split AC\n"
				+"Here specifications of ' Voltas 1.4 Ton 3 Star Inverter Split AC'\n"
				+"\n"
				+"\n"
				+"Split AC with inverter compressor: Variable speed compressor which adjusts power depending on heat load.\r\n"
				+ "\n"
				+"\n"
				+"Capacity: 1.4 Ton Suitable for medium sized rooms\n"
				+"\n"
				+"Energy Rating : 3 Star. Annual Energy Consumption: 4600 units. ISEER Value: 3.81\n"
				+"\n"
				+"Warranty: 1 Year Comprehensive Warranty on the Product and 10 Years on Compressor \n"
				+"\n"
				+"Copper Condenser Coil: Better cooling and requires low maintenance\n"
				+"\n"
				+"Special Features: Stabilizer free operation within 110 - 285 voltage range\n"
				+"\n"
				+"Price : 31990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Voltas 1.4 Ton 3 Star Inverter Split AC is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			ACM();
		}


	}
}
class Lloyd extends AC {
	void LloydM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Lloyd 1.5 Ton 3 Star Inverter Split AC\n"
				+"Here specifications of ' Lloyd 1.5 Ton 3 Star Inverter Split AC'\n"
				+"\n"
				+"\n"
				+"Split AC with inverter compressor: Variable speed compressor which adjusts power depending on heat load.\r\n"
				+ "\n"
				+"\n"
				+"Capacity: 1.4 Ton Suitable for medium sized rooms\n"
				+"\n"
				+"Energy Rating : 3 Star. Annual Energy Consumption: 4600 units. ISEER Value: 3.81\n"
				+"\n"
				+"Warranty: 1 Year Comprehensive Warranty on the Product and 10 Years on Compressor \n"
				+"\n"
				+"Copper Condenser Coil: Better cooling and requires low maintenance\n"
				+"\n"
				+"Special Features: Stabilizer free operation within 110 - 285 voltage range\n"
				+"\n"
				+"Price : 31990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Lloyd 1.5 Ton 3 Star Inverter Split AC is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			ACM();
		}


	}
}
class Panasonicc extends AC {
	void PanasoniccM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Panasonic 1.5 Ton 5 Star Wi-Fi Inverter Smart Split AC \n"
				+"Here specifications of ' Panasonic 1.5 Ton 5 Star Wi-Fi Inverter Smart Split AC '\n"
				+"\n"
				+"\n"
				+"Split AC with inverter compressor: Variable speed compressor which adjusts power depending on heat load.\r\n"
				+ "\n"
				+"\n"
				+"Capacity: 1.4 Ton Suitable for medium sized rooms\n"
				+"\n"
				+"Energy Rating : 3 Star. Annual Energy Consumption: 4600 units. ISEER Value: 3.81\n"
				+"\n"
				+"Warranty: 1 Year Comprehensive Warranty on the Product and 10 Years on Compressor \n"
				+"\n"
				+"Copper Condenser Coil: Better cooling and requires low maintenance\n"
				+"\n"
				+"Special Features: Stabilizer free operation within 110 - 285 voltage range\n"
				+"\n"
				+"Price : 31990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Panasonic 1.5 Ton 5 Star Wi-Fi Inverter Smart Split AC  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			ACM();
		}


	}
}
class Carrier extends AC {
	void CarrierM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Carrier 1.5 Ton 3 Star AI Flexicool Inverter Split AC \n"
				+"Here specifications of ' Carrier 1.5 Ton 3 Star AI Flexicool Inverter Split AC '\n"
				+"\n"
				+"\n"
				+"Split AC with inverter compressor: Variable speed compressor which adjusts power depending on heat load.\r\n"
				+ "\n"
				+"\n"
				+"Capacity: 1.4 Ton Suitable for medium sized rooms\n"
				+"\n"
				+"Energy Rating : 3 Star. Annual Energy Consumption: 4600 units. ISEER Value: 3.81\n"
				+"\n"
				+"Warranty: 1 Year Comprehensive Warranty on the Product and 10 Years on Compressor \n"
				+"\n"
				+"Copper Condenser Coil: Better cooling and requires low maintenance\n"
				+"\n"
				+"Special Features: Stabilizer free operation within 110 - 285 voltage range\n"
				+"\n"
				+"Price : 31990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Carrier 1.5 Ton 3 Star AI Flexicool Inverter Split AC  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			ACM();
		}


	}
}
class Hitachi extends AC {
	void HitachiM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Hitachi 1.5 Ton 5 Star ice Clean Xpandable Plus Inverter Split AC \n"
				+"Here specifications of ' Hitachi 1.5 Ton 5 Star ice Clean Xpandable Plus Inverter Split AC '\n"
				+"\n"
				+"\n"
				+"Split AC with inverter compressor: Variable speed compressor which adjusts power depending on heat load.\r\n"
				+ "\n"
				+"\n"
				+"Capacity: 1.4 Ton Suitable for medium sized rooms\n"
				+"\n"
				+"Energy Rating : 3 Star. Annual Energy Consumption: 4600 units. ISEER Value: 3.81\n"
				+"\n"
				+"Warranty: 1 Year Comprehensive Warranty on the Product and 10 Years on Compressor \n"
				+"\n"
				+"Copper Condenser Coil: Better cooling and requires low maintenance\n"
				+"\n"
				+"Special Features: Stabilizer free operation within 110 - 285 voltage range\n"
				+"\n"
				+"Price : 31990/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Hitachi 1.5 Ton 5 Star ice Clean Xpandable Plus Inverter Split AC  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			ACM();
		}


	}
}
class Furniture extends Products
{
	void FurnitureM() {
		Scanner sc = new Scanner(System.in);
		int sc1;      
		Mattresses s1 = new Mattresses();
		Wardrobes  s2 = new Wardrobes();
		Office_Chairs s3 = new Office_Chairs();
		Beds s4  = new Beds(); 

		System.out.println("Welcome to Electronics portal\n"
				+ "Select one of these products to buy\n"
				+"\n"
				+ "1. Mattresses\n"
				+"\n"
				+ "2. Wardrobes\n"
				+"\n"
				+ "3. Office Chairs\n"
				+"\n"
				+ "4. Beds \n"
				+"\n"
				);
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.MattressesM();  
			break;
		case 2:
			s2.WardrobesM(); 
			break;
		case 3:
			s3.Office_ChairsM(); 
			break;
		default:
			s4.BedsM();
			break;
		}

	}
}
class Mattresses extends Furniture
{
	void MattressesM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Sleepwell s1 = new Sleepwell();
		Wakefit s2 = new Wakefit();
		Duroflex s3 = new Duroflex();
		Springtek s4 = new Springtek();
		Doctor_Dreams s5 = new Doctor_Dreams();

		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Sleepwell\n"
				+"\n"
				+ "2.Wakefit\n"
				+"\n"
				+ "3.Duroflex \n"
				+"\n"
				+ "4.Springtek \n"
				+"\n"
				+ "5.Doctor Dreams \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.SleepwellM();
			break;
		case 2:
			s2.WakefitM();
			break;
		case 3:
			s3.DuroflexM();
			break;
		case 4:
			s4.SpringtekM();
			break;
		default:
			s5.Doctor_DreamsM();
			break;
		}
	}
}
class Sleepwell extends Mattresses {
	void SleepwellM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sleepwell Mattress Dual PRO Profiled Foam Reversible 5-inch Single Bed \n"
				+"Here specifications of ' Sleepwell Mattress Dual PRO Profiled Foam Reversible 5-inch Single Bed '\n"
				+"\n"
				+"\n"
				+"Product Dimensions: 182.9 cms (Length) x 88.9 cms (Breadth) x 12.5 cms (Thickness)- 72x35x5 inches\r\n"
				+ "\n"
				+"\n"
				+"Color: Charcoal Grey and Grey, Mattress Feel : One side gentle and other side is firm feel.\n"
				+"\n"
				+"Reversible: Usable on both sides. Firm feel on Charcoal Grey side and Gentle feel on other Light Grey side.\n"
				+"\n"
				+"Features:  Washable Zipper Cover- 100% hygienic, 31 Nights Trial, Healthy breathability, Distributed pressure relief & enhanced air circulation \n"
				+"\n"
				+"Warranty :  5 Years Manufacturer warranty. Make to Order- Direct from Factory\n"
				+"\n"
				+"Price : 5000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Sleepwell Mattress Dual PRO Profiled Foam Reversible 5-inch Single Bed  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			MattressesM();
		}


	}
}
class Wakefit extends Mattresses {
	void WakefitM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Wakefit Orthopedic Mattress, Mattress Double Bed \n"
				+"Here specifications of ' Wakefit Orthopedic Mattress, Mattress Double Bed '\n"
				+"\n"
				+"\n"
				+"Product Dimensions: 182.9 cms (Length) x 88.9 cms (Breadth) x 12.5 cms (Thickness)- 72x35x5 inches\r\n"
				+ "\n"
				+"\n"
				+"Color: Charcoal Grey and Grey, Mattress Feel : One side gentle and other side is firm feel.\n"
				+"\n"
				+"Reversible: Usable on both sides. Firm feel on Charcoal Grey side and Gentle feel on other Light Grey side.\n"
				+"\n"
				+"Features:  Washable Zipper Cover- 100% hygienic, 31 Nights Trial, Healthy breathability, Distributed pressure relief & enhanced air circulation \n"
				+"\n"
				+"Warranty :  5 Years Manufacturer warranty. Make to Order- Direct from Factory\n"
				+"\n"
				+"Price : 5000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Wakefit Orthopedic Mattress, Mattress Double Bed  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			MattressesM();
		}


	}
}
class Duroflex extends Mattresses {
	void DuroflexM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Duroflex LiveIn Duropedic - Doctor Recommended Orthopaedic High Resilient \n"
				+"Here specifications of ' Duroflex LiveIn Duropedic - Doctor Recommended Orthopaedic High Resilient '\n"
				+"\n"
				+"\n"
				+"Product Dimensions: 182.9 cms (Length) x 88.9 cms (Breadth) x 12.5 cms (Thickness)- 72x35x5 inches\r\n"
				+ "\n"
				+"\n"
				+"Color: Charcoal Grey and Grey, Mattress Feel : One side gentle and other side is firm feel.\n"
				+"\n"
				+"Reversible: Usable on both sides. Firm feel on Charcoal Grey side and Gentle feel on other Light Grey side.\n"
				+"\n"
				+"Features:  Washable Zipper Cover- 100% hygienic, 31 Nights Trial, Healthy breathability, Distributed pressure relief & enhanced air circulation \n"
				+"\n"
				+"Warranty :  5 Years Manufacturer warranty. Make to Order- Direct from Factory\n"
				+"\n"
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Duroflex LiveIn Duropedic - Doctor Recommended Orthopaedic High Resilient  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			MattressesM();
		}


	}
}
class Springtek extends Mattresses {
	void SpringtekM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Springtek Amaze Eco 4-Inch Medium Firm \n"
				+"Here specifications of ' Springtek Amaze Eco 4-Inch Medium Firm '\n"
				+"\n"
				+"\n"
				+"Product Dimensions: 182.9 cms (Length) x 88.9 cms (Breadth) x 12.5 cms (Thickness)- 72x35x5 inches\r\n"
				+ "\n"
				+"\n"
				+"Color: Charcoal Grey and Grey, Mattress Feel : One side gentle and other side is firm feel.\n"
				+"\n"
				+"Reversible: Usable on both sides. Firm feel on Charcoal Grey side and Gentle feel on other Light Grey side.\n"
				+"\n"
				+"Features:  Washable Zipper Cover- 100% hygienic, 31 Nights Trial, Healthy breathability, Distributed pressure relief & enhanced air circulation \n"
				+"\n"
				+"Warranty :  5 Years Manufacturer warranty. Make to Order- Direct from Factory\n"
				+"\n"
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Springtek Amaze Eco 4-Inch Medium Firm  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			MattressesM();
		}


	}
}
class Doctor_Dreams extends Mattresses {
	void Doctor_DreamsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Doctor Dreams by Nilkamal Lite Dual Comfort \n"
				+"Here specifications of ' Doctor Dreams by Nilkamal Lite Dual Comfort '\n"
				+"\n"
				+"\n"
				+"Product Dimensions: 182.9 cms (Length) x 88.9 cms (Breadth) x 12.5 cms (Thickness)- 72x35x5 inches\r\n"
				+ "\n"
				+"\n"
				+"Color: Charcoal Grey and Grey, Mattress Feel : One side gentle and other side is firm feel.\n"
				+"\n"
				+"Reversible: Usable on both sides. Firm feel on Charcoal Grey side and Gentle feel on other Light Grey side.\n"
				+"\n"
				+"Features:  Washable Zipper Cover- 100% hygienic, 31 Nights Trial, Healthy breathability, Distributed pressure relief & enhanced air circulation \n"
				+"\n"
				+"Warranty :  5 Years Manufacturer warranty. Make to Order- Direct from Factory\n"
				+"\n"
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order  Doctor Dreams by Nilkamal Lite Dual Comfort  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			MattressesM();
		}


	}
}
class Wardrobes extends Furniture
{
	void WardrobesM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Yale s1 = new Yale();
		Viki_Hinged s2 = new Viki_Hinged();
		Hexagon s3 = new Hexagon();
		DeckUp s4 = new DeckUp();
		Caspian s5 = new Caspian();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Yale\n"
				+"\n"
				+ "2.Viki Hinged\n"
				+"\n"
				+ "3.Hexagon \n"
				+"\n"
				+ "4.DeckUp \n"
				+"\n"
				+ "5.Caspian \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.YaleM();
			break;
		case 2:
			s2.Viki_HingedM();
			break;
		case 3:
			s3.HexagonM();
			break;
		case 4:
			s4.DeckUpM();
			break;
		default:
			s5.CaspianM();
		}
	}
}
class Yale extends Wardrobes {
	void YaleM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Yale Premium Fingerprint Biometric Wardrobe \n"
				+"Here specifications of ' Yale Premium Fingerprint Biometric Wardrobe '\n"
				+"\n"
				+"\n"
				+"Fast Unlock & Auto Lock: Advanced fingerprint/Biometric wardrobe lock with Quick response and sensitivity. Your fingerprints are the only keys! The l\r\n"
				+ "\n"
				+"Item Dimensions: 	30 x 30 x 30 Millimeters\n"
				+"\n"
				+"Material:	Plastic, Zinc\n"
				+"\n"
				+"Users & Access: The cabinet lock can record up to 10 fingerprints which allows the people you trust can also share your access. \n"
				+"\n"
				+"Material: This password lock is made of premium quality zinc alloy material, which ensures that it is strong, precision and safe.\n"
				+"\n"
				
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Yale Premium Fingerprint Biometric Wardrobe  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			WardrobesM();
		}


	}
}
class Viki_Hinged extends Wardrobes {
	void Viki_HingedM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("VIKI HINGED Engineered Wood Wardrobe \n"
				+"Here specifications of ' VIKI HINGED Engineered Wood Wardrobe '\n"
				+"\n"
				+"\n"
				+"Fast Unlock & Auto Lock: Advanced fingerprint/Biometric wardrobe lock with Quick response and sensitivity. Your fingerprints are the only keys! The l\r\n"
				+ "\n"
				+"Item Dimensions: 	30 x 30 x 30 Millimeters\n"
				+"\n"
				+"Material:	Plastic, Zinc\n"
				+"\n"
				+"Users & Access: The cabinet lock can record up to 10 fingerprints which allows the people you trust can also share your access. \n"
				+"\n"
				+"Material: This password lock is made of premium quality zinc alloy material, which ensures that it is strong, precision and safe.\n"
				+"\n"
				
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order VIKI HINGED Engineered Wood Wardrobe  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			WardrobesM();
		}


	}
}
class Hexagon extends Wardrobes {
	void HexagonM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hexagon Furnitures 4 Door Wardrobe \n"
				+"Here specifications of ' Hexagon Furnitures 4 Door Wardrobe '\n"
				+"\n"
				+"\n"
				+"Fast Unlock & Auto Lock: Advanced fingerprint/Biometric wardrobe lock with Quick response and sensitivity. Your fingerprints are the only keys! The l\r\n"
				+ "\n"
				+"Item Dimensions: 	30 x 30 x 30 Millimeters\n"
				+"\n"
				+"Material:	Plastic, Zinc\n"
				+"\n"
				+"Users & Access: The cabinet lock can record up to 10 fingerprints which allows the people you trust can also share your access. \n"
				+"\n"
				+"Material: This password lock is made of premium quality zinc alloy material, which ensures that it is strong, precision and safe.\n"
				+"\n"
				
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Hexagon Furnitures 4 Door Wardrobe is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			WardrobesM();
		}


	}
}
class DeckUp extends Wardrobes {
	void DeckUpM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("DeckUp Plank Cove 2-Door Engineered Wood Wardrobe  \n"
				+"Here specifications of ' DeckUp Plank Cove 2-Door Engineered Wood Wardrobe  '\n"
				+"\n"
				+"\n"
				+"Fast Unlock & Auto Lock: Advanced fingerprint/Biometric wardrobe lock with Quick response and sensitivity. Your fingerprints are the only keys! The l\r\n"
				+ "\n"
				+"Item Dimensions: 	30 x 30 x 30 Millimeters\n"
				+"\n"
				+"Material:	Plastic, Zinc\n"
				+"\n"
				+"Users & Access: The cabinet lock can record up to 10 fingerprints which allows the people you trust can also share your access. \n"
				+"\n"
				+"Material: This password lock is made of premium quality zinc alloy material, which ensures that it is strong, precision and safe.\n"
				+"\n"
				
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order DeckUp Plank Cove 2-Door Engineered Wood Wardrobe   is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			WardrobesM();
		}


	}
}
class Caspian extends Wardrobes {
	void CaspianM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("CASPIAN Furniture Wooden 2 Door Wardrobe \n"
				+"Here specifications of ' CASPIAN Furniture Wooden 2 Door Wardrobe'\n"
				+"\n"
				+"\n"
				+"Fast Unlock & Auto Lock: Advanced fingerprint/Biometric wardrobe lock with Quick response and sensitivity. Your fingerprints are the only keys! The l\r\n"
				+ "\n"
				+"Item Dimensions: 	30 x 30 x 30 Millimeters\n"
				+"\n"
				+"Material:	Plastic, Zinc\n"
				+"\n"
				+"Users & Access: The cabinet lock can record up to 10 fingerprints which allows the people you trust can also share your access. \n"
				+"\n"
				+"Material: This password lock is made of premium quality zinc alloy material, which ensures that it is strong, precision and safe.\n"
				+"\n"
				
				+"Price : 10000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order CASPIAN Furniture Wooden 2 Door Wardrobe  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			WardrobesM();
		}


	}
}
class Office_Chairs extends Furniture
{
	void Office_ChairsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Green_Soul s1 = new Green_Soul();
		Cell_Bell s2 = new Cell_Bell();
		Beaatho s3 = new Beaatho();
		Da_Urban s4 = new Da_Urban();
		Innowin s5 = new Innowin();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Green Soul\n"
				+"\n"
				+ "2.CellBell\n"
				+"\n"
				+ "3.BeAAtho \n"
				+"\n"
				+ "4.Da Urban \n"
				+"\n"
				+ "5.Innowin \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.Green_SoulM();
			break;
		case 2:
			s2.Cell_BellM();
			break;
		case 3:
			s3.BeaathoM();
			break;
		case 4:
			s4.Da_UrbanM();
			break;
		default:
			s5.InnowinM();
		}
	}
}
class Green_Soul extends Office_Chairs {
	void Green_SoulM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Green Soul Urbane Premium Leatherette Office Chair \n"
				+"Here specifications of ' Green Soul Urbane Premium Leatherette Office Chair '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Leather\n"
				+"\n"
				+"Product Dimensions: 68D x 32W x 59H Centimeters\n"
				+"\n"
				+"Item Weight: 25 Kilograms\n"
				+"\n"
				+"Superior Luxury and Comfort - The premium luxury PVC leather with sturdy board and sponge make provides unmatched cushion and luxurious comfort during long, intense work hours\n"
				+"\n"
				
				+"Price : 11000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Green Soul Urbane Premium Leatherette Office Chair  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Office_ChairsM();
		}


	}
}
class Cell_Bell extends Office_Chairs {
	void Cell_BellM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("CELLBELL Medium-Back Mesh Office Chair \n"
				+"Here specifications of ' CELLBELL Medium-Back Mesh Office Chair '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Leather\n"
				+"\n"
				+"Product Dimensions: 68D x 32W x 59H Centimeters\n"
				+"\n"
				+"Item Weight: 25 Kilograms\n"
				+"\n"
				+"Superior Luxury and Comfort - The premium luxury PVC leather with sturdy board and sponge make provides unmatched cushion and luxurious comfort during long, intense work hours\n"
				+"\n"
				
				+"Price : 11000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order CELLBELL Medium-Back Mesh Office Chair  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Office_ChairsM();
		}


	}
}
class Beaatho extends Office_Chairs {
	void BeaathoM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("BeAAtho Verona Mesh Mid-Back Ergonomic Desk Office Chair \n"
				+"Here specifications of ' BeAAtho Verona Mesh Mid-Back Ergonomic Desk Office Chair '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Leather\n"
				+"\n"
				+"Product Dimensions: 68D x 32W x 59H Centimeters\n"
				+"\n"
				+"Item Weight: 25 Kilograms\n"
				+"\n"
				+"Superior Luxury and Comfort - The premium luxury PVC leather with sturdy board and sponge make provides unmatched cushion and luxurious comfort during long, intense work hours\n"
				+"\n"
				
				+"Price : 11000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order BeAAtho Verona Mesh Mid-Back Ergonomic Desk Office Chair  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Office_ChairsM();
		}


	}
}
class Da_Urban extends Office_Chairs {
	void Da_UrbanM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Da URBAN Merlion Office Chair  \n"
				+"Here specifications of ' Da URBAN Merlion Office Chair '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Leather\n"
				+"\n"
				+"Product Dimensions: 68D x 32W x 59H Centimeters\n"
				+"\n"
				+"Item Weight: 25 Kilograms\n"
				+"\n"
				+"Superior Luxury and Comfort - The premium luxury PVC leather with sturdy board and sponge make provides unmatched cushion and luxurious comfort during long, intense work hours\n"
				+"\n"
				
				+"Price : 11000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Da URBAN Merlion Office Chair  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Office_ChairsM();
		}


	}
}
class Innowin extends Office_Chairs {
	void InnowinM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("INNOWIN Venture Premium \n"
				+"Here specifications of ' INNOWIN Venture Premium '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Leather\n"
				+"\n"
				+"Product Dimensions: 68D x 32W x 59H Centimeters\n"
				+"\n"
				+"Item Weight: 25 Kilograms\n"
				+"\n"
				+"Superior Luxury and Comfort - The premium luxury PVC leather with sturdy board and sponge make provides unmatched cushion and luxurious comfort during long, intense work hours\n"
				+"\n"
				
				+"Price : 11000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order INNOWIN Venture Premium  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Office_ChairsM();
		}


	}
}
class Beds extends Furniture
{
	void BedsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Godrejj s1 = new Godrejj();
		Moon_Woodern s2 = new Moon_Woodern();
		BlueWud s3 = new BlueWud();
		Doctor_Dreamss s4 = new Doctor_Dreamss();
		Furrino s5 = new Furrino();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Godrej\n"
				+"\n"
				+ "2.Moon Woodern\n"
				+"\n"
				+ "3.BLUE WUD \n"
				+"\n"
				+ "Doctor Dreams \n"
				+"\n"
				+ "5.Furrino \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.GodrejjM();
			break;
		case 2:
			s2.Moon_WoodernM();
			break;
		case 3:
			s3.BlueWudM();
			break;
		case 4:
			s4.Doctor_DreamssM();
			break;
		default:
			s5.FurrinoM();
		}
	}
}
class Godrejj extends Beds {
	void GodrejjM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("GODREJ INTERIO EQ Metal Single Size Bed with Slatted Base \n"
				+"Here specifications of ' GODREJ INTERIO EQ Metal Single Size Bed with Slatted Base '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Metal\n"
				+"\n"
				+"Product Dimensions: 2.05L x 0.97W x 0.72H Meters\n"
				+"\n"
				+"Item Weight: 22 Kilograms\n"
				+"\n"
				+"Compact Design: Its intelligent design does not take up more space while keeping it high on utility!\n"
				+"\n"
				
				+"Price : 12000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order GODREJ INTERIO EQ Metal Single Size Bed with Slatted Base  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BedsM();
		}


	}
}
class Moon_Woodern extends Beds {
	void Moon_WoodernM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("MoonWooden Sheesham Wood Bed  \n"
				+"Here specifications of ' MoonWooden Sheesham Wood Bed  '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Metal\n"
				+"\n"
				+"Product Dimensions: 2.05L x 0.97W x 0.72H Meters\n"
				+"\n"
				+"Item Weight: 22 Kilograms\n"
				+"\n"
				+"Compact Design: Its intelligent design does not take up more space while keeping it high on utility!\n"
				+"\n"
				
				+"Price : 25000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order MoonWooden Sheesham Wood Bed   is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BedsM();
		}


	}
}
class BlueWud extends Beds {
	void BlueWudM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("BLUEWUD Roverb Engineered Wood \n"
				+"Here specifications of ' BLUEWUD Roverb Engineered Wood '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Metal\n"
				+"\n"
				+"Product Dimensions: 2.05L x 0.97W x 0.72H Meters\n"
				+"\n"
				+"Item Weight: 22 Kilograms\n"
				+"\n"
				+"Compact Design: Its intelligent design does not take up more space while keeping it high on utility!\n"
				+"\n"
				
				+"Price : 12000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order BLUEWUD Roverb Engineered Wood  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BedsM();
		}


	}
}
class Doctor_Dreamss extends Beds {
	void Doctor_DreamssM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Doctor Dreams by Nilkamal Hybrid Wood \n"
				+"Here specifications of ' Doctor Dreams by Nilkamal Hybrid Wood '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Metal\n"
				+"\n"
				+"Product Dimensions: 2.05L x 0.97W x 0.72H Meters\n"
				+"\n"
				+"Item Weight: 22 Kilograms\n"
				+"\n"
				+"Compact Design: Its intelligent design does not take up more space while keeping it high on utility!\n"
				+"\n"
				
				+"Price : 12000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Doctor Dreams by Nilkamal Hybrid Wood  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BedsM();
		}


	}
}
class Furrino extends Beds {
	void FurrinoM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Furinno Sheesham Wood \n"
				+"Here specifications of ' Furinno Sheesham Wood '\n"
				+"\n"
				+"\n"
				+"Colour: Brown\r\n"
				+ "\n"
				+"Material: Metal\n"
				+"\n"
				+"Product Dimensions: 2.05L x 0.97W x 0.72H Meters\n"
				+"\n"
				+"Item Weight: 22 Kilograms\n"
				+"\n"
				+"Compact Design: Its intelligent design does not take up more space while keeping it high on utility!\n"
				+"\n"
				
				+"Price : 12000.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Furinno Sheesham Wood  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BedsM();
		}


	}
}
class Grocery extends Products
{
	void GroceryM() {
		Scanner sc = new Scanner(System.in);
		int sc1;      
		Dry_fruits s1 = new Dry_fruits();
		Vegetable_Fruits  s2 = new Vegetable_Fruits();
		Beverages s3 = new Beverages();
		Packaged_Foods s4  = new Packaged_Foods(); 

		System.out.println("Welcome to Electronics portal\n"
				+ "Select one of these products to buy\n"
				+"\n"
				+ "1. Dry fruits\n"
				+"\n"
				+ "2. Vegetable Fruits\n"
				+"\n"
				+ "3. Beverages\n"
				+"\n"
				+ "4. Packaged Foods\n"
				+"\n"
				);
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.Dry_fruitsM();  
			break;
		case 2:
			s2.Vegetable_FruitsM(); 
			break;
		case 3:
			s3.BeveragesM(); 
			break;
		default:
			s4.Packaged_FoodsM();
			break;
		}

	}
}
class Dry_fruits extends Grocery
{
	void Dry_fruitsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Almonds s1 = new Almonds();
		Cashews s2 = new Cashews();
		Dates s3 = new Dates();
		Berries s4 = new Berries();
		Walnuts s5 = new Walnuts();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Almonds\n"
				+"\n"
				+ "2.Cashews\n"
				+"\n"
				+ "3.Dates \n"
				+"\n"
				+ "Berries\n"
				+"\n"
				+ "5.Walnuts \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.AlmondsM();
			break;
		case 2:
			s2.CashewsM();
			break;
		case 3:
			s3.DatesM();
			break;
		case 4:
			s4.BerriesM();
			break;
		default:
			s5.WalnutsM();
		}
	}
}
class Almonds extends Dry_fruits  {
	void AlmondsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Almonds \n"
							+"\n"
							+"Price : 1200.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Almonds  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Dry_fruitsM();
		}


	}
}
class Cashews extends Dry_fruits  {
	void CashewsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cashews \n"
							+"\n"
							+"Price : 1200.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Cashews  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Dry_fruitsM();
		}


	}
}
class Dates extends Dry_fruits  {
	void DatesM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dates \n"
							+"\n"
							+"Price : 1200.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Dates  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Dry_fruitsM();
		}


	}
}
class Berries extends Dry_fruits  {
	void BerriesM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Berries \n"
							+"\n"
							+"Price : 1200.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Berries  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Dry_fruitsM();
		}


	}
}
class Walnuts extends Dry_fruits  {
	void WalnutsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Walnuts \n"
							+"\n"
							+"Price : 1200.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Walnuts  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Dry_fruitsM();
		}


	}
}
class Vegetable_Fruits extends Grocery
{
	void Vegetable_FruitsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Apples s1 = new Apples();
		Grapes s2 = new Grapes();
		Onion s3 = new Onion();
		Carrots s4 = new Carrots();
		Potatoes s5 = new Potatoes();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Apples\n"
				+"\n"
				+ "2.Grapes\n"
				+"\n"
				+ "3.Onion\n"
				+"\n"
				+ "Carrots\n"
				+"\n"
				+ "5.Potatoes \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.ApplesM();
			break;
		case 2:
			s2.GrapesM();
			break;
		case 3:
			s3.OnionM();
			break;
		case 4:
			s4.CarrotsM();
			break;
		default:
			s5.PotatoesM();
		}
	}
}
class Apples extends Vegetable_Fruits  {
	void ApplesM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Apples \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Apples  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Vegetable_FruitsM();
		}


	}
}

class Grapes extends Vegetable_Fruits  {
	void GrapesM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Grapes \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Grapes  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Vegetable_FruitsM();
		}


	}
}

class Onion extends Vegetable_Fruits  {
	void OnionM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Onion \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Onion  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Vegetable_FruitsM();
		}


	}
}

class Carrots extends Vegetable_Fruits  {
	void CarrotsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Carrots \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Carrots  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Vegetable_FruitsM();
		}


	}
}

class Potatoes extends Vegetable_Fruits  {
	void PotatoesM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Potatoes \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Potatoes  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Vegetable_FruitsM();
		}


	}
}

class Beverages extends Grocery
{
	void BeveragesM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Soft_Drinks s1 = new Soft_Drinks();
		Energy_Drinks s2 = new Energy_Drinks();
		Coffee s3 = new Coffee();
		Tea s4 = new Tea();
		Flavoured_Drinks s5 = new Flavoured_Drinks();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Soft_Drinks\n"
				+"\n"
				+ "2.Energy_Drinks\n"
				+"\n"
				+ "3.Coffee\n"
				+"\n"
				+ "Tea \n"
				+"\n"
				+ "5.Flavoured Drinks \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.Soft_DrinksM();
			break;
		case 2:
			s2.Energy_DrinksM();
			break;
		case 3:
			s3.CoffeeM();
			break;
		case 4:
			s4.TeaM();
			break;
		default:
			s5.Flavoured_DrinksM();
		}
	}
}
class Soft_Drinks extends Beverages  {
	void Soft_DrinksM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Soft_Drinks \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Soft_Drinks  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BeveragesM();
		}


	}
}
class Energy_Drinks extends Beverages  {
	void Energy_DrinksM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Energy_Drinks \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Energy_Drinks is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BeveragesM();
		}


	}
}
class Coffee extends Beverages  {
	void CoffeeM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Coffee \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Coffee  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BeveragesM();
		}


	}
}
class Tea extends Beverages  {
	void TeaM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tea \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Tea  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BeveragesM();
		}


	}
}
class Flavoured_Drinks extends Beverages  {
	void Flavoured_DrinksM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Flavoured Drinks \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Flavoured_Drinks is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			BeveragesM();
		}


	}
}


class Packaged_Foods extends Grocery
{
	void Packaged_FoodsM()
	{
		Scanner sc = new Scanner(System.in);
		int sc1;
		Biscuits s1 = new Biscuits();
		Noodles s2 = new Noodles();
		Pasta s3 = new Pasta();
		Jam s4 = new Jam();
		Oats s5 = new Oats();


		System.out.println("Welcome to my Appliances portal\n"
				+ "Select one of these Brands products to buy\n"
				+ "1.Biscuits\n"
				+"\n"
				+ "2.Noodles\n"
				+"\n"
				+ "3.Pasta \n"
				+"\n"
				+ "Jam\n"
				+"\n"
				+ "5.Oats \n");
		sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			s1.BiscuitsM();
			break;
		case 2:
			s2.NoodlesM();
			break;
		case 3:
			s3.PastaM();
			break;
		case 4:
			s4.JamM();
			break;
		default:
			s5.OatsM();
		}
	}
}
class Biscuits extends Packaged_Foods  {
	void BiscuitsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Biscuits \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Biscuits  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Packaged_FoodsM();
		}


	}
}
class Noodles extends Packaged_Foods  {
	void NoodlesM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Noodles \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Noodles  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Packaged_FoodsM();
		}


	}
}
class Pasta extends Packaged_Foods  {
	void PastaM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pasta \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Pasta  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Packaged_FoodsM();
		}


	}
}
class Jam extends Packaged_Foods  {
	void JamM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Jam \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Jam  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Packaged_FoodsM();
		}


	}
}
class Oats extends Packaged_Foods  {
	void OatsM()
	{       
		int Xr;
		int Xr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Oats \n"
							+"\n"
							+"Price : 120.00/-");

		System.out.println("Press 1 to buy this product\n"
				+"Press 2 to exit");
		Xr=sc.nextInt();

		if(Xr==1)
		{
			System.out.println("Your order Oats  is confirmed !!! THANKS for shopping !!!\n"
					+""
					+"press 1 to exit\n"
					+"press 2 to go to main menu");
			Xr1=sc.nextInt();
			if(Xr1==1)
			{
				System.exit(0);
			}  
			else
			{
				ProductsM();
			}         
		}
		else
		{
			Packaged_FoodsM();
		}


	}
}
class Main2211 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Products ProductsObj = new Products();
		ProductsObj.ProductsM();
	}
}




