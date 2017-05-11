function findMiscreant(persons: Array < string > ): string {
    let found = '';
    for (let i = 0; i < persons.length; i++) {
        if (!found) {
            if (persons[i] === 'driver') {
                sendAlert();
                return findPerson(persons);
            }
            if (persons[i] === 'pm') {
                sendAlert();
                return findPerson(persons);
            }
        }
    }
    return findPerson(persons);
}

function sendAlert(): void {}

export function checkSecurity(persons: string[]): string {
    const spy = findMiscreant(persons);
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