import { useState } from "react";
import { nav_menu } from "../Data/structure_data";
import "./GlobalNav.css";
import "../cssgg.css";

function GlobalNav({ selectPage, theme }) {
  const [showMenu, setShowMenu] = useState(false);
  const globalNavTheme = `global-nav__${theme}`;
  const li = nav_menu.map((item) => {
    return (
      <li className="global-nav__item" key={item.name}>
        <a
          className={`global-nav__link ${globalNavTheme}`}
          href={item.path}
          onClick={(e) => {
            selectPage(e);
            setShowMenu(false);
          }}
        >
          {item.name}
        </a>
      </li>
    );
  });
  const showClass = showMenu ? "global-nav__list--open" : "";
  return (
    <>
      <nav className={"global-nav"}>
        <button
          className="global-nav__button"
          onClick={() => {
            setShowMenu(!showMenu);
          }}
          aria-label={showMenu ? "Close Menu" : "Open Menu"}
        >
          <i className="gg-menu" />
        </button>
        <ul className={`global-nav__list ${showClass}`}>{li}</ul>
      </nav>
    </>
  );
}
export default GlobalNav;
