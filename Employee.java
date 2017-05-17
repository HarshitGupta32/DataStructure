import java.util.*;

/**
 * Created by hgupta on 3/12/2017.
 */

class  Employee {
    int id;
    String name;
    int phone;

    public Employee(int Id, String Name, int Phone) {
        this.id = Id;
        this.name = Name;
        this.phone = Phone;
    }



        @Override
        public boolean equals(Object obj) {
            if (obj == null)
                return false;
            if (!((obj) instanceof Employee))
                return false;
            final Employee comparer = (Employee) obj;
            if (this.id != comparer.id )
                return false;
            if(this.name!=comparer.name && this.name!=null)
                return false;
            if(this.phone!=comparer.phone)
                return false;
            return true;
        }

        @Override
        public int hashCode()
        {
         int hash = 3;
         hash = 67*hash+id;
            hash = 67*hash+((name!=null)?this.name.hashCode():0);
            hash = 67*hash+phone;
            return hash;
        }


    public static void increaseListSize(){
        int [] myStore = {1,2,3,4,5};
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
        public static void main(String [] args)
        {
            increaseListSize();
            Map<Integer,Employee> map = new HashMap<Integer,Employee>();
            map.put(1, new Employee(1, "emp", 981));
            map.put(2, new Employee(2, "emp2", 982));
            map.put(3, new Employee(3, "emp3", 983));
            map.put(4, new Employee(4, "emp4", 984));
            map.put(5, new Employee(4, "emp4", 984));

            Employee emp1 = map.put(5, new Employee(4, "emp4", 985));

            Employee emp = map.get(4);

            System.out.println("Finish Map" + map.size());
            Set<Employee> set = new HashSet<Employee>();

            set.add(new Employee(1, "emp", 981));
            set.add(new Employee(2, "emp2", 982));
            set.add(new Employee(2, "emp2", 982));
            set.add(new Employee(3, "emp3", 983));
            set.add(new Employee(4, "emp4", 984));
            set.add(new Employee(4, "emp4", 984));

            System.out.println(set.size());
        }

    }

