import { useState } from "react";

export default function ShopStock() {
    const [data, setData] = useState([]);

    function load() {
        fetch("shopstock.json")
            .then(res => res.json())
            .then(d => setData(d));
    }

    return (
        <div>
            <button onClick={load}>Load Data</button>

            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
            </table>
        </div>
    );
}