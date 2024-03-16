package org.example;

public class CustomerManager
{
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();   // kullanırken hangi veri tabanını çağırırsam onu kullanırım .
    }
}
