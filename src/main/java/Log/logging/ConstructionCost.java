package Log.logging;
public class ConstructionCost {
	int standard;
	int[] cost = {0,1200,1500,1800,2500};
	float area;
	ConstructionCost(String Quality,float Area,boolean Automation)
	{
		if("standard".equals(Quality.toLowerCase()))
			standard = 1;
		else if("above standard".equals(Quality.toLowerCase()))
			standard = 2;
		else if("high standard".equals(Quality.toLowerCase()))
			if(Automation == false)
				standard = 3;
			else if(Automation == true)
				standard = 4;
		area = Area;
	}
	float CostCalculation()
	{
		return area*cost[standard];
	}
}