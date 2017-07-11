import Telephone from './telephone';

class Person {
  private name: string;
  private officeAreaCode: string;
  private telephone: Telephone;

  constructor(name: string, officeNumber?: string, officeAreaCode?: string) {
    this.name = name;
    this.officeAreaCode = officeAreaCode;
    this.telephone = new Telephone(officeNumber);
  }

  public setOfficeNumber(number: string): void {
    this.telephone.setPhoneNumber(number);
  }

  public getOfficeNumber(): string {
    return this.telephone.getPhoneNumber();
  }

  public setOfficeAreaCode(code: string): void {
    this.officeAreaCode = code;
  }

  public getOfficeAreaCode(): string {
    return this.officeAreaCode;
  }
}

export default Person;