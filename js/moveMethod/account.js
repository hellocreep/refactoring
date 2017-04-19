const AccountType =  require('./accountType');

class Account {
  constructor(isPremium,daysOverdrawn){
    this.type = new AccountType(isPremium);
    this.daysOverdrawn = daysOverdrawn;
  }

  overdraftCharge(){

    const daysOverdrawn = this.daysOverdrawn;
    if(this.type.isPremium()){
      let result = 10;
      return daysOverdrawn > 7
        ? (daysOverdrawn - 7) * 0.85 + result
        : result;
    }else{
      return daysOverdrawn * 1.75;
    }
  }

  bankCharge(){
    let result = 4.5;
    return this.daysOverdrawn > 0
      ? result + this.overdraftCharge()
      : result;
  }
}

module.exports = Account;
