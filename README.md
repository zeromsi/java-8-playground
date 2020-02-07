# java-8-playground
### What is a Functional interface?

1. A functional interface allows only 1 abstract method
2. More than 1 default methods
3. More than 1 static methods
4. Let us override java.lang.Object ckass methods

### What functional interface can't contain?
1. Concrete method

### Purpose?

1. To enable functional programming in java.
2. To enable lambda expression
3. To use method referencing 

#### What is functional programming?

In functional programming we can send another function as method parameter.


### How to enable a functional interface?

By using @FunctionalInterface annotation


### How many ways can we implement an Interface in Java 8?

1. By writing separate Implementation class
2. By annonymous inner class 
3. By lambda expression
3. By Method references


### Something about Method referencing

1. Operator ``::``
2. Signature must be same (name is not mandatory)
3. Implementation of method must be static


#### There are few functional interfaces namely Consumer, Supplier, Predicate provided by Java 8.

[Read more](https://medium.com/swlh/understanding-java-8s-consumer-supplier-predicate-and-function-c1889b9423d)

### Consumer

- A Consumer is a functional interface that accepts a single input and returns no output.
- Consumer interface has two methods:

```
void accept(T t);
default Consumer<T> andThen(Consumer<? super T> after);
```
- The ```accept``` method is the Single Abstract Method (SAM) which accepts a single argument of type T.
- ```andThen``` is a default method used for composition or chaining.
- ``` andThen``` takes a consumer as input and returns a consumer.

#### ``` accept ``` method example


```
	public static void printUsingAcceptMethod(){
		// Create a function that prints what ever is passed through accept method of consumer interface.
	    Consumer<String> printConsumer = t -> System.out.println(t);
	    Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
	    // foreach method of stream interface takes a consumer through parameter.
	    cities.forEach(printConsumer);
	}

```

### ```andThen``` method example.

``` 
public void printUsingAndTherMethod(){
    List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

// This consumer converts an string list into upper case.
    Consumer<List<String>> upperCaseConsumer = list -> {
        for(int i=0; i< list.size(); i++){
            list.set(i, list.get(i).toUpperCase());
        }
    };
    
// This Consumer print list of string 
    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

// Chaining consumers using andThen
    upperCaseConsumer.andThen(printConsumer).accept(cities);
}

```

### Predicate

In mathematics, a predicate is commonly understood to be a boolean-valued function ```P: X? {true, false}```, called the predicate on X. Informally, a strong. It can be thought of as an operator or function that returns a value that is either true or false.

In Java 8, Predicate is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference. So, where you think, we can use these true/false returning functions in day to day programming? I will say you can use predicates anywhere where you need to evaluate a condition on group/collection of similar objects such that evaluation can result either in true or false.

```
public class Main {

	public static void main(String[] args) {
	List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	Main main=new Main();
	List<Integer> tempList=main.mapResult(values, (val)->val%2==0);
	
	tempList.forEach(temp->{
		System.out.println(temp);
	});
	
	}
	
	public List<Integer>  mapResult(List<Integer> values,Predicate<Integer> condition){
		List<Integer>  tempList=new ArrayList<>();
		values.forEach(val->{
			if(condition.test(val)) {
				tempList.add(val);
			}
		});
		return tempList;
	}

}

```




