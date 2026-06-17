import React, { useEffect, useState } from "react";

export default function P1() {
  const [d, setD] = useState([]);

  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then(r => r.json())
      .then(setD)
      .catch(console.log);
  }, []);

  return (
    <table border="1">
      <thead>
        <tr>
          <th>ID</th><th>Title</th><th>Price</th>
        </tr>
      </thead>

      <tbody>
        {d.map(({ id, title, price }) => (
          <tr key={id}>
            <td>{id}</td>
            <td>{title}</td>
            <td>{price}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}