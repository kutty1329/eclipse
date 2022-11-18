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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import JavaFullStack.BasicInJava.Collection.Treeset;

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
	public void write() throws IOException
	{
		fos=new FileOutputStream(file);
		oos=new ObjectOutputStream(fos);
		oos.writeObject(Spices);
		oos.close();
		fos.close();
	}
	public void read() throws IOException, ClassNotFoundException
	{
		fis=new FileInputStream(file);
		ois=new ObjectInputStream(fis);
		Spices=(ArrayList<SuperMarketDetails>)ois.readObject();
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
	public void Listalldetails() {
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
	public void Update(String BrandName) {
		// TODO Auto-generated method stub
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
	}
	@Override
	public void Delete(String ProductName) 
	{
		// TODO Auto-generated method stub
		try {
			read();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<SuperMarketDetails> dlt=new Vector<SuperMarketDetails>();
		dlt.addAll(Spices);
		for(int i=0;i<dlt.size();i++)
		{
			if(dlt.get(i).getProductName().equalsIgnoreCase(ProductName))
			{
				Spices.remove(dlt.get(i));
				System.out.println(ProductName+"has deleted Succesfully");
				try {
					write();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return ;
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
	public void Search(String Price) {
		// TODO Auto-generated method stub
		
	
	}
	@Override
	synchronized public void run()
	{
		System.out.println("Welcome To Our SuperMarket " + Thread.currentThread().getName());
		do
		{
		System.out.println("List in our product details please kindly choose to Your Choice\n 1.Addproductdetails \n 2.Listalldetails \n 3.Update \n 4.Search \n 5.Sort \n 6.Delete \n 7.Exit");
		int menu=scan.nextInt();
		switch(menu)
		{
		case 1 :
			
			System.out.println("Newly Added Product Details listed Below 1.BrandName 2.ProductName 3.Qunatity 4.LotNo 5.Price");
			SuperMarketDetails spr=new SuperMarketDetails(scan.next(),scan.next(),scan.next(),scan.next(),scan.next());
			System.out.println(Addproductdetails(spr));
			break;
		case 2:
			System.out.println("View Your Product Details");
			Listalldetails();
			break;
		case 3:
			System.out.println("which field you want Update");
			String upd=scan.next();
			Update(upd);
			Listalldetails();
			break ;
		case 4:
			System.out.println("which field you want search");
			String sch=scan.next();
			Search(sch);
			break;
		case 5:
			Sort();
			break;
		case 6 :
			Listalldetails();
			System.out.println("Please Enter your ProducName");
			String dlte=scan.next();
			Delete(dlte);
			break;
			
		case 7:	
		    default: System.out.println("Thanks For Your Coming");
		}
		
	}
		while(true);
}

	
}
