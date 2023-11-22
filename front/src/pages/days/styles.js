import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    container: {
        width: '100vw',
        display: 'flex',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
        minHeight: '100vh',
        gap: 18,
        paddingTop: 20
    },
    card: {
        width: '80%',
        marginBottom: 10,
    },
    title: {
        fontSize: 18,
        fontWeight: 'bold',
    },
    text: {
        fontSize: 14,
        marginBottom: 10,
    },
    cardImage: {
        height: 100,
        width: '100%',
        resizeMode: 'cover',
    },
});

export default styles;