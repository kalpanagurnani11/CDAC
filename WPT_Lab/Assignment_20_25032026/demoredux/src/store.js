import { createStore } from "redux";

const initialState = {
  todos: []
};

const reducer = (state = initialState, action) => {
  switch (action.type) {
    case "ADD":
      return {
        ...state,
        todos: [...state.todos, action.payload]
      };
    case "DELETE":
      return {
        ...state,
        todos: state.todos.filter((_, i) => i !== action.payload)
      };
    default:
      return state;
  }
};

export const store = createStore(reducer);