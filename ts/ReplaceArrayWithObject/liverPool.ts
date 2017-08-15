import SoccerTeam from './SoccerTeam';

const row: SoccerTeam = new SoccerTeam();
row._data[0] = 'Liverpool';
row._data[1] = '15';

export const name: string = row._data[0];

export const wins: number = parseInt(row._data[1]);