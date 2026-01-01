import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankPractice {
    public static void main(String[] args) {
        Map<String,BankAccount> bankAccountMap=new HashMap<>();
        while(true){
            Scanner sc = new Scanner(System.in);
            int number =Integer.parseInt(sc.nextLine());
            if(number==1){
                System.out.println("1. 계좌 개설입니다. 아래 정보를 입력해주세요.");
                System.out.println("이름, 계좌번호, 잔액을 입력");
                String name =sc.nextLine();
                String accountNumber =sc.nextLine();
                long balance =Long.parseLong(sc.nextLine());
                if(bankAccountMap.containsKey(accountNumber)){
                    System.out.println("계좌중복입니다");
                }else{
                    bankAccountMap.put(accountNumber,new BankAccount(name, accountNumber,balance));
                }
            }else if (number==2) {
//                계좌조회
                System.out.print("2. 계좌조회서비스입니다.계좌번호를 입력해주세요. : ");
                String accountNumber = sc.nextLine();
                BankAccount b1 =bankAccountMap.get(accountNumber);
                System.out.println("계좌주명: " + b1.getName()+"계좌번호: "+ b1.getAccountNumber());

            }else if (number==3) {
                System.out.print("3. 입금서비스입니다. 계좌번호를 입력해주세요. : ");
                String accountNumber = sc.nextLine();
                System.out.print("입금 금액을 입력해주세요");
                long money =Long.parseLong(sc.nextLine());
                BankAccount b1 =bankAccountMap.get(accountNumber);
                System.out.println("입금전 : "+ b1.getBalance());
                b1.deposit(money);
                System.out.println("입금 후: "+ b1.getBalance());

            }else if (number==4) {
                System.out.print("4. 출금서비스입니다. 계좌번호를 입력해주세요. : ");
                String accountNumber = sc.nextLine();
                System.out.print("출금 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                BankAccount b1 = bankAccountMap.get(accountNumber);
                if (b1.chekBalance(money)) {
                    b1.withdraw(money);
                    System.out.println("출금 완");
                } else {
                    System.out.println("잔액 부족");
                }
            }else if (number==5) {
                    System.out.print("5. 송금서비스입니다. 본인계좌번호를 입력해주세요. : ");
                    String myNumber = sc.nextLine();
                    System.out.print("상대방 계좌번호를 입력해주세요. : ");
                    String targetNumber = sc.nextLine();
                    System.out.print("송금 금액을 입력해주세요");
                    long money = Long.parseLong(sc.nextLine());
                    BankAccount b1 = bankAccountMap.get(myNumber);
                    BankAccount b2 =bankAccountMap.get(targetNumber);
                    if(b1.chekBalance(money)) {
                        b1.transfer(b2, money);
                        System.out.println("송금 완료");
                    }else {
                        System.out.println("잔액 부족");
                    }
            }


        }


    }
}
class BankAccount{
    private Long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;

    public BankAccount( String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
    /// /////메서드
    public boolean chekBalance(long money){ //잔고 체크// 돈 꺼내려는데 모자르지 않는지
        if(this.balance<money){
            return false;
        }else{
            return true;
        }
    }
    public void withdraw(long money){
        this.balance =balance-money;
    }

    public void deposit(long money){
        this.balance = balance+money;
    }

    public void transfer(BankAccount targetAccount, long money){
        if(this.balance<money){
            return;
        }
        this.balance-=money;
        targetAccount.balance+=money;
    }




    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}