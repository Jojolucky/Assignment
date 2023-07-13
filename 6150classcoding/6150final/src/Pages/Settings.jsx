import { useState } from 'react';
import './Settings.css';

function Settings({setTheme}){
    const [selectTheme, setSelectTHeme] = useState("bright");
    return (
        <div className="settings__panel">
            <h2>Settings</h2>
            <div className='settings__mode'>
                Please select a mode:
                <ul className="settings__list">
                    <li>
                        <input type="radio" id="bright" name="settings__options" onClick={e => {
                            setSelectTHeme("bright");
                        }}/>
                        <label htmlFor="bright">Bright</label>
                    </li>
                    <li>
                        <input type="radio" id="dark" name="settings__options" onClick={e => {
                            setSelectTHeme("dark");
                        }}/>
                        <label htmlFor="dark">Dark</label>
                    </li>
                </ul>
            </div>
            
            <button className="settings__submit" onClick={e => {
                setTheme(selectTheme);
                console.log(selectTheme);
            }}>
                Submit
            </button>
        </div>
    )
}
export default Settings;