import React, { useState, useEffect } from "react";

function Clock({ zone, name }) {
  const [time, setTime] = useState("");

  useEffect(() => {
    setInterval(() => {
      const t = new Date().toLocaleTimeString("en-US", { timeZone: zone });
      setTime(t);
    }, 1000);
  }, []);

  return (
    <div>
      <h3>{name}</h3>
      <p>{time}</p>
    </div>
  );
}

function App() {
  return (
    <div>
      <Clock zone="Asia/Kolkata" name="India" />
      <Clock zone="America/New_York" name="USA" />
      <Clock zone="Europe/London" name="UK" />
    </div>
  );
}

export default App;