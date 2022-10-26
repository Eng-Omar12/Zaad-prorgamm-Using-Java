package omar.com;public class Account {    // fields //    private String name;    private  String number;    private  int balance;    // Constructor Default    public Account(){    }    // Constructor Parametrised    public Account(String name, String number, int balance){        setName(name);        setNumber(number);        setBalance(balance);    }    // Gets Method    public String getName() {        return name;    }    public int getBalance() {        return balance;    }    public String getNumber() {        return number;    }    // sets Methods    public void setName(String name) {        this.name = name;    }    private void setBalance(int balance) {        this.balance = balance;    }    public void setNumber(String number) {        this.number = number;    }    // Method SendMoney    public void sendMoney(int amount , Account to){        if (balance < amount){            System.out.println("Haraaga Kuma Filna");        }        balance-= amount;        to.balance += amount;    }    // create special Method Account    public final static Account myAccount = new Account("Omar","63583223",100);    public  static   Account[] accounts = new Account[]{            new Account("Axmed","7683628",2000),            new Account("Farxiyo","838405",20),            new Account("Maryama","2093748",167),            new Account("Asma","7873873",220),    };    public  static  Account getAccount(String number){        for (Account account :accounts){            if (account.number.equals(number)){                return account;            }//            return null;        }        return null;    }}