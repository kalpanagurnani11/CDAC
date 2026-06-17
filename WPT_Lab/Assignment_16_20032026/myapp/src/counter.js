const { Component } = require("react");

export default class Counter extends Component {
    constructor() {
        super();
        this.increment = this.increment.bind(this);
        this.decrement = this.decrement.bind(this);

        this.state = {
            cnt: 0
        };
    }

    increment() {
        this.setState({
            cnt: this.state.cnt + 1
        });
    }

    decrement() {
        this.setState({
            cnt: this.state.cnt - 1
        });
    }

    render() {
        return (
            <>
                <p>count {this.state.cnt}</p>

                <button onClick={this.increment}>Increment</button>
                <button onClick={this.decrement}>Decrement</button>
            </>
        );
    }
}