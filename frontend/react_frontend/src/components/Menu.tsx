import { GoArchive } from "react-icons/go";

const Menu: React.FC = () => {
    return (
        <menu className="flex flex-row mx-5 justify-between bg-amber-500">
            <div className="flex flex-row">
                <div className="mx-5">Soknan</div>
                <div className="mx-5">Home</div>
                <div className="mx-5">Add Product</div>
                <div className="mx-5">Categories</div>
                <div className="mx-5">Disbled</div>
            </div>
            <div className="flex flex-row">
                <div className="flex flex-row mx-5">
                    <GoArchive className="mx-1.5"/>
                    <div className="mx-1.5">Cart</div>
                </div>
                <div className="mx-5">
                    <input className="border border-b-emerald-950 " type="text" placeholder="Search"/>
                </div>
                <div className="mx-5">
                    <button>Search<br/>Products</button>
                </div>
            </div>
        </menu>
    )
}


export default Menu;