import Telephone from './telephone';

class Person {
  private name: string;
  private telephone: Telephone;

  constructor(name: string, officeNumber?: string, officeAreaCode?: string) {
    this.name = name;
    this.telephone = new Telephone(officeNumber, officeAreaCode);
  }

  public setOfficeNumber(number: string): void {
    this.telephone.setPhoneNumber(number);
  }

  public getOfficeNumber(): string {
    return this.telephone.getPhoneNumber();
  }

  public setOfficeAreaCode(code: string): void {
    this.telephone.setAreaCode(code);
  }

  public getOfficeAreaCode(): string {
    return this.telephone.getAreaCode();
  }
}

export default Person;