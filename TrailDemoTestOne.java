package linkedListEx;

public class TrailDemoTestOne {
public static void main(String[] args) {
DemoTestOne<Integer> one = new DemoTestOne<>();
one.add(2);
one.add(4);
one.add(7);
one.add(8);
one.add(4);
System.out.println("List size:"+one.size());
System.out.println("Get():"+one.get(1));
System.out.println("indexOf:"+one.indexOf(7));
one.set(4,10);
System.out.println("Afer set():"+one.get(4));
one.showList();
}
}

