class SoccerTeam {
  private _name: string;
  private _wins: string;

  setName(name:string): void {
    this._name = name;
  }

  getName(): string{
    return this._name;
  }

  setWins(wins:string): void {
    this._wins = wins; 
  }

  getWins(): number{
    return parseInt(this._wins);
  }
}

export default SoccerTeam;