class TelePhone {
  private phoneNumber: string;
  private areaCode: string;

  constructor(phoneNumber, areaCode?) {
    this.phoneNumber = phoneNumber;
    this.areaCode = areaCode;
  }

  public setPhoneNumber(phoneNumber): void {
    this.phoneNumber = phoneNumber;
  }

  public getPhoneNumber(): string {
    return this.phoneNumber;
  }

}

export default TelePhone;