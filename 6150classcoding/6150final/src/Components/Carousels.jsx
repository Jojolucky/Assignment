import { useState } from 'react';
import './Carousels.css';
function Carousels({images, imgAlt}){
    const length = images.length;
    const [imgIndex, setImgIndex] = useState(0);
    return (
        <>
            <div className='carousels__image'>
                <img src={images[imgIndex]} alt={imgAlt} />
            </div>
            <button className="carousels__left-arrow" onClick={() => {
                    const cur = (imgIndex - 1 + length) % length;
                    setImgIndex(cur);
                }}>
                <i className="gg-chevron-left"/>
            </button>
            <button className='carousels__right-arrow' onClick={() => {
                    const cur = (imgIndex + 1) % length;
                    setImgIndex(cur);
                }}>
                <i className="gg-chevron-right"/>
            </button>
        </>
    )
}
export default Carousels;