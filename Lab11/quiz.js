class Computer {
    constructor(ram,cpu,storage) {
      this._ram = ram;
      this._cpu=cpu;
      this._storage=storage;
    }

    runProgram(prgm) {
        console.log ("running: " + prgm)
    }
  }
  
  class Model extends Car {
    constructor(ram,cpu,storage,battery) {
      super(ram,cpu,storage);
      this._battery = battery;
    }
    carryArround() {
        console.log ("carrying laptop:  cpu" + super._cpu +" ram: " + super._ram + " storage: " + super._storage + " battery: " + this._battery);
    }
  }