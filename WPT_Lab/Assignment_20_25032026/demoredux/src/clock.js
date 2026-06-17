import React, { useEffect, useState } from "react";

export default function Clock() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    setInterval(() => {
      const now = new Date();
      setTime(now);

      const hours = now.getHours();
      if (hours < 12) {
        document.body.style.backgroundColor = "lightyellow"; // AM
      } else {
        document.body.style.backgroundColor = "lightblue"; // PM
      }
    }, 1000);
  }, []);

  return <h2>{time.toLocaleTimeString()}</h2>;
}