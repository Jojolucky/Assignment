import { useState } from "react";
import "./Card.css";
import Carousels from './Carousels';

function Card ({title, imgSrc, imgAlt, text, selectPage, path, loggedin, currentUser, setCurrentUser}){
    // let registerButton = "Register for Event";
    let buttonCss = "open_subscribe";
    let buttonText = "Register for Event";
    if(loggedin){
        let events = currentUser.userevents;
        for(let i = 0; i < events.length; i++){
            if(events[i] === title){
                buttonText = "Already Registered";
                buttonCss = "close_subscribe";
                break;
            }
        }
    }
    const [registerButton, setRegisterButton] = useState(buttonText);
    const [registerButtonCss, setRegisterButtonCss] = useState(buttonCss);
    return (
        <>
            <div className="cat_card__carousels">
                <Carousels images={imgSrc} imgAlt={imgAlt}/>
            </div>
            <div className="cat_card__text">
                <h3 className="cat_card__title">{title}</h3>
                <p>{text}</p>

            </div>
            <div className="cat_card__subscribe">
                <button type="button" className={registerButtonCss} onClick={e => {
                    if(!loggedin){
                        alert("Please Log in First");
                        return;
                    }
                    let users = JSON.parse(localStorage.getItem('users'));
                    for(let i = 0; i < users.length; i++){
                        if(currentUser.username === users[i].username){
                            let cur_events = users[i].userevents;
                            for(let j = 0; j < cur_events.length; j++){
                                if(cur_events[j] === title){
                                    // alert("Already Added This Event");
                                    // delete cur_events[j];
                                    users[i].userevents = cur_events.filter(
                                        item => item !== title
                                    );
                                    localStorage.setItem('users', JSON.stringify(users));
                                    localStorage.setItem('cur_user', JSON.stringify(users[i]));
                                    setRegisterButton("Register for Event");
                                    setRegisterButtonCss("open_subscribe");
                                    console.log(localStorage);
                                    return;
                                }
                            }
                            users[i].userevents.push(title);
                            localStorage.setItem('users', JSON.stringify(users));
                            localStorage.setItem('cur_user', JSON.stringify(users[i]));
                            setRegisterButton("Already Registered");
                            setRegisterButtonCss("close_subscribe");
                            console.log(localStorage);
                            break;
                        }
                    }
                }}>
                    {registerButton}
                </button>
            </div>
        </>
    )
}
export default Card;