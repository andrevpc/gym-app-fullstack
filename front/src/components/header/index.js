import { View, Image, Text } from "react-native";
import styles from './styles';
const logo = require('../../../assets/logo.png');

export default function Header({ pageName }) {
    return (
        <View style={styles.container}>
            <Image source={logo} style={styles.img} />
            <Text style={styles.text}>{pageName}</Text>
        </View>
    )
}