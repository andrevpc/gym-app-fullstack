import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import styles from "./styles";
import chestImg from '../../../assets/images/chest.webp'
import Card from '../../components/card';

const DaysPage = () => {
    console.log(sessionStorage.getItem("token"))
    const loadDays = (async () => {
        try {
            const res = await axios.post("http://localhost:8080/user", registerData);
            resetAll()
            props.navigation.navigate('login')
        } catch (error) {
            console.log(error)
        }
    });

    return (
        <View style={styles.container}>
            <Card title="Treino A" body="Peito e Tríceps" img={require("../../../assets/images/chest.webp")} />
            <Card title="Treino B" body="Costas e Bíceps" img={chestImg} />
        </View>
    );
};

export default DaysPage;