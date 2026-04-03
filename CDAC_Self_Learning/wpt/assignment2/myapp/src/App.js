import React, { useState } from "react";
import logo from './logo.svg';
import './App.css';
import HtmlReact from "./htmlreact_12";
import ClockCountries from "./clock_countries__13";
import Clock14 from "./clock_14";
import Q15 from "./dropdown_15";  
import ReduxApp from "./redux_16";

function App() {
   const [show, setShow] = useState(true);
  return (
    <div className="App">
      <h2>Q12</h2>
      <HtmlReact />

      <h2>Q13</h2>
      <ClockCountries />

      <h2>Q14</h2>
      {show && <Clock14 remove={() => setShow(false)} />}
        <h2>Q15</h2>
          <Q15 />

      <h2>Q16</h2>
      <ReduxApp />
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
    </div>
  );
}

export default App;
