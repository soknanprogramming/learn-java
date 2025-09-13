const CardProduct: React.FC = () => {
    return (
        <>
            <div className="bg-blue-400 h-28 w-52 m-5">
                <h2>LAPTOP</h2>
                <div className="flex flex-row">
                    <div className="flex flex-col">
                        <div>~ Asus</div>
                        <div>$9999</div>
                    </div>
                    <button>
                        Add to Cart
                    </button>
                </div>
            </div>
        </>
    )
}

export default CardProduct;