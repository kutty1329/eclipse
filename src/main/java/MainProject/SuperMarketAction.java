package MainProject;

public interface SuperMarketAction {
	public String Addproductdetails(SuperMarketDetails Masala);
	public void Listalldetails();
	public void Update(String BrandName);
	public void Delete( String  ProductName);
	public void Sort();
	public void Search(String Price);

}
