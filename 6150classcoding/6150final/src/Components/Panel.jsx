import "./Panel.css";
import Carousels from './Carousels';

function Panel({title, imgSrc, imgAlt, text, dir}){
    return (
        <div className="home_card">
            {/* <div className={`home_card__pic float_${dir}`}>
                <img
                    src={imgSrc}
                    alt={imgAlt} />
            </div> */}
            <div className={`home_card__carousels float_${dir}`}>
                <Carousels images={imgSrc} imgAlt={imgAlt}/>
            </div>
            <div className="card__text">
                <h3 className="card__title">{title}</h3>
                <p>{text}</p>
            </div>
        </div>
    )
}
export default Panel;