package arraypractice;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,4,5,6};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				continue;
					
				}
				else
				{
					System.out.println(a[j]);
				}
			}
			
			}
		}

	}


