import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    card: {
        borderColor: '#ddd',
        borderRadius: 20,
        backgroundColor: "#D9D9D9",
        width: '90%',
        height: 120,
        flexDirection: 'row',
        padding: 8,
        position: 'relative'
    },
    cardTitle: {
        fontSize: 18,
        fontWeight: 'bold',
        paddingLeft: 5,
    },
    cardBody: {
        paddingLeft: 5,
    },
    info: {
        display: 'flex',
    },
    img: {
        borderRadius: 20,
        width: "100px",
        height: "100px",
        flexShrink: "0",
    },
    btnContainer: {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        position: 'absolute',
        bottom: 0,
        right: 0,
        padding: 8
    },
    btn: {
        width: "92px",
        height: "40px",
        borderRadius: 12,
        backgroundColor: "#CD1010",
        alignItems: 'center',
        justifyContent: 'center',
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