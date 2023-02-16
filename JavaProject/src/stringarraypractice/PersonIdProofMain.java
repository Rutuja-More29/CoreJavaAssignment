package stringarraypractice;
import java.util.Scanner;
public class PersonIdProofMain {

	public static void main(String[] args) {
		Person pr[]=new Person[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id pname:");
			int id=sc.nextInt();
			String pname=sc.next();
			IdProof idp[]=new IdProof[3];
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter name,validity:");
				String name=sc.next();
				int validity=sc.nextInt();
				
				IdProof dp=new IdProof();
				dp.setName(name);
				dp.setValidity(validity);
				idp[j]=dp;
			}
			Person p=new Person();
			p.setId(id);
			p.setPname(pname);
			p.setIdp(idp);
			pr[i]=p;
		}
		for(Person per:pr)
		{
			for(IdProof idp1:per.getIdp())
			{
				if(idp1.getName().equalsIgnoreCase("pancard"))
				{
					System.out.println(per.getPname()+" "+idp1.getName());
				}
			}
		}
	}

}
