import './Header.css'
import GlobalNav from '../Components/GlobalNav'

function Header({selectPage, theme}) {
    const headerTheme = `header__${theme}`;
    return (
        <header className={`header ${headerTheme}`}>
            <img src="http://placekitten.com/100/100?image=1" className="header__logo" alt="logo" />
            <a href="#main" className="skip">Skip to main content</a>
            <h1 className="header__title">The Animal Kingdom</h1>
            <div className="header__nav">
                <GlobalNav selectPage={selectPage} theme={theme}></GlobalNav>
            </div>
        </header>
    )
}
export default Header