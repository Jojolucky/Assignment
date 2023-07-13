import './App.css';
import Header from './Pages/Header';
import Main from './Pages/Main';
import Footer from './Pages/Footer';
import { useState } from 'react';
import { useEffect } from 'react';

function App() {
  // console.log(localStorage);
  let cur_user = localStorage.getItem('cur_user');
  let cur_loggedin = false;
  if(cur_user){
    cur_user = JSON.parse(cur_user);
    cur_loggedin = true;
  }else{
    cur_user = {
      username: "n/a",
      useremail: "n/a",
      userpassword: "n/a",
      userevents: [],
    };
    cur_loggedin = false;
  }
  const [page, setPage] = useState("/latest_news.html");
  const [currentUser, setCurrentUser] = useState(cur_user);
  const [loggedin, setLoggedin] = useState(cur_loggedin);
  const [theme, setTheme] = useState("bright");

  function selectPage (event) {
    event.preventDefault();
    const target = event.target.getAttribute("href");
    setPage(target);
  }
  useEffect(()=>{
    document.title = "The Animal Kingdom";
  })

  return (
    <div className='app'>
      <Header selectPage={selectPage} theme={theme}></Header>
      <Main page={page} selectPage={selectPage} currentUser={currentUser}
       setCurrentUser={setCurrentUser} loggedin={loggedin} setLoggedin={setLoggedin}
       theme={theme} setTheme={setTheme}></Main>
      <Footer selectPage={selectPage} theme={theme}></Footer>
    </div>
  );
}

export default App;
