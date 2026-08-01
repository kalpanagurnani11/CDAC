import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    axios
      .get("https://localhost:7088/api/student") // Change port if needed
      .then((res) => setStudents(res.data))
      .catch((err) => console.log(err));
  }, []);

  return (
    <div>
      <h2>Student List</h2>

      {students.map((s) => (
        <p key={s.id}>
          {s.id} - {s.name}
        </p>
      ))}
    </div>
  );
}

export default App;