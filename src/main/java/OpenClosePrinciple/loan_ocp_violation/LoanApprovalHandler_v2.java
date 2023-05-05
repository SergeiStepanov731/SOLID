package OpenClosePrinciple.loan_ocp_violation;

public class LoanApprovalHandler_v2 {

    public void approvePersonalLoan(PersonalLoanValidator2 validator) {
        if (validator.isValid()) {
            //Process the loan.
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            //Process the loan.
        }
    }
    // Method for approving other loans.
}

class PersonalLoanValidator2 {
    public boolean isValid() {
        //Validation logic
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        //Validation logic
        return true;
    }
}