// допишите реализацию класса Smartphone
public class SmartPhone extends MobilePhone {

    public SmartPhone(String number){
        super(number);
    }
            // объявите метод sendEmail()
            public final void sendEmail (String messageText, String email){
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }

}