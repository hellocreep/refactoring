const AccountType =  require('./accountType');

class Account {
  constructor(isPremium,daysOverdrawn){
    this.type = new AccountType(isPremium);
    this.daysOverdrawn = daysOverdrawn;
  }

  bankCharge(){
    let result = 4.5;
    return this.daysOverdrawn > 0
      ? result + this.type.overdraftCharge(this.daysOverdrawn)
      : result;
  }
}

module.exports = Account;
