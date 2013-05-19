package com.ms;
public class Hash {

	static int max = 200;
	
	class ChainPair{
		int key;
		LinkedList list;
	}
	
	class LinkedList{
		Person person;
		LinkedList next;
	}
	
	class LinearPair{
		
		boolean isOccupied;
		Person person;
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Person[] personList = new Person[max];
	
	for(int i=0;i<max;i++){
		
	Person p = new Person();
	p.name = p.getRandomName();
	p.email = p.getRandomEmail();
	p.phone = p.getRandomPhone();	
	personList[i]=p;
	
	}
	String name = personList[0].name;
	
	
	Person p1 = new Person();
	p1.name = p1.getRandomName();
	p1.email = p1.getRandomEmail();
	p1.phone = p1.getRandomPhone();
	
	ChainPair[] cpArr = fillUsingSeparateChaining(personList);
	findChainPair(cpArr,name);
	insertChainPair(cpArr,p1);
	
	LinearPair[] lpArr = fillUsingLinearProbing(personList);
	findLinearProbing(lpArr,name);
	insertLinearProbing(lpArr,p1);
	
	
	lpArr = fillUsingQuadraticProbing(personList);
	findQuadraticProbing(lpArr,name);
	insertQuadraticProbing(lpArr,p1);
		
	
	
  }
	
	public static LinearPair[] fillUsingQuadraticProbing(Person[] personList){
		int hashsize = getNextPrimeNumber(max * 2);
		
		LinearPair[] liArr = new LinearPair[hashsize];
		for(int i=0;i<liArr.length;i++){
			Hash h = new Hash();
			liArr[i] = h.new LinearPair();
			liArr[i].isOccupied = false;
		}
		int key;
		int initKey;
		
		for(int i=0;i<max;i++){
		key = hashFunction(personList[i].name)%hashsize;
		initKey = key;
		 if(liArr[key].isOccupied==false){
			 liArr[key].person = personList[i];
			 liArr[key].isOccupied = true;
		 }else{
			 
			for (int j=0;j<hashsize;j++){
				key = (initKey+(j+1)*(j+1))%hashsize;
				 
				 if (liArr[key].isOccupied==false){
					 liArr[key].person = personList[i];
					 liArr[key].isOccupied = true;
					 break;
				 }
			} 
			 
		 }
		
		}		
		
		return liArr;
	}
	
	public static void findQuadraticProbing(LinearPair[] liArr, String name){
		
		int hashsize = getNextPrimeNumber(max*2);
		
		int key = hashFunction(name)%hashsize;
		int initKey = key;
		int count = 0;
		for(int i=0;i<hashsize;i++){
			
			count = count+1;
			
			if(liArr[key].isOccupied==true){
				if(liArr[key].person.name == name){
				
				System.out.println("Found "+liArr[key].person);
				System.out.println("Sn Quadratic Probing "+ count);
				return;
				}
			}
			key=(initKey+(i+1)*(i+1))%hashsize;
		}
		System.out.println("Name not Found "+name);
		System.out.println("Un Linear Probing "+ count);
	} 
	
	public static void insertQuadraticProbing(LinearPair[] liArr, Person person){
		
		int hashsize = getNextPrimeNumber(max*2);
		
		int key;
		int initKey;
		key = hashFunction(person.name)%hashsize;
		initKey = key;
		 int count = 0;
		if(liArr[key].isOccupied==false){
			 liArr[key].person = person;
			 liArr[key].isOccupied = true;
			 count = count+1;
			 System.out.println("Number of access required to add using Quadratic probing "+count);
			 
		}else{
			 
			for (int j=0;j<hashsize;j++){
				key = (initKey+(j+1)*(j+1))%hashsize;
				 count = count + 1; 
				 if (liArr[key].isOccupied==false){
					 liArr[key].person = person;
					 liArr[key].isOccupied = true;
					 System.out.println("Number of access required to add using Quadratic probing "+count);
					 break;
				 }
			} 
			 
		 }
		
	}
	
	
	static int getNextPrimeNumber (int num)
	{
	    boolean isPrime = true;
	    for (int i = num; i < num*2; ++i)
	    {
	        for (int j=2; j<=i/2 && isPrime; ++j)
	        {
	            if (i%j==0) isPrime = false;
	        }
	        if (!isPrime)
	        {
	            isPrime = true;
	        }
	        else
	        {
	            return i;
	        }
	    }
		return num;
	}

	
	
	
	public static LinearPair[] fillUsingLinearProbing(Person[] personList){
	
		int hashsize = getNextPrimeNumber(max * 2);
		
		LinearPair[] liArr = new LinearPair[hashsize];
		for(int i=0;i<liArr.length;i++){
			Hash h = new Hash();
			liArr[i] = h.new LinearPair();
			liArr[i].isOccupied = false;
		}
		int key;
		for(int i=0;i<max;i++){
		key = hashFunction(personList[i].name)%hashsize;
		
		 if(liArr[key].isOccupied==false){
			 liArr[key].person = personList[i];
			 liArr[key].isOccupied = true;
			 
		 }else{
			 
			for (int j=0;j<hashsize;j++){
				key = (key+1)%hashsize;
				 
				 if (liArr[key].isOccupied==false){
					 liArr[key].person = personList[i];
					 liArr[key].isOccupied = true;
					 break;
				 }
			} 
			 
		 }
		
		}		
		

		
		return liArr;
	}
	
