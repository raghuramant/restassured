package org.task.Rest;

import java.util.ArrayList;
import java.util.List;


public class Arraylistl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List myarrayList = new ArrayList();
myarrayList.add(1);
myarrayList.add(2);
myarrayList.add(3);
myarrayList.add("four");
myarrayList.add(7);
//for (String x : myarrayList) {
//	System.out.println(x);
//}

/*for (Object object : myarrayList) {
	
	System.out.println(object);
	if()
}*/

for (int i = 0; i < myarrayList.size(); i++) {
	System.out.println(myarrayList.get(i));
	
}

List<String> myarrayList1 = new ArrayList<String>();
myarrayList1.add("1");
myarrayList1.add("2");
myarrayList1.add("3");
myarrayList1.add("four");
myarrayList1.add("7");
int sum =0;
int ref=0;
for (String x : myarrayList1) {
	try{
		
	
	 ref = Integer.parseInt(x);
	 sum = sum+ref;
	}catch(Throwable e){
			
	}
	
	
	
	
}

System.out.println("Sum"+sum);




	}

}
