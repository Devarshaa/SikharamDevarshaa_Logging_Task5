package Log.logging;

public class Interest {
	float principal;
	float time;
	float rate;
	Interest(float p,float t,float r)
	{
		this.principal = p;
		this.time = t;
		this.rate = r;
	}
	float type(int choice)
	{
		switch(choice)
		{
		case 1:return simpleInterest(this.principal,this.time,this.rate);
		case 2:return compoundInterest(this.principal,this.time,this.rate);
		}
		return 0;
	}
	float simpleInterest(float p,float t,float r)
	{
		float interest = p*t*r/100;
		return interest;
	}
	float compoundInterest(float p,float t,float r)
	{
		float interest = (float)(p*Math.pow(1+r/100, t));
		return interest-p;
		
	}
}


