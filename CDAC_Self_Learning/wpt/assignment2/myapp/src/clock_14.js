import React, { useState, useEffect } from "react";

function Clock14({ zone, name, remove }) {

  const [time, setTime] = useState("");
  const [bg, setBg] = useState("");

  useEffect(() => {
    const interval = setInterval(() => {

      const t = new Date().toLocaleTimeString("en-US", {
        timeZone: zone
      });

      setTime(t);

      if (t.includes("AM")) {
        setBg("lightblue");
      } else {
        setBg("lightpink");
      }

    }, 1000);

    return () => clearInterval(interval);
  }, [zone]);

  return (
    <div style={{ background: bg, padding: "10px", margin: "10px" }}>
      <h3>{name}</h3>
      <p>{time}</p>
      <button onClick={remove}>Close</button>
    </div>
  );
}

export default Clock14;