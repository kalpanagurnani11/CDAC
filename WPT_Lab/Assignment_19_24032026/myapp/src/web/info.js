import { useEffect, useState, useContext } from "react";
import axios from "axios";
import { ctx } from "./index";

export default function Info() {
  const [data, setData] = useState([]);
  const { username } = useContext(ctx);

  useEffect(() => {
    axios.get("https://fakestoreapi.com/products")
      .then(res => setData(res.data));
  }, []);

  return (
    <>
      <h2>Hello {username} - Info</h2>

      {data.map(i => (
        <p key={i.id}>{i.title} - ₹{i.price}</p>
      ))}
    </>
  );
}