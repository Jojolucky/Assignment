import LatestNews from './LatestNews';
import About from './About';
import RecentEvents from './RecentEvents';
import RegisterLogin from './RegisterLogin';
import Settings from './Settings';
import "./Main.css"

function Main({page, selectPage, currentUser, setCurrentUser, loggedin, setLoggedin, theme, setTheme}) {
    const mainTheme = `main__${theme}`;
    return (
        <main className={`main ${mainTheme}`} id="main">
            {page === "/latest_news.html" && <LatestNews/>}
            {page === "/recent_events.html" && <RecentEvents selectPage={selectPage} loggedin={loggedin}
             currentUser={currentUser} setCurrentUser={setCurrentUser}/>}
            {page === "/about.html" && <About/>}
            {page === "/register_login.html" && <RegisterLogin currentUser={currentUser}
             setCurrentUser={setCurrentUser} loggedin={loggedin} setLoggedin={setLoggedin} />}
            {page === "/settings.html" && <Settings setTheme={setTheme}/>}
        </main>
    );
}
export default Main;