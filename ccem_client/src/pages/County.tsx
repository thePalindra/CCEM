import { Box, Card, CardContent, CardMedia, Container, Typography } from '@mui/material';
import { useParams } from "react-router-dom";

const example_obj = {

    id: 12312,
    name: "Event",
    description: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti, pariatur atque fugit quos sequi molestias fugiat optio aliquam nemo quasi dolorum cupiditate dolores aspernatur eum accusamus alias delectus quibusdam reprehenderit?",
    space: [19.132, 39.124],
    timescope: "today",
    photo: "../../placeholder.png"
}


function Event({ event }) {
    const { id, name, description, timescope, photo } = event;
    return (
        <Card sx={{ marginBottom: '1rem' }}>
            <CardMedia
                component="img"
                height="300"
                image={photo}
                alt={name}
                sx={{ objectFit: 'cover' }}
            />
            <CardContent sx={{ display: 'flex', flexDirection: 'column' }}>
                <Typography variant="h5" component="div" sx={{ mb: 2, display: 'flex', justifyContent: 'space-between' }}>
                    <span className="fs-2">{name}</span>
                    <span className="fs-2">{timescope}</span>
                </Typography>
                <Typography variant="body1">{description}</Typography>
            </CardContent>
        </Card>
    );
}


export default function County() {
    const { county } = useParams();

    const backgroundImage = 'https://www.balealsurfcamp.com/content-files/uploads/2019/11/Baleal-beach-aereal-view-peniche-portugal.jpg';
    return (
        <Container>
            <Box
                sx={{
                    padding: '5rem',
                    marginTop: '2rem',
                    marginBottom: '2rem',
                    textAlign: 'center',
                    backgroundImage: `url(${backgroundImage})`,
                    backgroundSize: 'cover',
                    backgroundPosition: 'center',
                    borderRadius: '0.5rem',
                    position: 'relative',
                    height: 400,
                }}
            >
                <Box
                    sx={{
                        backgroundColor: 'rgba(0, 0, 0, 0.6)',
                        height: '100%',
                        display: 'flex',
                        alignItems: 'center',
                        justifyContent: 'center',
                        position: 'absolute',
                        top: 0,
                        left: 0,
                        right: 0,
                        bottom: 0,
                        borderRadius: '0.5rem',
                    }}
                >
                    <Box>
                        <Typography variant="h3" component="h3" color="white" gutterBottom>
                            {county}
                        </Typography>
                        <Typography variant="h4" component="h4" color="white" gutterBottom>
                            Zona Oeste
                        </Typography>
                    </Box>
                </Box>
            </Box>

            <Event event={example_obj} />
            <Event event={example_obj} />
            <Event event={example_obj} />
        </Container>
    );
}
