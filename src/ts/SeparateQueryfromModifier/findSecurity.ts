// tslint:disable-next-line:array-type
function findMiscreant(persons: Array<string> ): void {
    if (findPerson(persons) !== '') {
        sendAlert();
    }
}

// tslint:disable-next-line:no-empty
function sendAlert(): void {}

export function checkSecurity(persons: string[]): string {
    findMiscreant(persons);
    const spy = findPerson(persons);
    return spy;
}

function findPerson(persons): string {
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < persons.length; i++) {
        if (persons[i] === 'driver') {
            return 'driver';
        }
        if (persons[i] === 'pm') {
            return 'pm';
        }
    }
    return '';
}
