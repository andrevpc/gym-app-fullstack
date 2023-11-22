import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
    container: {
        width: '90%',
        height: 70,
        backgroundColor: '#B4B4B4',
        borderRadius: 20,
        padding: 8,
        display: 'flex',
        flexDirection: 'row',
        justifyContent: 'space-between',
        alignItems: 'center'
    },
    content: {
        width: 50,
        height: '100%',
        justifyContent: 'center',
        alignItems: 'center'
    },
    img: {
        width: 60,
        height: 60,
        resizeMode: 'center'
    },
    text: {
        fontWeight: 600,
        fontSize: 28,
        marginRight: 8
    }
});

export default styles;