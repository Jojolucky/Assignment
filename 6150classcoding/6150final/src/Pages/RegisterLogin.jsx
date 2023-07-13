import Login from '../Components/Login';
import Register from '../Components/Register';
import Welcome from '../Components/Welcome';
import './RegisterLogin.css';

function RegisterLogin({currentUser, setCurrentUser, loggedin, setLoggedin}){
    return (
        <>
            {loggedin? 
                <>
                    <div className='welcome__page'>
                        <Welcome currentUser={currentUser} setLoggedin={setLoggedin} />
                    </div>
                </> : 
                <>
                    <div className='login__page'>
                        <Login setCurrentUser={setCurrentUser} setLoggedin={setLoggedin}/>
                    </div>
                    <div className='register__page'>
                        <Register setCurrentUser={setCurrentUser} setLoggedin={setLoggedin}/>
                    </div>
                </>
            }
           
        </>
        
    );
}
export default RegisterLogin;