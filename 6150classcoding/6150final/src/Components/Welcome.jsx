import './Welcome.css';

function Welcome({currentUser, setLoggedin}){
    console.log("wel", currentUser);
    return (
        <>
            <div className="welcome__title">
                <h2>Welcome {currentUser.username}</h2>
            </div>
            <div className='welcome__logout'>
                <ul className='welcome__userInfo'>
                    <li>
                        Email: {currentUser.useremail}
                    </li>
                </ul>
                <button className='welcome_button' onClick={e => {
                    setLoggedin(false);
                    localStorage.setItem('cur_user', "");
                    }}>Log Out</button>
            </div>
        </>
    )
}
export default Welcome;