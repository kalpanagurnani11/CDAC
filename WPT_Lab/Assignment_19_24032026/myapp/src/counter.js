import { useState, useCallback } from "react";

function Counter() {
  const [cnt, setCnt] = useState(0);

  const increment = useCallback(() => {
    setCnt(prev => prev + 1);
  }, []);

  const decrement = useCallback(() => {
    setCnt(prev => prev - 1);
  }, []);

  return (
    <div>
      <h2>Counter: {cnt}</h2>

      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
    </div>
  );
}

export default Counter;