import {cardData} from "../Data/events_data";
import Card from "../Components/Card";
import "./RecentEvents.css";

function RecentEvents({selectPage, loggedin, currentUser, setCurrentUser}){
    const catCards = cardData.map(item =>{
        return (
            <div className="cat_card" key={item.title}>
                <Card title={item.title} imgSrc={item.imgSrc} 
                imgAlt={item.imgAlt} text={item.text} selectPage={selectPage}
                path={item.path} loggedin={loggedin} currentUser={currentUser} setCurrentUser={setCurrentUser}/>
            </div>
        );
    });
    return (
        <>
            <h2 className="cat_title">Recent Events</h2>
            <div className="cat_main__content">
                {catCards}
            </div>
        </>
    )
}
export default RecentEvents;