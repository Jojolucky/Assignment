import './Login.css';
import { useState } from 'react';
// import { users } from '../data/users_data';

const loginMethod = ["Username", "Email"];
function LoginInput({method, setAccount}) {
    return (
        <>
            {method === 0 && 
            <div className="login__field">
                <label htmlFor="login-username">Username<span>*</span></label>
                <input type="text" id="login-username" placeholder="Input Username" onInput={e => {
                    setAccount(e.target.value);
                }}/>
            </div>}
            {method === 1 && 
            <div className="login__field">
                <label htmlFor="login-useremail">Email<span>*</span></label>
                <input type="email" id="login-useremail" placeholder="Input Email" onInput={e =>{
                    setAccount(e.target.value);
                }}/>
            </div>}
        </>
    )
}

function Login({setCurrentUser, setLoggedin}){
    const [method, setMethod] = useState(0);
    const [account, setAccount] = useState();
    const [password, setPassword] = useState();
    const [showList, setShowList] = useState(false);
    return (
        <>
            <div className="login__title">
                <h2>Login</h2>
            </div>
            <form className='login__form'>
                <LoginInput method={method} setAccount={setAccount}/>
                <div className="login__field">
                    <label htmlFor="login-password">Password<span>*</span></label>
                    <input type="password" id="login-password" placeholder="Input password" onInput={e => {
                        setPassword(e.target.value);
                    }}/>
                </div>
                <div className="login__field-line">
                    <input type="checkbox" id="login-remember" className='login__checkbox' onClick={e => {
                        // console.log(e.target.checked);
                        setShowList(e.target.checked);
                    }}/>
                    <label htmlFor="login-remember">Remember Me</label>
                </div>
                {
                    showList && 
                    <ul className='login__field-list'>
                        <li>
                            <input type="radio" id='login__1-day' name='login__howLong'/>
                            <label htmlFor="login__1-day">1 day</label>
                        </li>
                        <li>
                            <input type="radio" id='login__3-days' name='login__howLong'/>
                            <label htmlFor="login__3-days">3 days</label>
                        </li>
                        <li>
                            <input type="radio" id='login__7-days' name='login__howLong'/>
                            <label htmlFor="login__7-days">7 days</label>
                        </li>
                        <li>
                            <input type="radio" id='login__30-days' name='login__howLong'/>
                            <label htmlFor="login__30-days">30 days</label>
                        </li>
                    </ul>
                }
                
                <div className='login__bottom'>
                    <button className="login__button" onClick={e => {
                        e.preventDefault();
                        // check input
                        if(account === ""){
                            alert("Username or Email cannot be empty");
                            return;
                        }
                        if(password === ""){
                            alert("Password cannot be empty");
                            return;
                        }
                        if(method === 1){
                            let at = account.indexOf('@');
                            let dot = account.indexOf('.');
                            if(at === -1 || dot === -1 || (at > dot) || at === 0 || dot === account.length - 1 || at + 1 === dot){
                                alert("Email Format Invalid");
                                return;
                            }
                        }
                        // check the user
                        if(localStorage.getItem('users')){
                            let users = JSON.parse(localStorage.getItem('users'));
                            let user_valid = false;
                            let cur_user = {};
                            if(method === 0){
                                for(let i = 0; i < users.length; i++){
                                    if(account === users[i].username && password === users[i].userpassword){
                                        cur_user = users[i];
                                        user_valid = true;
                                    }
                                }
                            }else{
                                for(let i = 0; i < users.length; i++){
                                    if(account === users[i].useremail && password === users[i].userpassword){
                                        cur_user = users[i];
                                        user_valid = true;
                                    }
                                }
                            }
                            //
                            if(user_valid){
                                setCurrentUser(cur_user);
                                setLoggedin(true);
                                localStorage.setItem('cur_user', JSON.stringify(cur_user));
                            }else{
                                alert("Check Username or Password");
                            }
                        }else{
                            alert("No Registered Users");
                            return;
                        }
                    }}>Login</button>
                    <button className='login__switch' onClick={e => {
                            e.preventDefault();
                            setMethod(method === 0? 1 : 0);
                        }
                    }>Use {loginMethod[method === 0? 1 : 0]} to Login</button>
                </div>  
            </form>
            <div className='login__notes'>
                <div className='note_text'>
                    <h3>Notes:</h3>
                    User registration and logging in is enabled by taking advantage of localStorage. LocalStorage 
                    can store the users' information including users' username, useremial, userpassword, registered events, etc.
                </div>
            </div>
        </>
    )
}
export default Login;