public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " kaydedildi.");
    }

    //bulk insert
    public void addMultiple(Customer[] customers){
        for (Customer customer:customers){
            System.out.println(customer.customerNumber + " kaydedildi.");
        }
    }
}