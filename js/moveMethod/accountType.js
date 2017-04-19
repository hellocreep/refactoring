class AccountType {
  constructor(isPremium){
    this.premium = isPremium;
  }
  isPremium(){
    return this.premium;
  }
  overdraftCharge(daysOverdrawn){
    if(this.isPremium()){
      let result = 10;
      return daysOverdrawn > 7
        ? (daysOverdrawn - 7) * 0.85 + result
        : result;
    }else{
      return daysOverdrawn * 1.75;
    }
  }
}

module.exports = AccountType;
