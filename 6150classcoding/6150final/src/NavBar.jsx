function NavBar ({setPage}){
    const changePage = (e, page) => {
        e.preventDefault();
        setPage(page);
    }
    return (
        <nav>
            <ul>
                <li>
                    <a href="/" onClick={ e => {changePage(e, "Home")}}>Home</a>
                </li>
                <li>
                    <a href="/" onClick={ e => {changePage(e, "About")}}>About</a>
                </li>
            </ul>
        </nav>
    )
}

export default NavBar;