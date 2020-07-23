package Log.logging;
import java.util.logging.Logger;
public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	public float interest(float p,float t,float r,int type)
	{
		Interest I = new Interest(p,t,r);
		float interest = I.type(type);
		return interest;
	}
	public float construction(String std,float area,boolean automation)
	{
		ConstructionCost c = new ConstructionCost(std,area,automation);
		float cost = c.CostCalculation();
		return cost;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		float si = obj.interest(200,2,4,1);
		LOGGER.info("Simple Interest : "+si);
		float ci = obj.interest(200,2,4,2);
		LOGGER.severe("Compound Interest : "+ci);
		float cc = obj.construction("high standard", 729.7f, false);
		LOGGER.warning("Construction Cost : "+cc);
	}

}

