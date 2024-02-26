# 2.7 Random Numbers

```
import java.util.Random;

public class RandomDemo extends ConsoleProgram {
   public void run(){


       // create a random object
       Random myRandom = new Random();


       // generate a random int number and store it in a variable
       // this generates a number between 0 and 4
       int intRandom = myRandom.nextInt(5);


       System.out.println(intRandom);
   }
}
```

## Import the Random class

To generate random numbers in Java, we need to import a new class, called Random from the java.util package.


```
import java.util.Random;
```



## Creating a random object

In order to create a random number, we need to create a random object.  This is like declaring a special variable


```
Random  myRand = new Random();
```



## Generating a random number with nextInt()

Now that we have created a random object, we use the nextInt() method to generate a random number.  The nextInt() method creates a random integer between 0 and `upperbound`,  where `upperbound` is the parameter that represents maximum value generated, exclusive (up to but not including `upperbound`).


```
 int intRandom = myRandom.nextInt(5);
```


This generates a number between 0 and 4.

Examples


<table>
  <tr>
   <td>Random range
   </td>
   <td>example
   </td>
  </tr>
  <tr>
   <td>[0 … 4]
   </td>
   <td><strong><code>int intRandom = myRandom.nextInt(5);</code></strong>
   </td>
  </tr>
  <tr>
   <td>[0 … 5]
   </td>
   <td><strong><code>int intRandom = myRandom.nextInt(6);</code></strong>
   </td>
  </tr>
  <tr>
   <td>[0 … 5]
   </td>
   <td><strong><code>int intRandom = myRandom.nextInt(5 + 1);</code></strong>
   </td>
  </tr>
  <tr>
   <td>[10 … 15]
   </td>
   <td><strong><code>int intRandom = myRandom.nextInt(5 + 1) + 10;</code></strong>
<code>// [0...5]  + 10 = [10...15]</code>
   </td>
  </tr>
</table>



## General Form for a generating within a range min - max

To generate a random number between values min and max, we use


```
int intRandom = myRandom.nextInt((max - min) + 1) + min;
```



### Test it out

Generate a number between 10 and 30 we can use   
`int intRandom = myRandom.nextInt((30 - 10) + 1) + 10;`


```

import java.util.Random;

public class RandomDemoRange extends ConsoleProgram {
   public void run(){


       // create a random object
       Random myRandom = new Random();


       // generate a random int number and store it in a variable
       // this generates a number between 10 and 30
       int intRandom = myRandom.nextInt((30 - 10) + 1) + 10;      
       System.out.println(intRandom);


   }
}
```
