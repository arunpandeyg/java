import { useState } from "react";
import "./App.css";
import Home from "./pages/Home";
import { Route, Routes } from "react-router-dom";
import BlogDetail from "./components/Blogs";
import Header from "./components/Header";
import Footer from "./components/Footer";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <div className="p-[20px]">
        {/* Header */}
        <Header />
        <Routes>
          <Route path="/" element={<Home />}></Route>
          <Route path="/blog-detail/:id" element={<BlogDetail />}></Route>
        </Routes>
      </div>
      {/* Footer */}
      <Footer />
    </>
  );
}

export default App;
