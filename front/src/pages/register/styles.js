import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
    },
    title: {
        fontSize: 25,
        marginBottom: 10,
    },
    input: {
        width: "222px",
        height: "40px",
        borderRadius: "10px",
        backgroundColor: "#D9D9D9",
        zIndex: "1",
        marginTop: "10px"
    },
    footerView: {
        flexDirection: 'row',
        marginTop: 20,
    },
    footerText: {
        color: "#000",
        fontFamily: "Inter",
        fontSize: "12px",
        fontStyle: "normal",
        fontWeight: "400",
        lineHeight: "normal",
    },
    backgroundImage: {
        width: '100%',
        height: '100%',
        flex: 1,
        resizeMode: "cover",
        position: "absolute"
    },
    img: {
        width: "200px",
        height: "200px",
        flexShrink: "0",
    },
    centerDiv: {
        position: "absolute",
        top: 0,
        bottom: 0,
        left: 0,
        right: 0,
        margin: "auto",
        width: "263px",
        height: "446px",
        backgroundColor: "rgba(180, 180, 180, 0.39)"
    },
    btn: {
        width: "92px",
        height: "40px",
        borderRadius: "10px",
        backgroundColor: "#CD1010",
        alignItems: 'center',
        justifyContent: 'center',
        marginTop: "10px"
    },
    btnTxt: {
        color: "#FFF",
        fontFamily: "Inter",
        fontSize: "20px",
        fontStyle: "normal",
        fontWeight: 400,
        lineHeight: "normal",
    }
});

export default styles;