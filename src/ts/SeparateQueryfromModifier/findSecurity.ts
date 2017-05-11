function findMiscreant(persons: Array < string > ): void {
    let found = '';
    for (let i = 0; i < persons.length; i++) {
        if (!found) {
            if (persons[i] === 'driver') {
                sendAlert();
                return;
            }
            if (persons[i] === 'pm') {
                sendAlert();
                return;
            }
        }
    }
    return;
}

function sendAlert(): void {}

export function checkSecurity(persons: string[]): string {
    findMiscreant(persons);
    const spy = findPerson(persons);
    return spy;
}

function findPerson(persons) : string {
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