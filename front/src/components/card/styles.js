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
    },
    img: {
        borderRadius: 20,
        width: "100px",
        height: "100px",
        flexShrink: "0",
    },
    btn: {
        width: "92px",
        height: "40px",
        borderRadius: "10px",
        backgroundColor: "#CD1010",
        alignItems: 'center',
        justifyContent: 'center',
        marginTop: "10px",
        marginLeft: "180px"
    },
    btnTxt: {
        color: "#FFF",
        fontFamily: "Inter",
        fontSize: "20px",
        fontStyle: "normal",
        fontWeight: 400,
        lineHeight: "normal",
    },
});

export default styles;