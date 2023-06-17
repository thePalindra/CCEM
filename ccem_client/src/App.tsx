import { Route, Routes } from 'react-router-dom'
import Home from './pages/Main'
import County from './pages/County'
import NavBar from './components/NavBar'
import Container from '@mui/material/Container/Container'

function App() {
    return (
        <Container maxWidth='md'>
            <NavBar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/:county" element={<County />} />
            </Routes>
        </Container>

    )
}

export default App



