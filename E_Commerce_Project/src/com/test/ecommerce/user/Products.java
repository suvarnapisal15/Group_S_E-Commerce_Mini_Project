package com.test.ecommerce.user;
//Create Products class for store 10 product and subcatagory of product and details into db also display product list in ascending order to user
//created by suvarna
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Products {
	//design method for insertProducts in to db
	public void insertProducts() {
		//add 10 catagory into arraylist
		ArrayList<String> watch = new ArrayList<String>();
		watch.add("price");
		watch.add("quantity");
		
		ArrayList<String> eequipments = new ArrayList<String>();
		eequipments.add("watch");
		eequipments.add("speaker");
		eequipments.add("laptop");

		ArrayList<String> furniture  = new ArrayList<String>();
		furniture.add("sofa");
		furniture.add("bad");
		furniture.add("table");

		ArrayList<String> cosmetics  = new ArrayList<String>();
		cosmetics.add("lipstick");
		cosmetics.add("facewash");
		cosmetics.add("facepack");

		ArrayList<String> jwellary  = new ArrayList<String>();
		jwellary.add("necklace");
		jwellary.add("ring");
		jwellary.add("earring");

		ArrayList<String> footware  = new ArrayList<String>();
		footware.add("shoes");
		footware.add("slipers");
		footware.add("shandles");

		ArrayList<String> kitchenAppliances  = new ArrayList<String>();
		kitchenAppliances.add("chopper");
		kitchenAppliances.add("mixer");
		kitchenAppliances.add("blender");

		ArrayList<String> bags  = new ArrayList<String>();
		bags.add("handbags");
		bags.add("travelbags");
		bags.add("mainbags");

		ArrayList<String> toys  = new ArrayList<String>();
		toys.add("softtoys");
		toys.add("remotecontroltoys");
		toys.add("learningtoys");

		ArrayList<String> bikeAccessories  = new ArrayList<String>();
		bikeAccessories.add("bikeleadlight");
		bikeAccessories.add("helmet");
		bikeAccessories.add("bikecover");

		ArrayList<String> officeStationary  = new ArrayList<String>();
		officeStationary.add("pen");
		officeStationary.add("diry");
		officeStationary.add("files");

		//add ArrayList as value into categories hashmap
		HashMap<String, ArrayList<String>> categories =new HashMap<String, ArrayList<String>>();
		categories.put("E-Equipments", eequipments);
		categories.put("Furniture", furniture);
		categories.put("Cosmetics", cosmetics);
		categories.put("Jwellary", jwellary);
		categories.put("Footware", footware);
		categories.put("KitchenAppliances", kitchenAppliances);
		categories.put("Bags", bags);
		categories.put("Toys", toys);
		categories.put("BikeAccessories", bikeAccessories);
		categories.put("OfficeStationary", officeStationary);
		
		//add categories map as value into products map
		HashMap<String,	HashMap<String, ArrayList<String>>>products =new HashMap<String,HashMap<String, ArrayList<String>>>();
		products.put("Products",categories);

		// iterate and print the data of products map
		Set<String> p = products.keySet();
		for(String st:p) {
			System.out.println("products key : "+st);
			System.out.println(products.get(st));
			System.out.println("-------------------------------------");
		}
		
		// iterate and print the data of categories map
		Set<String> c = categories.keySet();
		for(String ct:c) {
			System.out.println("categories key:"+ct);
			//System.out.println(categories.get(ct));
			
	//-------START--------new added for subcatagory price ,pQuantity------------------------------------

			System.out.println("hello......");
			//1.E-Equipments ----subCategories details
			if(ct.equals("E-Equipments")) {
				System.out.println("In if");
				int productId=1;
				for (String i : eequipments) {
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("watch")) 
					{
						int price=3000;int pQuantity=10;
						System.out.println("price : "+price +" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
			//			//productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("speaker"))
					{
						int price=4000;int pQuantity=10;System.out.println("price : "+price +" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
			//			//productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("laptop"))
					{
						int price=45000;int pQuantity=10;System.out.println("price : "+price +" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
				//		//productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------");
				}//end for
			}//end if	
			
			//2.Furniture ----subCategories details
			if(ct.equals("Furniture")) { 
				System.out.println("In if"); 
				int productId=2;
				for (String i :furniture)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("sofa")) 
					{ int price=15000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
			//		productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("bad"))
					{
						int price=20000;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
			//			productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
						} 
					if(i.equals("table")) 
					{
						int price=5000;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
				//		productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			//3.cosmetics ----subCategories details
			if(ct.equals("Cosmetics")) { 
				System.out.println("In if"); 
				int productId=3;
				for (String i :cosmetics)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("lipstick")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("facewash"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("facepack")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			//4.jwellary ----subCategories details--- necklace,ring,earring
			if(ct.equals("Jwellary")) { 
				System.out.println("In if"); 
				int productId=4;
				for (String i :jwellary)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("necklace")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("ring"))
					{
						int price=500;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("earring")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			
			////5.footware ----subCategories details----
			/*
			 * footware-shoes slipers shandles
			 */
			if(ct.equals("Footware")) { 
				System.out.println("In if"); 
				int productId=5;
				for (String i :footware)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("shoes")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("slipers"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("shandles")) 
					{
						int price=800;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			
			//6.kitchenAppliances ----subCategories details
			/*
			 * kitchenAppliances- chopper mixer blender
			 */
			if(ct.equals("KitchenAppliances")) { 
				System.out.println("In if"); 
				int productId=6;
				for (String i :kitchenAppliances)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					
					if(i.equals("chopper")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("mixer"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("blender")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			//7.bags ----subCategories details
			/*
			 * bags- handbags travelbags mainbags
			 */
			if(ct.equals("Bags")) { 
				System.out.println("In if"); 
				int productId=7;
				for (String i :bags)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("bags")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("travelbags"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("mainbags")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			
			//8.toys ----subCategories details
			/*
			 * toys- softtoys remotecontroltoys learningtoys
			 */
			if(ct.equals("Toys")) { 
				System.out.println("In if"); 
				int productId=8;
				for (String i :toys)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("softtoys")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("remotecontroltoys"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("learningtoys")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			
			//9.bikeAccessories ----subCategories details
			/*
			 * bikeAccessories- bikeleadlight helmet bikecover
			 */
			if(ct.equals("BikeAccessories")) { 
				System.out.println("In if"); 
				int productId=9;
				for (String i :bikeAccessories)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("bikeleadlight")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("helmet"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("bikecover")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
			
			
			
			//10.officeStationary ----subCategories details
			/*
			 * officeStationary- pen diry files
			 */
			if(ct.equals("OfficeStationary")) { 
				System.out.println("In if"); 
				int productId=10;
				for (String i :officeStationary)
				{ 
					System.out.println(ct+ " eequipments subCategories :: "+i);
					if(i.equals("pen")) 
					{ int price=1000;int pQuantity=10;
					System.out.println("price : "+price +" pQuantity : "+pQuantity);
					//create ProductDao class object
					ProductsDao productsDao=new ProductsDao();
					//call insertPSubCategoriesToDB()
					productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}
					if(i.equals("diry"))
					{
						int price=475;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);} 
					if(i.equals("files")) 
					{
						int price=237;int pQuantity=10;System.out.println("price : "+price+" pQuantity : "+pQuantity);
						//create ProductDao class object
						ProductsDao productsDao=new ProductsDao();
						//call insertPSubCategoriesToDB()
						productsDao.insertPSubCategoriesToDB(productId,i,price,pQuantity);
					}

					System.out.println("----------------------------------"); 
				}//end for 
			}//end if
		//------------------END--------------------------------------
			
			//create ProductsDao class object
			ProductsDao productsDao=new ProductsDao(); 
			
			  boolean ans = productsDao.insertProductsToDB(ct); 
			  //call insertProductsToDB()---to insert data into products table 
			  if(ans) {
				  System.out.println("Product is Added successfully ..........  "); }
			  else {
				  System.out.println("Something went worng try again ..........  "); }
			 
			
			System.out.println("=====================================");
			
			
		}
		
		
		
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		
		  // iterate and print the data of Arraylist eequipments  i.e.subCategories 
		for (String i :eequipments) { System.out.println("eequipments subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist furniture 
		for (String i : furniture) {
			System.out.println("furniture subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist cosmetics 
		for (String i : cosmetics) {
			System.out.println("cosmetics subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist jwellary 
		for (String i : jwellary) {
			System.out.println("jwellary subCategories :: "+i);
			System.out.println("----------------------------------"); } 
	// iterate and print the data of Arraylist footware
	for (String i : footware) {
			System.out.println("footware subCategories :: "+i);
			System.out.println("----------------------------------"); } 
	// iterate and print the data of Arraylist kitchenAppliances 
		for (String i : kitchenAppliances) {
			System.out.println("kitchenAppliances subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist bags 
		for (String i : bags) {
			System.out.println("bags subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist toys 
		for (String i : toys) {
			System.out.println("toys subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist bikeAccessories 
		for (String i : bikeAccessories) {
			System.out.println("bikeAccessories subCategories :: "+i);
			System.out.println("----------------------------------"); } 
		// iterate and print the data of Arraylist officeStationary
		for (String i : officeStationary) {
			System.out.println("officeStationary subCategories :: "+i);
			System.out.println("----------------------------------"); }
		 

	}//end insertProducts()
	
	//design method for displayProducts from db to console with ascending order
		public void displayProducts() {
			
			System.out.println("**********************Display Product List In Ascending Order*********************");
			ProductsDao productsDao =new ProductsDao();  //create object of ProductsDao class
			productsDao.displayAllProductsList();   //calling displayAllProductsList() from ProductsDao class
			
			System.out.println("*************************************************************r*********************");
		}//end displayProducts
	
	
	public static void main(String[] args) {
		Products products=new Products();
		//products.insertProducts();   //calling insertProducts
		products.displayProducts();  //calling displayProducts
	}

}
