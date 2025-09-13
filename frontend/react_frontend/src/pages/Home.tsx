import Menu from "../components/Menu";
import CardProduct from "../components/CardProduct";

const Home: React.FC = () => {
    return (
        <>
            <Menu/>
            {
            Array.from({ length: 10 }).map((_, i) => (
                <p key={i}><CardProduct/></p>
            ))
            }
        </>
    )
}

export default Home;