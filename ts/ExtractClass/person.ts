class Person {
  private name: string;
  private officeNumber: string;
  private officeAreaCode: string;

  constructor(name: string, officeNumber?: string, officeAreaCode?: string) {
    this.name = name;
    this.officeNumber = officeNumber;
    this.officeAreaCode = officeAreaCode;
  }

  public setOfficeNumber(number: string): void {
    this.officeNumber = number;
  }

  public getOfficeNumber(): string {
    return this.officeNumber;
  }

  public setOfficeAreaCode(code: string): void {
    this.officeAreaCode = code;
  }

  public getOfficeAreaCode(): string {
    return this.officeAreaCode;
  }
}

export default Person;