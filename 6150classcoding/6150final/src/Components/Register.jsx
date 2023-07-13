import { useState } from "react";
import './Register.css';
// import { users } from '../data/users_data';

function Register({setCurrentUser, setLoggedin}){
    const [username, setUsername] = useState("");
    const [useremail, setUseremail] = useState("");
    const [confirmEmail, setConfirmEmail] = useState("");
    const [userpassword, setUserpassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    return (
        <>
            <div className="register__title">
                <h2>Register</h2>
            </div>
            <form className='register__form'>
                <div className="register__field">
                    <label htmlFor="register-username">Username<span>*</span></label>
                    <input type="text" id="register-username" placeholder="Input username" onInput={e => {
                        setUsername(e.target.value);
                    }}/>
                </div>
                <div className="register__field">
                    <label htmlFor="register-email">Email<span>*</span></label>
                    <input type="email" id="register-email" placeholder="Input password" onInput={e => {
                        setUseremail(e.target.value);
                    }}/>
                </div>
                <div className="register__field">
                    <label htmlFor="register-confirm_email">Confirm Email<span>*</span></label>
                    <input type="email" id="register-confirm_email" placeholder="Input password" onInput={e => {
                        setConfirmEmail(e.target.value);
                    }}/>
                </div>
                <div className="register__field">
                    <label htmlFor="register-password">Password<span>*</span></label>
                    <input type="password" id="register-password" placeholder="Input password" onInput={e => {
                        setUserpassword(e.target.value);
                    }}/>
                </div>
                <div className="register__field">
                    <label htmlFor="register-confirm_password">Confirm Password<span>*</span></label>
                    <input type="password" id="register-confirm_password" placeholder="Input password" onInput={e => {
                        setConfirmPassword(e.target.value);
                    }}/>
                </div>
                <div className='register__field'>
                    <button className="register__button" onClick={e => {
                        // localStorage.clear();
                        e.preventDefault();
                        // check input
                        if(username === "" || useremail === ""){
                            alert("Username or Email cannot be empty");
                            return;
                        }
                        if(useremail !== confirmEmail){
                            alert("Please Confirm the Email Again");
                            return;
                        }
                        if(userpassword === ""){
                            alert("Password cannot be empty");
                            return;
                        }
                        if(userpassword !== confirmPassword){
                            alert("Please Confirm the Password Again");
                            return;
                        }
                        let at = useremail.indexOf('@');
                        let dot = useremail.indexOf('.');
                        if(at === -1 || dot === -1 || (at > dot) || at === 0 || dot === useremail.length - 1 || at + 1 === dot){
                            alert("Email Format Invalid");
                            return;
                        }

                        // check the username and useremail
                        let users = JSON.parse(localStorage.getItem('users'));
                        if(users){
                            for(let i = 0; i < users.length; i++){
                                if(useremail === users[i].useremail){
                                    alert("Email Already Exist");
                                    return;
                                }
                                if(username === users[i].username){
                                    alert("Username Already Exist");
                                    return;
                                }
                            }
                            let user = {
                                username: username,
                                useremail: useremail,
                                userpassword: userpassword,
                                userevents: [],
                            }
                            users.push(user);
                            localStorage.setItem('users', JSON.stringify(users));
                            console.log(user);
                            console.log("current localstorage", localStorage);
                            // jump to loggedin page
                            setCurrentUser(user);
                            setLoggedin(true);
                            localStorage.setItem('cur_user', JSON.stringify(user));
                        }else{
                            let users = [
                                {
                                    username: username,
                                    useremail: useremail,
                                    userpassword: userpassword,
                                    userevents:[],
                                }
                            ];
                            console.log("initial",users);
                            localStorage.setItem('users', JSON.stringify(users));
                            setCurrentUser(users[0]);
                            setLoggedin(true);
                            localStorage.setItem('cur_user', JSON.stringify(users[0]));
                        }     
                        
                    }}>Register</button>
                </div>   
            </form>
        </>
    )
}
export default Register;