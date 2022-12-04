package MainProject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

//import JavaFullStack.BasicInJava.Collection.Treeset;

public class Market<T> implements Runnable, SuperMarketAction  
{
	File file =new File("D:\\BasicInJava\\SuperMarket\\SuperMarketDetails.doc");
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	//ArrayList<SuperMarketDetails> Spices=new ArrayList<SuperMarketDetails>();
	ArrayList<SuperMarketDetails> Spices=null;
	Scanner scan=new Scanner(System.in);
	public void read() throws IOException, ClassNotFoundException
	{
		fis=new FileInputStream(file);
		ois=new ObjectInputStream(fis);
		Spices=(ArrayList<SuperMarketDetails>)ois.readObject();
	}
	public void write() throws IOException
	{
		fos=new FileOutputStream(file);
		oos=new ObjectOutputStream(fos);
		oos.writeObject(Spices);
		oos.close();
		fos.close();
	}
	public Market()
	{
	}

	public String Addproductdetails(SuperMarketDetails Masala) 
	{
		// TODO Auto-generated method stub
		try {
			read();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Spices.add(Masala);
		try {
			write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Masala.getBrandName()+"has Sucessfully added";
	}
	
	@Override
	public void Stockdetails() {
		// TODO Auto-generated method stub
		try {
			read();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<SuperMarketDetails> it=Spices.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	@Override
	public void Visiting(String ProductName)
	{
		// TODO Auto-generated method stub
	try
	{
		try 
		{
			read();
		} catch (ClassNotFoundException | IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("please welcome to our SuperMarket list  your Product deatils"+ProductName);
		ArrayList<SuperMarketDetails> vist=new ArrayList<SuperMarketDetails>();
		vist.addAll(Spices);
		for(int i=0;i<vist.size();i++)
		{
			if(vist.get(i).getProductName().equalsIgnoreCase(ProductName))
				
			System.out.println(vist.get(i));
			
		}
		throw new SuperMarketException();
	}
	
	catch(SuperMarketException exe)
	{
		System.out.println(exe+ " Please Enter Name only ");
		for(SuperMarketDetails sp:Spices)
		{
			System.out.println(sp.getProductName());
		}
		System.out.println("please welcome to our SuperMarket list  your Product deatils"+ProductName);
		String vst=scan.next();
		Visiting(vst);
		try {
			write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  }

	public void Buying(String ProductName) 
	{
		// TODO Auto-generated method stub
		try
		{
		try {
			read();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<SuperMarketDetails> by=new Vector<SuperMarketDetails>();
		by.addAll(Spices);
		for(int i=0;i<by.size();i++)
		{
			if(by.get(i).getProductName().equalsIgnoreCase(ProductName))
			{
				Spices.remove(by.get(i));
				System.out.println(ProductName+"Your Product Buying Succesfully");
				try {
					write();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return ;
			}		
		}
		throw new SuperMarketException();
	}
		catch(SuperMarketException exe)
		{
			System.out.println(exe+"Not Matching Value");
			for(SuperMarketDetails sp:Spices)
			{
				System.out.println(sp.getProductName());
			}
			System.out.println("Enter Product Name");
			String prd=scan.next();
			Buying(prd);
			try {
				write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(ProductName+"Your Product Buying Succesfully");
		
	}

	@Override
	public void Update(String BrandName) {
		// TODO Auto-generated method stub
		try
		{
		try {
			read();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SuperMarketDetails sup=null;
		for(SuperMarketDetails sp : Spices)
		{
			if(sp.getBrandName().equals(BrandName))
			{
				sup=sp;
				break;
			}
		}
		if(sup!=null)
		{
			Spices.remove(sup);
			System.out.println(BrandName+"Which field you want update");
			String field=scan.next();
			switch(field)
			{
			case "BrandName":
				System.out.println("please enter your Name");
				String brand=scan.next();
				sup.setBrandName(brand);
				break;
			case "ProductName":
				System.out.println("please enter your productname ");
				String prduct=scan.next();
				sup.setProductName(prduct);
				break;
			case "Qunatity":
				System.out.println("please enter your Quantity");
				String qty=scan.next();
				sup.setQunatity(qty);
				break;
			case "LotNo" :
				System.out.println("please enter your LotNo");
				String lot=scan.next();
				sup.setLotNo(lot);
				break;
			case "Price":
				System.out.println("please enter your price");
				String prc=scan.next();
				sup.setPrice(prc);
				break;
				default:
			}
			System.out.println(field+"name has been updated"+BrandName);
			Spices.add(sup);
			try {
				write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		throw new SuperMarketException();
		}
		catch(SuperMarketException exe)
		{
			System.out.println(exe+"Your value is Not Matching");
			for(SuperMarketDetails sp:Spices)
			{
				System.out.println(sp.getBrandName());
				System.out.println("Enter Correct Name");
				String up=scan.next();
				Update(up);
			}
		}
		
		
	}
	@Override
	public void Sort() {
		// TODO Auto-generated method stub
       System.out.println("try to your sorting");
          try {
			read();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          Collections.sort(Spices);
          try {
			write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	synchronized public void run()
	{
		System.out.println("Welcome To Our SuperMarket " + Thread.currentThread().getName());
		do
		{
		System.out.println("List in our product details please kindly choose to Your Choice\n 1.Addproductdetails \n 2.Stockdetails \n 3.Visiting \n 4.Buying \n 5.Update \n 6.Sort \n 7.Exit");
		int menu=scan.nextInt();
		switch(menu)
		{
		case 1 :
			
			System.out.println("Newly Added Product Details listed Below 1.BrandName 2.ProductName 3.Qunatity 4.LotNo 5.Price");
			SuperMarketDetails spr=new SuperMarketDetails(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
			System.out.println(Addproductdetails(spr));
			break;
		case 2:
			System.out.println("View Your Product Details");
			Stockdetails();
			break;
		case 3:
			Stockdetails();
			System.out.println("view your product details");
			String sch=scan.next();
			Visiting(sch);
			break;
		case 4 :
			Stockdetails();
			System.out.println("Please Enter your ProducName");
			String dlte=scan.next();
			Buying(dlte);
			break;
		case 5:
			System.out.println("which field you want Update");
			String upd=scan.next();
			Update(upd);
			Stockdetails();
			break ;
		case 6:
			Sort();
			break;	
		case 7:	
		    default: System.out.println("Thanks For Your Coming");
		}
		
	}
		while(true);
}

	
}
