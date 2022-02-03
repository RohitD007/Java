//ROHIT GONSALO DSOUZA

//CS505 Section 852

//NJIT ID:31540870

public class RationalCalc {

		public static void main(String[] args) {

	        Rational a = new Rational(2, 4);
	        Rational b = new Rational(2, 6);

	        System.out.println(a + " + " + b + " = " + a.add(b));
	        System.out.println(a + " - " + b + " = " + a.sub(b));
	        System.out.println(a + " * " + b + " = " + a.mul(b));
	        System.out.println(a + " / " + b + " = " + a.div(b));

	        System.out.println(a + " = " + a + " is " + a.equals(new Rational(1, 2)));
	        System.out.println(a + " = " + b + " is " + a.equals(new Rational(1, 3)));

	        Rational[] arr = {new Rational(7, 1), new Rational(6, 1),
	                          new Rational(5, 1), new Rational(4, 1),
	                          new Rational(3, 1), new Rational(2, 1),
	                          new Rational(1, 1), new Rational(1, 2),
	                          new Rational(1, 3), new Rational(1, 4),
	                          new Rational(1, 5), new Rational(1, 6),
	                          new Rational(1, 7), new Rational(1, 8),
	                          new Rational(1, 9), new Rational(0, 1)};

	        selectSort(arr);

	        for (Rational r : arr) {
	            System.out.println(r);
	        }

	        Number n = new Rational(3, 2);

	        System.out.println(n.doubleValue());
	        System.out.println(n.floatValue());
	        System.out.println(n.intValue());
	        System.out.println(n.longValue());
	    }

	    public static <T extends Comparable<? super T>> void selectSort(T[] array) {

	        T temp;
	        int mini;

	        for (int i = 0; i < array.length - 1; ++i) {

	            mini = i;

	            for (int j = i + 1; j < array.length; ++j) {
		            if (array[j].compareTo(array[mini]) < 0) {
		                mini = j;
		            }
	            }

	            if (i != mini) {
		            temp = array[i];
		            array[i] = array[mini];
		            array[mini] = temp;
	            }
	        }
	    }
	}
	
class Rational extends Number implements Comparable<Rational>
{
	//constructor	
		public Rational(int num, int den)
		{
			int g =gcd(num,den);
			this.num = num/g;
		    this.den = den/g;
		}
		  
			
	//add method
		public Rational add(Rational o)
		{
			return new Rational((num * o.den + den * o.num),(den *o.den));
		}

	//Subtraction method	
		public Rational sub(Rational o) 
		{
		    return new Rational((num * o.den - den * o.num),(den *o.den));
		}
		
	//multiplication method	
		public Rational mul(Rational o)
		{
		    return new Rational((num * o.num),(den * o.den));
		}
		
	//Division Method	
		public Rational div(Rational o)
		{
		    return new Rational((num * o.den),(den * o.num));
		}
		
	//toString Method
		public String toString() 
		{
			return new String(+num+"/"+den);
		}
		private int num;
		private int den;
		
	//GCD
		 private static int gcd(int m, int n)
		 {
		        if (m < 0) m = -m;
		        if (n < 0) n = -n;
		        if (0 == n) return m;
		        else return gcd(n, m % n);
		 }
		
		@Override
		public int compareTo(Rational o)
		{
			int lhs = this.num * o.den;
	      int rhs = this.den * o.num;
	      if (lhs < rhs) return -1;
	      if (lhs > rhs) return +1;
	      return 0;
			
		}

		@Override
		public int intValue()
		{
			// TODO Auto-generated method stub
			 return (int)doubleValue();
		}


		@Override
		public long longValue()
		{
			// TODO Auto-generated method stub
			 return (long)doubleValue();
		}


		@Override
		public float floatValue()
		{
			// TODO Auto-generated method stub
			return (float)doubleValue();
		}


		@Override
		public double doubleValue()
		{
			// TODO Auto-generated method stub
			return num * 1.0 / den;
		}
		
		//OVERRIDE THE EQUALS METHOD
	    @Override
	    public boolean equals(Object obj)
	    { 
	        if (obj == this) 
	        { 
	            return true; 
	        } 
	        if (!(obj instanceof Rational))
	        { 
	            return false; 
	        } 
	        Rational rational = (Rational) obj; 
	        return Double.compare(num, rational.num) == 0 && Double.compare(den, rational.den) == 0; 
	    }
	}




