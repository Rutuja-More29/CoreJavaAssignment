package augusttest;
//create a anonymous thread such that child thread print star pattern for alphabet C and main thread print star pattern for T
public class ThreadExample   {
		
	public static void main(String[] args) {
	        // Create child thread to print star pattern for C
	        Thread cThread = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                for (int j = 0; j < 5; j++) {
	                    if (i == 0 || i == 4 || j == 0) {
	                        System.out.print("* ");
	                    } else {
	                        System.out.print("  ");
	                    }
	                }
	                System.out.println();
	            }
	        });

	        // Create main thread to print star pattern for T
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == 0 || j == 2) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }

	        // Start child thread to print C
	        cThread.start();

	        // Wait for child thread to finish before exiting
	        try {
	            cThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
/*public static void printC() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||i==4||j==0)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printT() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||j==2) {
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	
		
	}*/

	
	
	

	
}
