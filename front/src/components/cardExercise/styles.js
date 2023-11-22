import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    card: {
        width: '90%',
        borderColor: '#ddd',
        borderRadius: 20,
        backgroundColor: "#D9D9D9",
        paddingVertical: 8,
        paddingHorizontal: 12,
        display: 'flex',
        gap: 8
    },
    cardTitle: {
        fontSize: 18,
        fontWeight: 'bold',
    },
    cardBody: {
        paddingLeft: 5,
        fontSize: "1rem"
    },
    img: {
        borderRadius: 20,
        width: '100%',
        height: "170px",
        flexShrink: "0",
    },
    input: {
        backgroundColor: "white",
        width: "75px",
        height: "25px",
        borderRadius: 8
    },
    info: {
        width: '100%',
        display: 'flex',
        flexDirection: 'row',
        justifyContent: 'space-between',
        
    }
});

export default styles;