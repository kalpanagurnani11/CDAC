
public class Calculator {
public static void main(String[] args)
{
	int ans=0;
	System.out.println("len"+args.length);
	if(args.length<3)
	{
		System.out.println("enter 3 parameters");
	}
	else {
		switch(args[0])
		{
		case "+"->{
			ans=Integer.parseInt(args[1])+Integer.parseInt(args[2]);
			System.out.println("Addition:"+ans);
			}
		case "-"->{
			ans=Integer.parseInt(args[1])-Integer.parseInt(args[2]);
			System.out.println("Subtraction:"+ans);
			}
		case "*"->{
			ans=Integer.parseInt(args[1])*Integer.parseInt(args[2]);
			System.out.println("Mul:"+ans);
			}
		case "/"->{
			ans=Integer.parseInt(args[1])/Integer.parseInt(args[2]);
			System.out.println("Div:"+ans);
			}
		
		}
	}

	
}
}
