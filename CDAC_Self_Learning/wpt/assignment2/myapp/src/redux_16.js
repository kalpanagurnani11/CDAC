import React from "react";
import { createStore } from "redux";
import { useSelector, useDispatch } from "react-redux";

const initialState = { clocks: [] };

function reducer(state = initialState, action) {
  if (action.type === "ADD") {
    return { ...state, clocks: [...state.clocks, action.payload] };
  }

  if (action.type === "REMOVE") {
    return {
      ...state,
      clocks: state.clocks.filter((_, i) => i !== action.index)
    };
  }

  return state;
}

export const store = createStore(reducer);

function ReduxApp() {
  const clocks = useSelector(state => state.clocks);
  const dispatch = useDispatch();

  return (
    <div>
      <h2>Redux Clock</h2>

      <button onClick={() => {
        dispatch({ type: "ADD", payload: { name: "India" } });
      }}>
        Add
      </button>

      {clocks.map((c, i) => (
        <div key={i}>
          <p>{c.name}</p>
          <button onClick={() => dispatch({ type: "REMOVE", index: i })}>
            Remove
          </button>
        </div>
      ))}
    </div>
  );
}

export default ReduxApp;