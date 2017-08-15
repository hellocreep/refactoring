class SoccerTeam {
  _data: string[] = new Array(3);

  setName(name:string): void {
    this._data[0] = name;
  }

  getName(): string{
    return this._data[0];
  }
}

export default SoccerTeam;