package OpenClosePrinciple.loan_ocp_solution;

public class LoanApprovalHandler { // Данный класс закрыт для модификации

    public void approveLoan(Validator validator){ /* Программирование абстракциями, а не реализациями. Данный метод зависит от абстракции (интерфейса).
                                                     На вход может поступить любой экземпляр класса, который реализует интерфейс Validator           */

        if (validator.isValid()){
            //Process the loan
        }
    }
}
