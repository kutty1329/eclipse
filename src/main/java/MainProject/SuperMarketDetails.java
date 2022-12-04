package MainProject;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor

public class SuperMarketDetails implements Comparable<SuperMarketDetails>,Serializable
{
	private String BrandName;
	private String ProductName;
	private String Qunatity;
//	private int Manufactureddate;
//	private int ExpiryDate;
	private String LotNo;
	private String Price;
//	private Date dateobj=new Date();
	@Override
	public int compareTo(SuperMarketDetails o) {
		// TODO Auto-generated method stub
		return this.ProductName.compareTo(o.ProductName);
	}
	
	

}

