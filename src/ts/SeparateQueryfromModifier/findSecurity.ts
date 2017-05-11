export function findMiscreant(persons: Array < string > ): string {
    let found = '';
    for (let i = 0; i < persons.length; i++) {
        if (!found) {
            if (persons[i] === 'driver') {
                sendAlert();
                found = 'driver';
            }
            if (persons[i] === 'pm') {
                sendAlert();
                found = 'pm';
            }
        }
    }
    return found;
}

export function sendAlert(): void {}

export function checkSecurity(persons: string[]): string {
    const spy = findMiscreant(persons);
    return spy;
}

