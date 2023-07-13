import {footer_menu} from "../Data/structure_data";
import "./Footer.css";

function Footer({selectPage, theme}) {
    const footerTheme = `footer__${theme}`;
    const uls = footer_menu.map(ul => {
        const lis = ul.list.map(item => {
            return (<li className="footer-list__item" key={item.name}>
                <a className={`footer-list__link ${footerTheme}`} href={item.path} onClick={e => {
                    selectPage(e);
                }}>{item.name}</a>
            </li>)
        });
        return (
            <ul className={`footer-list footer-list__${ul.type}`} key={ul.type}>
                {lis}
            </ul>
        )
    });
    return (
        <footer className={`footer ${footerTheme}`}>
            {uls}
        </footer>
    );
}
export default Footer;