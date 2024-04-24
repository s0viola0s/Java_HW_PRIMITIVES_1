public class Main {
    public static void main(String[] args) {

        double ticketCost = 13676; //переменная для стоимости билета. тип double выбран т.к. стоимость может быть не целым числом

        int miles = (int) ticketCost / 20; //переменная для вычисления бонусных миль. тип int, т.к. по условию задачи мили - целое число

        System.out.println("За билет стоимостью " + ticketCost + " руб. будет начислено " + miles + " миль");
    }
}