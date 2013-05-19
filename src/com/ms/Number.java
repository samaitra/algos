package com.ms;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Number {

	
	int base;
	LinkedList<Character> digits;
	//Number list[];
	
	
	Number createNumber (String numberFormat){
		
		Number num = new Number();
		num.base = Integer.parseInt(numberFormat.substring(0,1));
		char[] digitsNumber = numberFormat.substring(2).toCharArray();
		LinkedList<Character> dig = new LinkedList<Character>();
		for(int i=0;i<digitsNumber.length;i++){
			dig.add(digitsNumber[i]);
		}
		num.digits = dig;
		return num;
	}
	
	void printNumber(Number n){
		String begin = "(";
		String end = ")";
		String base = String.valueOf(n.base);
		
		String dig="";
		ListIterator<Character> iter = n.digits.listIterator();
		while(iter.hasNext()){
			dig = dig+iter.next();
		}
		String num = begin+dig+end+base;
		System.out.println(num);
		try{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Driver.fout));
		bufferedWriter.write(num);
		bufferedWriter.flush();
		bufferedWriter.close();
		}catch(Exception e){
			e.printStackTrace();
			}
		
	} 
	
	Number convert(Number n, int toBase){
		
		Number n1 = new Number();
		LinkedList<Character> lList = new LinkedList<Character>();
		
		int decimalValue = 0;
		int index=n.digits.size()-1;
		for (Character c:n.digits){
			int val = Base.lookup(c);
			decimalValue+= val * Math.pow(n.base,index);
			index--;
		}
		
		System.out.println("decimalValue " + decimalValue);
		n1.base = toBase;
		
		int reminder;
		int quotient;
 		String rem = "";

 		do{
		quotient = decimalValue/toBase;
		reminder = decimalValue%toBase;
		
		rem+=reminder;
		decimalValue = quotient;
		
		}while(decimalValue>0);
 		
		char[] remChar = rem.toCharArray();
		for(int i=remChar.length-1;i>=0;i--){
			int j = Character.getNumericValue(remChar[i]);
			//System.out.print(Base.symbols[j]);
			lList.add(Base.symbols[j]);
		}
		System.out.println("\n");
		n1.digits = lList;
		return n1;
	}
	int getDecimalValue(Number n){
		
		int decimalValue = 0;
		int index=n.digits.size()-1;
		for (Character c:n.digits){
			int val = Base.lookup(c);
			decimalValue+= val * Math.pow(n.base,index);
			index--;
		}
	    return decimalValue;
	}
	
	Order compare(Number n1, Number n2){
		if (n1.getDecimalValue(n1)>n2.getDecimalValue(n2))
			return Order.GREATER;
		else if (n1.getDecimalValue(n1)<n2.getDecimalValue(n2))
			return Order.LESSER;
		else
			return Order.EQUAL;
	}

	int partition(Number list[], int start, int end){
		
		
		if (start >= end) {
			return -1;
		}
		Number n = new Number();
		
//		System.out.println("size of list "+ list.length);
//		System.out.println("start index of the list "+start);
//		
//		System.out.println("end index of the list "+end);
//		System.out.println("print list[start]");n.printNumber(list[start]);
//		System.out.println("print list[(start+end)/4]");n.printNumber(list[(start+end)/4]);
//		System.out.println("print list[(start+end)/4*3]");n.printNumber(list[(start+end)/4*3]);
//		System.out.println("print list[(start+end)/2]");n.printNumber(list[(start+end)/2]);
//		System.out.println("print list[end]");n.printNumber(list[(end)]);
//		System.out.println("---------");
//		System.out.println("---------");
		
		int left=start;
		int right=end+1;
		
		Number pivot = median(list[start],list[(start+end)/4],list[(start+end)/4*3],list[(start+end)/2],list[end]);
		
		
		
		while(true){
		do{
			left++;
			
		}while(compare(list[left],pivot)==Order.LESSER);
		
		do{
			right--;
			
		}while(compare(list[right],pivot)==Order.GREATER);
		
		if (left>=right){
			break;
		}	
		swap(list[left],list[right]);
		}
		
		int pivotIndex = getPivotIndex(list,pivot);
		list[pivotIndex]=list[right];
		list[right] = pivot;
		
		partition(list,start,pivotIndex-1);
		partition(list,pivotIndex+1,end);
		return 1;
	}
	
	int getPivotIndex(Number list[],Number pivot){
		for (int i=0;i<list.length;i++)
			if(compare(list[i],pivot)==Order.EQUAL){
				return i;
			}
		return -1;
	}
	
	Number quickselect(Number list[],int size, int k){
		
		int max = indexOfMax(list, size);
		
		swapElements(list,max,size-1);
		Number nx = new Number();
    	
		//System.out.println("_____________________");
	    //System.out.println("After swap -------------");
	    
	    //for(int i=0;i<list.length;i++){
	    //	nx.convert(list[i], 10);
	    	
	   // }
	    
	    partition(list, 0, size-2);
	    
	    //System.out.println("After partition -------------");
	    
	    //for(int i=0;i<list.length;i++){
	    //	nx.convert(list[i], 10);
	    	
	    //}
	    
	    
	    return list[k-1];
	}
	
	void swap(Number a, Number b){
		Number temp = a;
		a=b;
		b=temp;
	}
	
	void swapElements(Number list[],int a, int b){
		Number temp = list[a];
		list[a]=list[b];
		list[b]=temp;
	}
	
	int indexOfMax(Number list[],int size){
		int max=0;
		for (int i=0;i<list.length;i++){
			if(compare(list[i],list[max])==Order.GREATER){
				max=i;
			}
		}
		return max;
	}
	
	Number median(Number a, Number b, Number c, Number d, Number e){
		
		Number[] arr = new Number[5];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
			
		int i,j;
				
		for (i=0;i<arr.length;i++){
			Number x = arr[i];
			for (j=i;j>0 && compare(arr[j-1],x)==Order.GREATER;j--){
				arr[j]=arr[j-1];
			}
			arr[j]=x;
		}
		//return arr[2];
		return a;
				
		
	}
	
	
	
	
}