	public static void findLinearProbing(LinearPair[] liArr, String name){
		
	    int hashsize = getNextPrimeNumber(max*2);
		
		int key = hashFunction(name)%hashsize;
		int count = 0;
		for(int i=0;i<hashsize;i++){
			count = count+1;
			if(liArr[key].isOccupied==true){
				if(liArr[key].person.name == name){
				
				System.out.println("Found "+liArr[key].person);
				System.out.println("Sn Linear Probing "+ count);
				return;
				}
			}
			key=(key+1)%hashsize;
		}
		
		System.out.println("Name not Found "+name);
		System.out.println("Un Linear Probing "+ count);
	} 
	
	public static void insertLinearProbing(LinearPair[] liArr, Person person){
		
		int hashsize = getNextPrimeNumber(max*2);
		
		int key;
		int count = 0;
		
		key = hashFunction(person.name)%hashsize;
		 if(liArr[key].isOccupied==false){
			 liArr[key].person = person;
			 liArr[key].isOccupied = true;
			 count = count+1;
			 System.out.println("Number of access required to add using linear probing "+count);
		 }else{
			 
			for (int j=0;j<hashsize;j++){
				key = (key+1)%hashsize;
				 count = count + 1;
				 if (liArr[key].isOccupied==false){
					 liArr[key].person = person;
					 liArr[key].isOccupied = true;
					 System.out.println("Number of access required to add using linear probing "+count);
					 break;
				 }
			} 
			 
			 
		 }
		
	}
	
	
	
	public static ChainPair[] fillUsingSeparateChaining(Person[] personList){
		
		int hashsize = 250;
		ChainPair[] cpArr = new ChainPair[hashsize];
		
		for (int i=0;i<hashsize;i++){
		    //System.out.println("i "+i);
			//System.out.println("cpArr[i] "+cpArr[i].key);
			Hash h = new Hash();
			cpArr[i] = h.new ChainPair();
			cpArr[i].key=i;
			cpArr[i].list=null;
		}
		int key;
		for(int i=0;i<max;i++){
			key=hashFunction(personList[i].name)%hashsize;
			addChainPair(cpArr[key],personList[i]);
			
		}
		
		for(int i=0;i<hashsize;i++){
			printChainPair(cpArr[i]);
		}
		
		return cpArr;
		
	}	
	
	static int hashFunction(String name)
	{
	    int val = 0;
	    for (int i=0; i<name.length(); ++i)
	    {
	        val += (int)name.charAt(i);
	    }
	    return val; 
	    
	}
	
	
	public static void addChainPair(ChainPair cp,Person p){
	 LinkedList temp;
	 Hash h = new Hash();
	 LinkedList ll = h.new LinkedList();
	 ll.person=p;
	 int count = 0; 
	 if (cp.list == null){
		 cp.list = ll;
		 
	 }else{
		 temp = cp.list;
		 cp.list = ll;
		 ll.next=temp;
		} 
	 
	 
	}

	public static void addChainPair2(ChainPair cp,Person p){ 
		 LinkedList temp;
		 Hash h = new Hash();
		 LinkedList ll = h.new LinkedList();
		 ll.person=p;
		 int count = 0; 
		 if (cp.list == null){
			 cp.list = ll;
			 count = count+1;
			 
		 }else{
			 temp = cp.list;
			 cp.list = ll;
			 ll.next=temp;
			 count=count+1;
		 } 
		 
		 System.out.println("Num access required to add in chain "+count);
		 
		}

	
	public static void printChainPair(ChainPair cp){
	 LinkedList temp = cp.list;
    if (null == temp){
        //System.out.println(cp.key);
        }
    while (temp != null)
    {
        //System.out.println(cp.key);
        //System.out.println(temp.person.name);
        temp = temp.next;	
    }
	
	}
	
	public static void findChainPair(ChainPair[] cpArr, String name){
		
		int key = hashFunction(name)%250;
		//System.out.println("key in find **"+key);
		int count=0;
		if (cpArr[key].list==null){
			System.out.println("Not Found 1 **** "+name);
			System.out.println("Un chain "+ count);
			count = count+1;
			
					
		}else{
			
			LinkedList ll = cpArr[key].list;
			
			
			while(ll!=null){
				count=count+1;
				
				if (ll.person.name.equals(name)){
					System.out.println("Found "+ll.person.toString());
					System.out.println("Sn chain "+ count);
					
					return;
					
				}
				
				ll=ll.next;
			}
			System.out.println("Un chain "+ count);
			System.out.println("Not Found *** "+name);
		}
		
		
		
	}
	
	public static void insertChainPair(ChainPair[] cpArr, Person p){
		
		int key=hashFunction(p.name)%250;
		addChainPair2(cpArr[key],p);
	}
	
}
