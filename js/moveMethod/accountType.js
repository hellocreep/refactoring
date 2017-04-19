class AccountType {
  constructor(isPremium){
    this.premium = isPremium;
  }
  isPremium(){
    return this.premium;
  }
}

module.exports = AccountType;
