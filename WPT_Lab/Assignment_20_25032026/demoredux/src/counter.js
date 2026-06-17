import React, { useReducer } from "react";

const reducer = (state, action) => {
  switch (action) {
    case "INC":
      return state + 1;
    case "DEC":
      return state - 1;
    case "RESET":
      return 0;
    default:
      return state;
  }
};

export default function Counter() {
  const [count, dispatch] = useReducer(reducer, 0);

  return (
    <>
      <h2>Count: {count}</h2>
      <button onClick={() => dispatch("INC")}>+</button>
      <button onClick={() => dispatch("DEC")}>-</button>
      <button onClick={() => dispatch("RESET")}>Reset</button>
    </>
  );
}