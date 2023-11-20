import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    card: {
        borderWidth: 1,
        borderRadius: 2,
        borderColor: '#ddd',
        marginLeft: 5,
        marginRight: 5,
        marginTop: 10,
        borderRadius: 20,
        backgroundColor: "#D9D9D9"
    },
    cardTitle: {
        fontSize: 18,
        fontWeight: 'bold',
        paddingLeft: 5,
    },
    cardBody: {
        paddingLeft: 5,
        fontSize: "1rem"
    },
    img: {
        borderRadius: 20,
        width: "305px",
        height: "170px",
        flexShrink: "0",
    },
    input: {
        backgroundColor: "white",
        width: "75px",
        height: "25px",
        marginLeft: "200px"
    }
});

export default styles;