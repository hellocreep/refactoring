const AccountType =  require('./accountType');

class Account {
  constructor(isPremium,daysOverdrawn){
    this.type = new AccountType(isPremium);
    this.daysOverdrawn = daysOverdrawn;
  }

  overdraftCharge(){

      return this.type.overdraftCharge(this.daysOverdrawn);
  }

  bankCharge(){
    let result = 4.5;
    return this.daysOverdrawn > 0
      ? result + this.overdraftCharge()
      : result;
  }
}

module.exports = Account;
