import SoccerTeam from './SoccerTeam';

const row: SoccerTeam = new SoccerTeam();
row.setName('Liverpool');
row.setWins('15');

export const name: string = row.getName();

export const wins: number = parseInt(row.getWins());