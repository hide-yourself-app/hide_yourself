import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './component/Header';
import Login from './component/Login';
import Register from './component/Register';

function App() {
  return (<div className='App'>
      <Header />
      <Router>
        <Routes>
          <Route path='/' element={<Login />} />
          <Route path='register' element={<Register />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
