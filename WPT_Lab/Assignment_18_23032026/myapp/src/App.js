import logo from './logo.svg';
import './App.css';
import Index from './web/index'
import demowithoutcallback from './demowithoutcallback';
import Demowithoutcallback from './demowithoutcallback';
import Color from './assignment_extra';
function App() {
  return (
    <div className="App">
      <Index> </Index>
      <Demowithoutcallback></Demowithoutcallback>
      <Color></Color>
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
