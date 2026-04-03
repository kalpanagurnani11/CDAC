import React, { useState } from "react";
import Clock14 from "./clock_14";

function Q15() {

  const [clocks, setClocks] = useState([]);

  const addClock = (zone, name) => {
    setClocks([...clocks, { zone, name }]);
  };

  return (
    <div>
      <h2>Clock App</h2>

      <select id="zone">
        <option value="Asia/Kolkata">India</option>
        <option value="America/New_York">USA</option>
        <option value="Europe/London">UK</option>
      </select>

      <button onClick={() => {
        const z = document.getElementById("zone").value;
        addClock(z, z);
      }}>
        Add
      </button>

      {clocks.map((c, i) => (
        <Clock14
          key={i}
          zone={c.zone}
          name={c.name}
          remove={() => {
            setClocks(clocks.filter((_, index) => index !== i));
          }}
        />
      ))}

    </div>
  );
}

export default Q15;