import { useState } from "react";
import data from './shopstock.json'

export default function ShopStock() {
    // const [data, setData] = useState([]);

    function load() {
        // fetch("shopstock.json")
        //     .then(res => res.json())
        //     .then(d => setData(d));
        console.log("loaded")
    }
    console.log(data)

    return (
        <div>
            <button onClick={load}>Load Data</button>

            <table border="2">
                <tr>
                    <th>id</th>
                    <th>item_name</th>
                    <th>cost_price</th>
                </tr>

                {data.map((i) => (
                    <tr>
                        <td>{i.id}</td>
                        <td>{i.item_name}</td>
                        <td>{i.unit_cost}</td>
                    </tr>
                ))}
            </table>
        </div>
    );
}