package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamProduct {
	public static void main(String[] args) {
		Product p1=new Product(101, "Alu", 30);
		Product p2=new Product(102, "Baingan", 50);
		Product p3=new Product(103, "Potala", 70);
		Product p4=new Product(104, "Chhhuin", 55);
		Product p5=new Product(105, "Kadali", 40);
		
		List<Product> product=Arrays.asList(p1,p2,p3,p4,p5);
		List<Product> expensivevegetables=product.stream().filter(p->p.price>=50).sorted(Comparator.comparing(Product::getPname)).collect(Collectors.toList());
		System.out.println(expensivevegetables);
	}

}
