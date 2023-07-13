import Panel from "../Components/Panel";
import {panelData} from "../Data/news_data";
import "./LatestNews.css";

function LatestNews() {
    const panels = panelData.map(item => {
        return (
            <div className="home_panel" key={item.title}>
                <Panel title={item.title} imgSrc={item.imgSrc} imgAlt={item.imgAlt} text={item.text} dir={item.floatDir}/>
            </div>
        )
    })
    return (
        <>
            <h2 className="home__title">Latest News</h2>
            <div className="home__main">
                {panels}
            </div>
        </>
    )
}

export default LatestNews;