import type {Route} from "./+types/home";
import {NavLink} from "react-router";

export function meta({}: Route.MetaArgs) {
    return [
        {title: "Artifact UP"},
    ];
}

export default function Home() {
    return (
        <>
            <nav className="bg-blue-500 p-4 shadow-md">
                <div className="container mx-auto flex justify-between items-center">
                    <NavLink to="/" className="text-white text-xl font-semibold">
                        Home
                    </NavLink>
                </div>
            </nav>
            <main>
            </main>
        </>
    );
}
