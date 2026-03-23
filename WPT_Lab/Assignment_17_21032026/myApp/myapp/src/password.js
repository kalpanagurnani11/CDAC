// ) create RandomPassword Generator Function
// Component
// use useState , useEffect and useCallBack Hooks 
//  as discussed in Lecture 
import React, { useState, useEffect, useCallback } from "react";

export default function Pass() {
  const [p, setP] = useState("");
  const [l, setL] = useState(8);
  const [n, setN] = useState(false);
  const [s, setS] = useState(false);

  const gen = useCallback(() => {
    let str = "a-zA-Z";
    str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    if (n) str += "0123456789";
    if (s) str += "!@#$%";

    let res = "";
    for (let i = 0; i < l; i++)
      res += str[Math.floor(Math.random() * str.length)];

    setP(res);
  }, [l, n, s]);

  useEffect(gen, [l, n, s]);

  return (
    <>
      <input value={p} readOnly />

      <input type="number" value={l} onChange={e => setL(e.target.value)} />

      <label>
        <input type="checkbox" onChange={() => setN(!n)} />Num
      </label>

      <label>
        <input type="checkbox" onChange={() => setS(!s)} />Sym
      </label>

      <button onClick={gen}>Gen</button>
    </>
  );
}