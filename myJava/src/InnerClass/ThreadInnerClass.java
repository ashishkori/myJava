package InnerClass;

class ThreadInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= new Thread() 
				{
					public void run()
					{
						for(int i=0;i<10;i++)
							System.out.println("Child Thread");
					}
			
				};
		t.start();
	for(int i=0;i<10;i++)
		System.out.println("Main Thread");
			
	}

}
